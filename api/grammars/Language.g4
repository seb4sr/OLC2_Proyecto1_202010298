grammar Language;

program: declaraciones*;

declaraciones: declaracion_variable 
			 | declaracion_funciones
			 | declaracion_structs
			 | declaracion_Fstructs
			 | stmt
;

declaracion_variable: 'var' ID tipo '=' expr ';'?	#DeclaracionVariableConValor
					| 'var'ID tipo ';'?				#DeclaracionVariableSinValor
					| ID ':=' expr ';'?				#DeclaracionImplicita

;
declaracion_structs: 'type' ID 'struct' '{' structBody* '}'
;
structBody : declaracion_variableStruct | declaracion_funciones
;
/*
structBody : declaracion_variable | declaracion_funciones
;*/
declaracion_variableStruct: tipo ID ';'?					

;


declaracion_Fstructs : 'func(' ID ID ')' ID '(' ')' '{' '}'
;

declaracion_funciones: 'func' ID '(' parametros? ')' '{' declaraciones* '}';

parametros: ID tipo ( ',' ID tipo)*;

stmt: expr 																	# Expresion 
	| 'fmt.Println(' expr (',' expr)* ')' ';'?										# FmtPrint 
	| '{' declaraciones* '}'												# Bloque
	| 'if' expr  stmt ('else' stmt)?										# If
	| 'for'  expr  stmt														# ForCond
	| 'for'  inicializacionesfor ';' expr ';' expr stmt						# For
	| 'break' 	';'?																# Break
	| 'continue' ';'?																# Continue
	| 'return' expr? 	';'?														# Return
	;

inicializacionesfor : declaracion_variable | expr ;

tipo: 'int'      # TipoInt
    | 'float64'  # TipoFloat
    | 'string'   # TipoString
    | 'bool'     # TipoBool
    | 'rune'     # TipoRune
;

call: '(' atri? ')' # FunCall | '.' ID #Get
;

atri: expr (',' expr)*;

expr:
	'-' expr										# Negacion
	|'!' expr										# Not
	| expr call+									# CallExpr
	| ID '++' 										# Incre
	| ID '--' 										# Decre
	| expr op = ('*' | '/' | '%') expr				# MulDivMod
	| expr op = ('+' | '-') expr					# SumRes
	| expr op = ('>' | '<' | '>=' | '<=') expr		# Relacionales
	| expr op = ('==' | '!=') expr					# Igualdad
	| expr '&&' expr								# And
	| expr '||' expr								# Or
	| expr '=' expr									# Asignacion
	| BOOL		';'?										# Boolean
	| FLOAT 	';'?										# Float
	| STRING	';'?										# String
	| RUNE	';'?											# Rune
	| INT	';'?											# Entero
	| 'new' ID '(' atri? ')'						# Instancia
	| ID											# Id
	| '(' expr ')'									# Parentesis
	;




INT: [0-9]+;
BOOL: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~'"'* '"';
RUNE: '\''  ~'\'' '\'';
WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z0-9_]+;
COMENTARIO: '//' ~[\r\n]* -> skip;
COMENTARIOMULTILINEA: '/*' .*? '*/' -> skip;