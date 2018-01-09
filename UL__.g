lexer grammar UL;

T23 : '(' ;
T24 : ')' ;
T25 : ',' ;
T26 : '[' ;
T27 : ']' ;
T28 : '{' ;
T29 : '}' ;
T30 : ';' ;
T31 : 'print' ;
T32 : 'println' ;
T33 : '=' ;
T34 : 'return' ;
T35 : '*' ;
T36 : '+' ;
T37 : '-' ;
T38 : '<' ;
T39 : '==' ;

// $ANTLR src "UL.g" 124
IF	: 'if'
    ;

// $ANTLR src "UL.g" 127
WHILE : 'while'
      ;

// $ANTLR src "UL.g" 130
ELSE : 'else'
     ;

// $ANTLR src "UL.g" 133
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

// $ANTLR src "UL.g" 141
TRUE:  'true'   ;
// $ANTLR src "UL.g" 142
FALSE: 'false'  ;

// $ANTLR src "UL.g" 144
INTEGERCONST : ('0'..'9')+
             ;

// $ANTLR src "UL.g" 147
FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

// $ANTLR src "UL.g" 150
CHARCONST    : '\''('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')'\''
             ;

// $ANTLR src "UL.g" 153
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

// $ANTLR src "UL.g" 156
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

// $ANTLR src "UL.g" 159
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "UL.g" 162
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
