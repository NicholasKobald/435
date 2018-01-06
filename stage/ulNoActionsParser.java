// $ANTLR 3.0.1 ulNoActions.g 2018-01-06 00:48:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "ID", "STRINGCONST", "INTEGERCONST", "TRUE", "FALSE", "IF", "WS", "COMMENT", "'('", "')'", "','", "'{'", "'}'", "';'", "'print'", "'='", "'return'"
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
    // ulNoActions.g:28:1: program : ( function )+ ;
    public final void program() throws RecognitionException {
        try {
            // ulNoActions.g:28:9: ( ( function )+ )
            // ulNoActions.g:28:11: ( function )+
            {
            // ulNoActions.g:28:11: ( function )+
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
            	    // ulNoActions.g:28:11: function
            	    {
            	    pushFollow(FOLLOW_function_in_program24);
            	    function();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
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
    // ulNoActions.g:31:1: function : functionDecl functionBody ;
    public final void function() throws RecognitionException {
        try {
            // ulNoActions.g:31:10: ( functionDecl functionBody )
            // ulNoActions.g:31:12: functionDecl functionBody
            {
            pushFollow(FOLLOW_functionDecl_in_function42);
            functionDecl();
            _fsp--;

            pushFollow(FOLLOW_functionBody_in_function44);
            functionBody();
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
    // $ANTLR end function


    // $ANTLR start functionDecl
    // ulNoActions.g:34:1: functionDecl : type identifier '(' formalParameters ')' ;
    public final void functionDecl() throws RecognitionException {
        try {
            // ulNoActions.g:34:14: ( type identifier '(' formalParameters ')' )
            // ulNoActions.g:34:16: type identifier '(' formalParameters ')'
            {
            pushFollow(FOLLOW_type_in_functionDecl62);
            type();
            _fsp--;

            pushFollow(FOLLOW_identifier_in_functionDecl64);
            identifier();
            _fsp--;

            match(input,13,FOLLOW_13_in_functionDecl66); 
            pushFollow(FOLLOW_formalParameters_in_functionDecl68);
            formalParameters();
            _fsp--;

            match(input,14,FOLLOW_14_in_functionDecl70); 

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
    // ulNoActions.g:37:1: formalParameters : ( compoundType identifier ( formals )* | );
    public final void formalParameters() throws RecognitionException {
        try {
            // ulNoActions.g:37:18: ( compoundType identifier ( formals )* | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("37:1: formalParameters : ( compoundType identifier ( formals )* | );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ulNoActions.g:37:20: compoundType identifier ( formals )*
                    {
                    pushFollow(FOLLOW_compoundType_in_formalParameters92);
                    compoundType();
                    _fsp--;

                    pushFollow(FOLLOW_identifier_in_formalParameters94);
                    identifier();
                    _fsp--;

                    // ulNoActions.g:37:44: ( formals )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ulNoActions.g:37:44: formals
                    	    {
                    	    pushFollow(FOLLOW_formals_in_formalParameters96);
                    	    formals();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ulNoActions.g:39:18: 
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
    // ulNoActions.g:41:1: formals : ',' compoundType identifier ;
    public final void formals() throws RecognitionException {
        try {
            // ulNoActions.g:41:9: ( ',' compoundType identifier )
            // ulNoActions.g:41:11: ',' compoundType identifier
            {
            match(input,15,FOLLOW_15_in_formals142); 
            pushFollow(FOLLOW_compoundType_in_formals144);
            compoundType();
            _fsp--;

            pushFollow(FOLLOW_identifier_in_formals146);
            identifier();
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
    // $ANTLR end formals


    // $ANTLR start compoundType
    // ulNoActions.g:45:1: compoundType : TYPE ;
    public final void compoundType() throws RecognitionException {
        try {
            // ulNoActions.g:45:14: ( TYPE )
            // ulNoActions.g:45:16: TYPE
            {
            match(input,TYPE,FOLLOW_TYPE_in_compoundType164); 

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
    // ulNoActions.g:48:1: functionBody : '{' ( varDec )* ( statement )* '}' ;
    public final void functionBody() throws RecognitionException {
        try {
            // ulNoActions.g:48:14: ( '{' ( varDec )* ( statement )* '}' )
            // ulNoActions.g:48:16: '{' ( varDec )* ( statement )* '}'
            {
            match(input,16,FOLLOW_16_in_functionBody186); 
            // ulNoActions.g:48:20: ( varDec )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==TYPE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:48:20: varDec
            	    {
            	    pushFollow(FOLLOW_varDec_in_functionBody188);
            	    varDec();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ulNoActions.g:48:28: ( statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=ID && LA5_0<=FALSE)||(LA5_0>=18 && LA5_0<=19)||LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ulNoActions.g:48:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody191);
            	    statement();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_functionBody194); 

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
    // ulNoActions.g:51:1: varDec : compoundType ID ';' ;
    public final void varDec() throws RecognitionException {
        try {
            // ulNoActions.g:51:8: ( compoundType ID ';' )
            // ulNoActions.g:51:10: compoundType ID ';'
            {
            pushFollow(FOLLOW_compoundType_in_varDec216);
            compoundType();
            _fsp--;

            match(input,ID,FOLLOW_ID_in_varDec218); 
            match(input,18,FOLLOW_18_in_varDec220); 

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
    // ulNoActions.g:54:1: statement : ( ';' | expr ';' | 'print' expr ';' | ID '=' expr ';' | 'return' ';' );
    public final void statement() throws RecognitionException {
        try {
            // ulNoActions.g:54:11: ( ';' | expr ';' | 'print' expr ';' | ID '=' expr ';' | 'return' ';' )
            int alt6=5;
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
                else if ( (LA6_2==18) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("54:1: statement : ( ';' | expr ';' | 'print' expr ';' | ID '=' expr ';' | 'return' ';' );", 6, 2, input);

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
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("54:1: statement : ( ';' | expr ';' | 'print' expr ';' | ID '=' expr ';' | 'return' ';' );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ulNoActions.g:54:13: ';'
                    {
                    match(input,18,FOLLOW_18_in_statement236); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:55:13: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement250);
                    expr();
                    _fsp--;

                    match(input,18,FOLLOW_18_in_statement252); 

                    }
                    break;
                case 3 :
                    // ulNoActions.g:56:13: 'print' expr ';'
                    {
                    match(input,19,FOLLOW_19_in_statement266); 
                    pushFollow(FOLLOW_expr_in_statement268);
                    expr();
                    _fsp--;

                    match(input,18,FOLLOW_18_in_statement270); 

                    }
                    break;
                case 4 :
                    // ulNoActions.g:57:13: ID '=' expr ';'
                    {
                    match(input,ID,FOLLOW_ID_in_statement284); 
                    match(input,20,FOLLOW_20_in_statement286); 
                    pushFollow(FOLLOW_expr_in_statement288);
                    expr();
                    _fsp--;

                    match(input,18,FOLLOW_18_in_statement290); 

                    }
                    break;
                case 5 :
                    // ulNoActions.g:58:13: 'return' ';'
                    {
                    match(input,21,FOLLOW_21_in_statement304); 
                    match(input,18,FOLLOW_18_in_statement306); 

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
    // ulNoActions.g:61:1: expr : ( ID | literal );
    public final void expr() throws RecognitionException {
        try {
            // ulNoActions.g:61:6: ( ID | literal )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=STRINGCONST && LA7_0<=FALSE)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("61:1: expr : ( ID | literal );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ulNoActions.g:61:8: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr325); 

                    }
                    break;
                case 2 :
                    // ulNoActions.g:62:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_expr334);
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
    // $ANTLR end expr


    // $ANTLR start identifier
    // ulNoActions.g:65:1: identifier : ID ;
    public final void identifier() throws RecognitionException {
        try {
            // ulNoActions.g:65:12: ( ID )
            // ulNoActions.g:65:14: ID
            {
            match(input,ID,FOLLOW_ID_in_identifier348); 

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
    // ulNoActions.g:68:1: type : TYPE ;
    public final void type() throws RecognitionException {
        try {
            // ulNoActions.g:68:7: ( TYPE )
            // ulNoActions.g:68:9: TYPE
            {
            match(input,TYPE,FOLLOW_TYPE_in_type369); 

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
    // ulNoActions.g:71:1: literal : ( STRINGCONST | INTEGERCONST | TRUE | FALSE );
    public final void literal() throws RecognitionException {
        try {
            // ulNoActions.g:71:8: ( STRINGCONST | INTEGERCONST | TRUE | FALSE )
            // ulNoActions.g:
            {
            if ( (input.LA(1)>=STRINGCONST && input.LA(1)<=FALSE) ) {
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


 

    public static final BitSet FOLLOW_function_in_program24 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_functionDecl_in_function42 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_functionBody_in_function44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_functionDecl62 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_functionDecl64 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_functionDecl66 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalParameters_in_functionDecl68 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_functionDecl70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_formalParameters92 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_formalParameters94 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_formals_in_formalParameters96 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_formals142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundType_in_formals144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identifier_in_formals146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_functionBody186 = new BitSet(new long[]{0x00000000002E03F0L});
    public static final BitSet FOLLOW_varDec_in_functionBody188 = new BitSet(new long[]{0x00000000002E03F0L});
    public static final BitSet FOLLOW_statement_in_functionBody191 = new BitSet(new long[]{0x00000000002E03E0L});
    public static final BitSet FOLLOW_17_in_functionBody194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_varDec216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_varDec218 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_varDec220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_statement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement250 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_statement266 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_expr_in_statement268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement284 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement286 = new BitSet(new long[]{0x00000000000003E0L});
    public static final BitSet FOLLOW_expr_in_statement288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_statement304 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});

}