// $ANTLR 3.0.1 ulNoActions.g 2018-01-05 23:56:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ulNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "ID", "STRINGCONST", "INTEGERCONST", "TRUE", "FALSE", "IF", "WS", "COMMENT", "'('", "')'", "','", "'{'", "'}'", "';'", "'print'", "'='"
    };
    public static final int INTEGERCONST=7;
    public static final int TRUE=8;
    public static final int COMMENT=12;
    public static final int STRINGCONST=6;
    public static final int FALSE=9;
    public static final int ID=5;
    public static final int WS=11;
    public static final int EOF=-1;
    public static final int TYPE=4;
    public static final int IF=10;

        public ulNoActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[25+1];
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
    // ulNoActions.g:31:1: program : ( function )+ ;
    public final void program() throws RecognitionException {
        try {
            // ulNoActions.g:31:9: ( ( function )+ )
            // ulNoActions.g:31:11: ( function )+
            {
            // ulNoActions.g:31:11: ( function )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ulNoActions.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program37);
            	    function();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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


    // $ANTLR start function
    // ulNoActions.g:34:1: function : functionDecl functionBody ;
    public final void function() throws RecognitionException {
        try {
            // ulNoActions.g:34:10: ( functionDecl functionBody )
            // ulNoActions.g:34:12: functionDecl functionBody
            {
            pushFollow(FOLLOW_functionDecl_in_function55);
            functionDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_functionBody_in_function57);
            functionBody();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end function


    // $ANTLR start functionDecl
    // ulNoActions.g:37:1: functionDecl : type identifier '(' formalParameters ')' ;
    public final void functionDecl() throws RecognitionException {
        try {
            // ulNoActions.g:37:14: ( type identifier '(' formalParameters ')' )
            // ulNoActions.g:37:16: type identifier '(' formalParameters ')'
            {
            pushFollow(FOLLOW_type_in_functionDecl75);
            type();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_identifier_in_functionDecl77);
            identifier();
            _fsp--;
            if (failed) return ;
            match(input,13,FOLLOW_13_in_functionDecl79); if (failed) return ;
            pushFollow(FOLLOW_formalParameters_in_functionDecl81);
            formalParameters();
            _fsp--;
            if (failed) return ;
            match(input,14,FOLLOW_14_in_functionDecl83); if (failed) return ;

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
    // $ANTLR end functionDecl


    // $ANTLR start formalParameters
    // ulNoActions.g:40:1: formalParameters : ( compoundType identifier ( formals )* | );
    public final void formalParameters() throws RecognitionException {
        try {
            // ulNoActions.g:40:18: ( compoundType identifier ( formals )* | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("40:1: formalParameters : ( compoundType identifier ( formals )* | );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ulNoActions.g:40:20: compoundType identifier ( formals )*
                    {
                    pushFollow(FOLLOW_compoundType_in_formalParameters105);
                    compoundType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_identifier_in_formalParameters107);
                    identifier();
                    _fsp--;
                    if (failed) return ;
                    // ulNoActions.g:40:44: ( formals )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ulNoActions.g:0:0: formals
                    	    {
                    	    pushFollow(FOLLOW_formals_in_formalParameters109);
                    	    formals();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ulNoActions.g:42:18: 
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
    // $ANTLR end formalParameters


    // $ANTLR start formals
    // ulNoActions.g:44:1: formals : ',' compoundType identifier ;
    public final void formals() throws RecognitionException {
        try {
            // ulNoActions.g:44:9: ( ',' compoundType identifier )
            // ulNoActions.g:44:11: ',' compoundType identifier
            {
            match(input,15,FOLLOW_15_in_formals155); if (failed) return ;
            pushFollow(FOLLOW_compoundType_in_formals157);
            compoundType();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_identifier_in_formals159);
            identifier();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end formals


    // $ANTLR start compoundType
    // ulNoActions.g:48:1: compoundType : TYPE ;
    public final void compoundType() throws RecognitionException {
        try {
            // ulNoActions.g:48:14: ( TYPE )
            // ulNoActions.g:48:16: TYPE
            {
            match(input,TYPE,FOLLOW_TYPE_in_compoundType177); if (failed) return ;

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
    // $ANTLR end compoundType


    // $ANTLR start functionBody
    // ulNoActions.g:51:1: functionBody : '{' ( varDec )* ( statement )* '}' ;
    public final void functionBody() throws RecognitionException {
        try {
            // ulNoActions.g:51:14: ( '{' ( varDec )* ( statement )* '}' )
            // ulNoActions.g:51:16: '{' ( varDec )* ( statement )* '}'
            {
            match(input,16,FOLLOW_16_in_functionBody199); if (failed) return ;
            // ulNoActions.g:51:20: ( varDec )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==TYPE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:0:0: varDec
            	    {
            	    pushFollow(FOLLOW_varDec_in_functionBody201);
            	    varDec();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ulNoActions.g:51:28: ( statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ID && LA5_0<=FALSE)||(LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ulNoActions.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody204);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_functionBody207); if (failed) return ;

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
    // $ANTLR end functionBody


    // $ANTLR start varDec
    // ulNoActions.g:54:1: varDec : compoundType ID ';' ;
    public final void varDec() throws RecognitionException {
        try {
            // ulNoActions.g:54:8: ( compoundType ID ';' )
            // ulNoActions.g:54:10: compoundType ID ';'
            {
            pushFollow(FOLLOW_compoundType_in_varDec229);
            compoundType();
            _fsp--;
            if (failed) return ;
            match(input,ID,FOLLOW_ID_in_varDec231); if (failed) return ;
            match(input,18,FOLLOW_18_in_varDec233); if (failed) return ;

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
    // $ANTLR end varDec


    // $ANTLR start statement
    // ulNoActions.g:57:1: statement : ( ';' | expr | 'print' expr | ID '=' expr );
    public final void statement() throws RecognitionException {
        try {
            // ulNoActions.g:57:11: ( ';' | expr | 'print' expr | ID '=' expr )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==20) ) {
                    alt6=4;
                }
                else if ( (LA6_2==EOF||(LA6_2>=ID && LA6_2<=FALSE)||(LA6_2>=17 && LA6_2<=19)) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("57:1: statement : ( ';' | expr | 'print' expr | ID '=' expr );", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRINGCONST:
            case INTEGERCONST:
            case TRUE:
            case FALSE:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("57:1: statement : ( ';' | expr | 'print' expr | ID '=' expr );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ulNoActions.g:57:13: ';'
                    {
                    match(input,18,FOLLOW_18_in_statement249); if (failed) return ;

                    }
                    break;
                case 2 :
                    // ulNoActions.g:58:13: expr
                    {
                    pushFollow(FOLLOW_expr_in_statement263);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // ulNoActions.g:59:13: 'print' expr
                    {
                    match(input,19,FOLLOW_19_in_statement277); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement279);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // ulNoActions.g:60:13: ID '=' expr
                    {
                    match(input,ID,FOLLOW_ID_in_statement293); if (failed) return ;
                    match(input,20,FOLLOW_20_in_statement295); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement297);
                    expr();
                    _fsp--;
                    if (failed) return ;

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
    // $ANTLR end statement


    // $ANTLR start expr
    // ulNoActions.g:63:1: expr : ( ID | literal );
    public final void expr() throws RecognitionException {
        try {
            // ulNoActions.g:63:6: ( ID | literal )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=STRINGCONST && LA7_0<=FALSE)) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("63:1: expr : ( ID | literal );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ulNoActions.g:63:8: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr316); if (failed) return ;

                    }
                    break;
                case 2 :
                    // ulNoActions.g:64:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_expr325);
                    literal();
                    _fsp--;
                    if (failed) return ;

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
    // $ANTLR end expr


    // $ANTLR start identifier
    // ulNoActions.g:67:1: identifier : ID ;
    public final void identifier() throws RecognitionException {
        try {
            // ulNoActions.g:67:12: ( ID )
            // ulNoActions.g:67:14: ID
            {
            match(input,ID,FOLLOW_ID_in_identifier339); if (failed) return ;

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
    // $ANTLR end identifier


    // $ANTLR start type
    // ulNoActions.g:70:1: type : TYPE ;
    public final void type() throws RecognitionException {
        try {
            // ulNoActions.g:70:7: ( TYPE )
            // ulNoActions.g:70:9: TYPE
            {
            match(input,TYPE,FOLLOW_TYPE_in_type360); if (failed) return ;

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
    // $ANTLR end type


    // $ANTLR start literal
    // ulNoActions.g:73:1: literal : ( STRINGCONST | INTEGERCONST | TRUE | FALSE );
    public final void literal() throws RecognitionException {
        try {
            // ulNoActions.g:73:8: ( STRINGCONST | INTEGERCONST | TRUE | FALSE )
            // ulNoActions.g:
            {
            if ( (input.LA(1)>=STRINGCONST && input.LA(1)<=FALSE) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
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


 

    public static final BitSet FOLLOW_function_in_program37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_functionDecl_in_function55 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_functionBody_in_function57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_functionDecl75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_functionDecl77 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDecl79 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalParameters_in_functionDecl81 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDecl83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_formalParameters105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_formalParameters107 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_formals_in_formalParameters109 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_formals155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundType_in_formals157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_formals159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_functionBody199 = new BitSet(new long[]{0x00000000000E03F0L});
    public static final BitSet FOLLOW_varDec_in_functionBody201 = new BitSet(new long[]{0x00000000000E03F0L});
    public static final BitSet FOLLOW_statement_in_functionBody204 = new BitSet(new long[]{0x00000000000E03E0L});
    public static final BitSet FOLLOW_17_in_functionBody207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_varDec229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_varDec231 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_varDec233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_statement277 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_expr_in_statement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement293 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement295 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_expr_in_statement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expr325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}