grammar ulNoActions;
				
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

program: expression ;


expression : expressionT expressionP
           | id
           | literal
           ;

expressionT : expressionF expressionT ;

expressionP : op expressionT expressionP
            |
            ;


expressionF : '(' expression ')'
            | id
            |
            ;

id: 'abc';

literal: 'int'
       | 'string'
       ;

op: '+'
  | '-'
  | '=='
  | '<'
  | '*'
  ;

WS : (' '|'\t'|'\n'|'\r')+ {skip();} ;

