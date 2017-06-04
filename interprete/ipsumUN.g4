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

optimizar :  '{' (fun_obj)+ sujeto   '}'
				;

fun_obj
  :  (op)+   parametro*  IGUAL   (MENOS)? DOUBLE   PTOCOMA
  ;
parametro: (MAS|MENOS)?   (DOUBLE)?   ID
;

  
  op : 'MAXIMIZAR'
  	   | 'MINIMIZAR'
  	   | 'SUJETO'
  	   ;
sujeto: op restricciones *;
  	   
restricciones
  : parametro* ROP  (MAS|MENOS)?  DOUBLE   ';'
  ;
  


condicional : 'si' expr ROP expr 'entonces' comandos 'fin_si';
repetiv		: 'repetir' expr 'veces' comandos 'fin_repetir';
impriexpr	: 'imprimir' expr PTOCOMA ;

expr:	expr MULOP expr
    |	expr MAS expr
    |	expr MENOS expr
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
MAS: '+';
MENOS: '-';
IGUAL:'=';

DOUBLE	: [0-9]+( | [.][0-9]+);
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;
