// $ANTLR 3.0.1 ulNoActions.g 2018-01-05 01:24:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "'('", "')'", "'abc'", "'int'", "'string'", "'+'", "'-'", "'=='", "'<'", "'*'"
    };
    public static final int WS=4;
    public static final int EOF=-1;

        public ulNoActionsParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "ulNoActions.g"; }


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



    // $ANTLR start program
    // ulNoActions.g:29:1: program : expression ;
    public final void program() throws RecognitionException {
        try {
            // ulNoActions.g:29:8: ( expression )
            // ulNoActions.g:29:10: expression
            {
            pushFollow(FOLLOW_expression_in_program28);
            expression();
            _fsp--;


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end program


    // $ANTLR start expression
    // ulNoActions.g:32:1: expression : ( expressionT expressionP | id | literal );
    public final void expression() throws RecognitionException {
        try {
            // ulNoActions.g:32:12: ( expressionT expressionP | id | literal )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                {
                alt1=1;
                }
                break;
            case 7:
                {
                alt1=2;
                }
                break;
            case 8:
            case 9:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("32:1: expression : ( expressionT expressionP | id | literal );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ulNoActions.g:32:14: expressionT expressionP
                    {
                    pushFollow(FOLLOW_expressionT_in_expression38);
                    expressionT();
                    _fsp--;

                    pushFollow(FOLLOW_expressionP_in_expression40);
                    expressionP();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ulNoActions.g:33:14: id
                    {
                    pushFollow(FOLLOW_id_in_expression55);
                    id();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // ulNoActions.g:34:14: literal
                    {
                    pushFollow(FOLLOW_literal_in_expression70);
                    literal();
                    _fsp--;


                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end expression


    // $ANTLR start expressionP
    // ulNoActions.g:37:1: expressionP : ( op expressionT expressionP | );
    public final void expressionP() throws RecognitionException {
        try {
            // ulNoActions.g:37:13: ( op expressionT expressionP | )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=10 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==6) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("37:1: expressionP : ( op expressionT expressionP | );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ulNoActions.g:37:15: op expressionT expressionP
                    {
                    pushFollow(FOLLOW_op_in_expressionP90);
                    op();
                    _fsp--;

                    pushFollow(FOLLOW_expressionT_in_expressionP92);
                    expressionT();
                    _fsp--;

                    pushFollow(FOLLOW_expressionP_in_expressionP94);
                    expressionP();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ulNoActions.g:39:13: 
                    {
                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end expressionP


    // $ANTLR start expressionT
    // ulNoActions.g:41:1: expressionT : op expressionF expressionT ;
    public final void expressionT() throws RecognitionException {
        try {
            // ulNoActions.g:41:13: ( op expressionF expressionT )
            // ulNoActions.g:41:15: op expressionF expressionT
            {
            pushFollow(FOLLOW_op_in_expressionT129);
            op();
            _fsp--;

            pushFollow(FOLLOW_expressionF_in_expressionT131);
            expressionF();
            _fsp--;

            pushFollow(FOLLOW_expressionT_in_expressionT133);
            expressionT();
            _fsp--;


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end expressionT


    // $ANTLR start expressionF
    // ulNoActions.g:43:1: expressionF : ( '(' expression ')' | id | );
    public final void expressionF() throws RecognitionException {
        try {
            // ulNoActions.g:43:13: ( '(' expression ')' | id | )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 5:
                {
                alt3=1;
                }
                break;
            case 7:
                {
                alt3=2;
                }
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("43:1: expressionF : ( '(' expression ')' | id | );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ulNoActions.g:43:15: '(' expression ')'
                    {
                    match(input,5,FOLLOW_5_in_expressionF142); 
                    pushFollow(FOLLOW_expression_in_expressionF144);
                    expression();
                    _fsp--;

                    match(input,6,FOLLOW_6_in_expressionF146); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:44:15: id
                    {
                    pushFollow(FOLLOW_id_in_expressionF162);
                    id();
                    _fsp--;


                    }
                    break;
                case 3 :
                    // ulNoActions.g:46:13: 
                    {
                    }
                    break;

            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end expressionF


    // $ANTLR start id
    // ulNoActions.g:48:1: id : 'abc' ;
    public final void id() throws RecognitionException {
        try {
            // ulNoActions.g:48:3: ( 'abc' )
            // ulNoActions.g:48:5: 'abc'
            {
            match(input,7,FOLLOW_7_in_id196); 

            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end id


    // $ANTLR start literal
    // ulNoActions.g:50:1: literal : ( 'int' | 'string' );
    public final void literal() throws RecognitionException {
        try {
            // ulNoActions.g:50:8: ( 'int' | 'string' )
            // ulNoActions.g:
            {
            if ( (input.LA(1)>=8 && input.LA(1)<=9) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_literal0);    throw mse;
            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end literal


    // $ANTLR start op
    // ulNoActions.g:54:1: op : ( '+' | '-' | '==' | '<' | '*' );
    public final void op() throws RecognitionException {
        try {
            // ulNoActions.g:54:3: ( '+' | '-' | '==' | '<' | '*' )
            // ulNoActions.g:
            {
            if ( (input.LA(1)>=10 && input.LA(1)<=14) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_op0);    throw mse;
            }


            }

        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return ;
    }
    // $ANTLR end op


 

    public static final BitSet FOLLOW_expression_in_program28 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionT_in_expression38 = new BitSet(new long[]{0x0000000000007C02L});
    public static final BitSet FOLLOW_expressionP_in_expression40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_expression55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expression70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_expressionP90 = new BitSet(new long[]{0x0000000000007C00L});
    public static final BitSet FOLLOW_expressionT_in_expressionP92 = new BitSet(new long[]{0x0000000000007C00L});
    public static final BitSet FOLLOW_expressionP_in_expressionP94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_in_expressionT129 = new BitSet(new long[]{0x0000000000007CA0L});
    public static final BitSet FOLLOW_expressionF_in_expressionT131 = new BitSet(new long[]{0x0000000000007C00L});
    public static final BitSet FOLLOW_expressionT_in_expressionT133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_expressionF142 = new BitSet(new long[]{0x0000000000007F80L});
    public static final BitSet FOLLOW_expression_in_expressionF144 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_expressionF146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_expressionF162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_id196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_op0 = new BitSet(new long[]{0x0000000000000002L});

}