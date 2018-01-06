lexer grammar ulNoActions;

T16 : '(' ;
T17 : ')' ;
T18 : ',' ;
T19 : '[' ;
T20 : ']' ;
T21 : '{' ;
T22 : '}' ;
T23 : ';' ;
T24 : 'print' ;
T25 : 'println' ;
T26 : '=' ;
T27 : 'return' ;

// $ANTLR src "ulNoActions.g" 103
IF	: 'if'
    ;

// $ANTLR src "ulNoActions.g" 106
WHILE : 'while'
      ;


// $ANTLR src "ulNoActions.g" 110
ELSE : 'else'
     ;


// $ANTLR src "ulNoActions.g" 114
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;


// $ANTLR src "ulNoActions.g" 123
TRUE:  'true'   ;
// $ANTLR src "ulNoActions.g" 124
FALSE: 'false'  ;



// $ANTLR src "ulNoActions.g" 128
INTEGERCONST : ('0'..'9')+
             ;

// $ANTLR src "ulNoActions.g" 131
FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

//CHARCONST    : "'"('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')"'"
//             ;


// $ANTLR src "ulNoActions.g" 138
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;


// $ANTLR src "ulNoActions.g" 142
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;



// $ANTLR src "ulNoActions.g" 147
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;


// $ANTLR src "ulNoActions.g" 151
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
