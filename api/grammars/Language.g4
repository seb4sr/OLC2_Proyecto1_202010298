grammar Language;

program: declaraciones*;

declaraciones: declaracion_variable | stmt;

declaracion_variable: 'var' ID tipo '=' expr ';' 	#DeclaracionVariableConValor
					| 'var'ID tipo ';' 				#DeclaracionVariableSinValor
					| ID ':=' expr ';'				#DeclaracionImplicita
;

stmt: expr ';' 											# Expresion 
	| 'fmt.Println(' expr ')' ';' 						# FmtPrint
	| '{' declaraciones* '}'							# Bloque
	| 'if' '(' expr ')' stmt ('else' stmt)?				# If
	| 'while' '(' expr ')' stmt							# While
	;

tipo: 'int'      # TipoInt
    | 'float64'  # TipoFloat
    | 'string'   # TipoString
    | 'bool'     # TipoBool
    | 'rune'     # TipoRune
;


expr:
	'-' expr										# Negacion
	| expr op = ('*' | '/' | '%') expr				# MulDivMod
	| expr op = ('+' | '-') expr					# SumRes
	| expr op = ('>' | '<' | '>=' | '<=') expr		# Relacionales
	| expr op = ('==' | '!=') expr					# Igualdad
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