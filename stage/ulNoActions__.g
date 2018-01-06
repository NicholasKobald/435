lexer grammar ulNoActions;

T13 : '(' ;
T14 : ')' ;
T15 : ',' ;
T16 : '{' ;
T17 : '}' ;
T18 : ';' ;
T19 : 'print' ;
T20 : '=' ;
T21 : 'return' ;

// $ANTLR src "ulNoActions.g" 77
IF	: 'if'
    ;

// $ANTLR src "ulNoActions.g" 80
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

// $ANTLR src "ulNoActions.g" 88
TRUE:  'true'   ;
// $ANTLR src "ulNoActions.g" 89
FALSE: 'false'  ;

// $ANTLR src "ulNoActions.g" 91
INTEGERCONST : ('0'..'9')+
             ;

//CHARCONST    : "'"('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')"'"
//             ;


// $ANTLR src "ulNoActions.g" 98
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

// $ANTLR src "ulNoActions.g" 101
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;


// $ANTLR src "ulNoActions.g" 105
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "ulNoActions.g" 108
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
