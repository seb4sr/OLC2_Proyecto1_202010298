grammar Language;

program: declaraciones*;

declaraciones: declaracion_variable | stmt;

declaracion_variable: 'var' ID tipo '=' expr  	#DeclaracionVariableConValor
					| 'var'ID tipo 				#DeclaracionVariableSinValor
					| ID ':=' expr 				#DeclaracionImplicita
;

stmt: expr 																	# Expresion 
	| 'fmt.Println(' expr (',' expr)* ')' 									# FmtPrint 
	| '{' declaraciones* '}'												# Bloque
	| 'if' expr  stmt ('else' stmt)?										# If
	| 'for'  expr  stmt														# ForCond
	| 'for'  inicializacionesfor ';' expr ';' expr stmt						# For
	| 'break' 																# Break
	| 'continue' 															# Continue
	| 'return' expr? 														# Return
	;

inicializacionesfor : declaracion_variable | expr ;

tipo: 'int'      # TipoInt
    | 'float64'  # TipoFloat
    | 'string'   # TipoString
    | 'bool'     # TipoBool
    | 'rune'     # TipoRune
;

call: '(' atri? ')';
atri: expr (',' expr)*;

expr:
	'-' expr										# Negacion
	|'!' expr										# Not
	| expr call+						# CallExpr
	| ID '++' 										# Incre
	| ID '--' 										# Decre
	| expr op = ('*' | '/' | '%') expr				# MulDivMod
	| expr op = ('+' | '-') expr					# SumRes
	| expr op = ('>' | '<' | '>=' | '<=') expr		# Relacionales
	| expr op = ('==' | '!=') expr					# Igualdad
	| expr '&&' expr								# And
	| expr '||' expr								# Or
	| ID '=' expr									# Asignacion
	| BOOL											# Boolean
	| FLOAT 										# Float
	| STRING										# String
	| RUNE											# Rune
	| INT											# Entero
	| ID											# Id
	| '(' expr ')'									# Parentesis;




INT: [0-9]+;
BOOL: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~'"'* '"';
RUNE: '\''  ~'\'' '\'';
WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z]+;