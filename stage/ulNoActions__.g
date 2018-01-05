lexer grammar ulNoActions;

T5 : '(' ;
T6 : ')' ;
T7 : 'abc' ;
T8 : 'int' ;
T9 : 'string' ;
T10 : '+' ;
T11 : '-' ;
T12 : '==' ;
T13 : '<' ;
T14 : '*' ;

// $ANTLR src "ulNoActions.g" 61
WS : (' '|'\t'|'\n'|'\r')+ {skip();} ;

