grammar ulNoActions;
options {
    backtrack=true;
}

@members
{
protected void mismatch (IntStream input, int ttype, BitSet follow)
        throws RecognitionException
{
        throw new MismatchedTokenException(ttype, input);
}
public void recoverFromMismatchedSet (IntStream input,
                                      RecognitionException e,
                                      BitSet follow)
        throws RecognitionException
{
        reportError(e);
        throw e;
}
}

@rulecatch {
        catch (RecognitionException ex) {
                reportError(ex);
                throw ex;
        }
}

/* Lexer */
program : function+
        ;

function : functionDecl functionBody
         ;

functionDecl : type identifier '(' formalParameters ')'
             ;

formalParameters : compoundType identifier formals*
                 |
                 ;

formals : ',' compoundType identifier
        ;

// TODO need to add option for compound thing
compoundType : TYPE
             | TYPE '[' INTEGERCONST ']'
             ;

functionBody : '{' varDec* statement* '}'
             ;

varDec : compoundType ID ';'
       ;

statement : ';'
          | expr ';'
          | 'print' expr ';'
          | 'println' expr ';'
          | ID '=' expr ';'
          | 'return' expr ';'
          | 'return' ';'
          | WHILE '(' expr ')' block
          | IF '(' expr ')' block ELSE block
          | IF '(' expr ')' block
          ;


block : '{' statement* '}'
      ;


exprList : expr exprMore
         |
         ;

exprMore : ',' expr
         ;

expr : ID '(' exprList ')'
     | ID
     | literal
     ;


identifier : ID
           ;


type  : TYPE
      ;


literal: STRINGCONST
       | INTEGERCONST
       | FLOATCONST
       | TRUE
       | FALSE
       ;

IF	: 'if'
    ;

WHILE : 'while'
      ;


ELSE : 'else'
     ;


TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;


TRUE:  'true'   ;
FALSE: 'false'  ;



INTEGERCONST : ('0'..'9')+
             ;

FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

//CHARCONST    : "'"('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')"'"
//             ;


STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;


ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;



WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;


COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
