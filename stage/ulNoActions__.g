lexer grammar ulNoActions;

T13 : '(' ;
T14 : ')' ;
T15 : ',' ;
T16 : '{' ;
T17 : '}' ;
T18 : ';' ;
T19 : 'print' ;
T20 : '=' ;

// $ANTLR src "ulNoActions.g" 79
IF	: 'if'
    ;

// $ANTLR src "ulNoActions.g" 82
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

// $ANTLR src "ulNoActions.g" 90
TRUE:  'true'   ;
// $ANTLR src "ulNoActions.g" 91
FALSE: 'false'  ;

// $ANTLR src "ulNoActions.g" 93
INTEGERCONST : ('0'..'9')+
             ;

//CHARCONST    : "'"('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')"'"
//             ;


// $ANTLR src "ulNoActions.g" 100
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

// $ANTLR src "ulNoActions.g" 103
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;


// $ANTLR src "ulNoActions.g" 107
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "ulNoActions.g" 110
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
