grammar ipsumUN;		

principal 	: ID '{' comandos '}'
		;

comandos	: comando comandos
			| EOF
			|
			;

comando 	: condicional
			| repetiv
			| impriexpr 
			| DEFINIR ID 'como' expr PTOCOMA
			| optimizar
			;

optimizar :  '{' (fun_obj)+ sujeto  restricciones* '}'
				;

fun_obj
  :  (op)+  ('-')?   (DOUBLE)?    ID    ('+'|'-')?   (DOUBLE)?   ID  '='   '0'   ';'
  ;
  
  op : 'MAXIMIZAR'
  	   | 'MINIMIZAR'
  	   ;
sujeto: 'SUJETO' restricciones *;
  	   
restricciones
  :  ('-')?   (DOUBLE)?    ID    (('+'|'-')?   (DOUBLE)?   ID )* ROP   DOUBLE   ';'
  ;
  


condicional : 'si' expr ROP expr 'entonces' comandos 'fin_si';
repetiv		: 'repetir' expr 'veces' comandos 'fin_repetir';
impriexpr	: 'imprimir' expr PTOCOMA ;

expr:	expr MULOP expr
    |	expr SUMOP expr
    |	DOUBLE
    |	PIZQ expr PDER
    | 	ID
    ;

COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;
DEFINIR		: 'definir';
PIZQ	: '(' ;
PDER	: ')' ;
ROP		: ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
PTOCOMA : ';' ;
MULOP	: ( '*' | '/' );
SUMOP	: ('+' | '-') ;
DOUBLE	: [0-9]+( | [.][0-9]+);
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;

