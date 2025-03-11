grammar Language;

program: declaraciones*;

declaraciones: declaracion_variable | stmt;

declaracion_variable: 'var' ID expr '=' expr ';';

stmt: expr ';' # Expresion | 'fmt.Println(' expr ')' ';' # FmtPrint;


expr:
	'-' expr						# Negacion
	| expr op = ('*' | '/') expr	# MulDiv
	| expr op = ('+' | '-') expr	# SumRes
	| expr op = ('>' | '<' | '>=' | '<=') expr	# Relacioanles
	| expr op = ('==' | '!=') expr				# Igualdad
	| ID '=' expr					# Asignacion
	| BOOL							# Boolean
	| FLOAT 						# Float
	| STRING						# String
	| RUNE							# Rune
	| INT							# Entero
	| ID							# Id
	| '(' expr ')'					# Parentesis;

INT: [0-9]+;
BOOL: 'true' | 'false';
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' ~'"'* '"';
RUNE: '\''  ~'\'' '\'';
WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z]+;