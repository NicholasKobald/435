// $ANTLR 3.0.1 ulNoActions.g 2018-01-06 14:53:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ulNoActionsParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "INTEGERCONST", "ID", "WHILE", "IF", "ELSE", "STRINGCONST", "FLOATCONST", "TRUE", "FALSE", "WS", "COMMENT", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "';'", "'print'", "'println'", "'='", "'return'"
    };
    public static final int INTEGERCONST=5;
    public static final int FLOATCONST=11;
    public static final int TRUE=12;
    public static final int COMMENT=15;
    public static final int STRINGCONST=10;
    public static final int ELSE=9;
    public static final int WHILE=7;
    public static final int FALSE=13;
    public static final int ID=6;
    public static final int WS=14;
    public static final int EOF=-1;
    public static final int TYPE=4;
    public static final int IF=8;

        public ulNoActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[40+1];
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
            match(input,16,FOLLOW_16_in_functionDecl79); if (failed) return ;
            pushFollow(FOLLOW_formalParameters_in_functionDecl81);
            formalParameters();
            _fsp--;
            if (failed) return ;
            match(input,17,FOLLOW_17_in_functionDecl83); if (failed) return ;

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
            else if ( (LA3_0==17) ) {
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

                        if ( (LA2_0==18) ) {
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
            match(input,18,FOLLOW_18_in_formals155); if (failed) return ;
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
    // ulNoActions.g:48:1: compoundType : ( TYPE | TYPE '[' INTEGERCONST ']' );
    public final void compoundType() throws RecognitionException {
        try {
            // ulNoActions.g:48:14: ( TYPE | TYPE '[' INTEGERCONST ']' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TYPE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=2;
                }
                else if ( (LA4_1==ID) ) {
                    alt4=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: compoundType : ( TYPE | TYPE '[' INTEGERCONST ']' );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("48:1: compoundType : ( TYPE | TYPE '[' INTEGERCONST ']' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ulNoActions.g:48:16: TYPE
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_compoundType177); if (failed) return ;

                    }
                    break;
                case 2 :
                    // ulNoActions.g:49:16: TYPE '[' INTEGERCONST ']'
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_compoundType194); if (failed) return ;
                    match(input,19,FOLLOW_19_in_compoundType196); if (failed) return ;
                    match(input,INTEGERCONST,FOLLOW_INTEGERCONST_in_compoundType198); if (failed) return ;
                    match(input,20,FOLLOW_20_in_compoundType200); if (failed) return ;

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
    // $ANTLR end compoundType


    // $ANTLR start functionBody
    // ulNoActions.g:52:1: functionBody : '{' ( varDec )* ( statement )* '}' ;
    public final void functionBody() throws RecognitionException {
        try {
            // ulNoActions.g:52:14: ( '{' ( varDec )* ( statement )* '}' )
            // ulNoActions.g:52:16: '{' ( varDec )* ( statement )* '}'
            {
            match(input,21,FOLLOW_21_in_functionBody222); if (failed) return ;
            // ulNoActions.g:52:20: ( varDec )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TYPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ulNoActions.g:0:0: varDec
            	    {
            	    pushFollow(FOLLOW_varDec_in_functionBody224);
            	    varDec();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ulNoActions.g:52:28: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=INTEGERCONST && LA6_0<=IF)||(LA6_0>=STRINGCONST && LA6_0<=FALSE)||(LA6_0>=23 && LA6_0<=25)||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ulNoActions.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody227);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_functionBody230); if (failed) return ;

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
    // ulNoActions.g:55:1: varDec : compoundType ID ';' ;
    public final void varDec() throws RecognitionException {
        try {
            // ulNoActions.g:55:8: ( compoundType ID ';' )
            // ulNoActions.g:55:10: compoundType ID ';'
            {
            pushFollow(FOLLOW_compoundType_in_varDec252);
            compoundType();
            _fsp--;
            if (failed) return ;
            match(input,ID,FOLLOW_ID_in_varDec254); if (failed) return ;
            match(input,23,FOLLOW_23_in_varDec256); if (failed) return ;

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
    // ulNoActions.g:58:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block | IF '(' expr ')' block ELSE block | IF '(' expr ')' block );
    public final void statement() throws RecognitionException {
        try {
            // ulNoActions.g:58:11: ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block | IF '(' expr ')' block ELSE block | IF '(' expr ')' block )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred8()) ) {
                    alt7=2;
                }
                else if ( (synpred11()) ) {
                    alt7=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("58:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block | IF '(' expr ')' block ELSE block | IF '(' expr ')' block );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case INTEGERCONST:
            case STRINGCONST:
            case FLOATCONST:
            case TRUE:
            case FALSE:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                int LA7_6 = input.LA(2);

                if ( (synpred12()) ) {
                    alt7=6;
                }
                else if ( (synpred13()) ) {
                    alt7=7;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("58:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block | IF '(' expr ')' block ELSE block | IF '(' expr ')' block );", 7, 6, input);

                    throw nvae;
                }
                }
                break;
            case WHILE:
                {
                alt7=8;
                }
                break;
            case IF:
                {
                int LA7_8 = input.LA(2);

                if ( (synpred15()) ) {
                    alt7=9;
                }
                else if ( (true) ) {
                    alt7=10;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("58:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block | IF '(' expr ')' block ELSE block | IF '(' expr ')' block );", 7, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("58:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block | IF '(' expr ')' block ELSE block | IF '(' expr ')' block );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ulNoActions.g:58:13: ';'
                    {
                    match(input,23,FOLLOW_23_in_statement272); if (failed) return ;

                    }
                    break;
                case 2 :
                    // ulNoActions.g:59:13: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement286);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,23,FOLLOW_23_in_statement288); if (failed) return ;

                    }
                    break;
                case 3 :
                    // ulNoActions.g:60:13: 'print' expr ';'
                    {
                    match(input,24,FOLLOW_24_in_statement302); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement304);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,23,FOLLOW_23_in_statement306); if (failed) return ;

                    }
                    break;
                case 4 :
                    // ulNoActions.g:61:13: 'println' expr ';'
                    {
                    match(input,25,FOLLOW_25_in_statement320); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement322);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,23,FOLLOW_23_in_statement324); if (failed) return ;

                    }
                    break;
                case 5 :
                    // ulNoActions.g:62:13: ID '=' expr ';'
                    {
                    match(input,ID,FOLLOW_ID_in_statement338); if (failed) return ;
                    match(input,26,FOLLOW_26_in_statement340); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement342);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,23,FOLLOW_23_in_statement344); if (failed) return ;

                    }
                    break;
                case 6 :
                    // ulNoActions.g:63:13: 'return' ';'
                    {
                    match(input,27,FOLLOW_27_in_statement358); if (failed) return ;
                    match(input,23,FOLLOW_23_in_statement360); if (failed) return ;

                    }
                    break;
                case 7 :
                    // ulNoActions.g:64:13: 'return' expr ';'
                    {
                    match(input,27,FOLLOW_27_in_statement374); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement376);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,23,FOLLOW_23_in_statement378); if (failed) return ;

                    }
                    break;
                case 8 :
                    // ulNoActions.g:65:13: WHILE '(' expr ')' block
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement392); if (failed) return ;
                    match(input,16,FOLLOW_16_in_statement394); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement396);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,17,FOLLOW_17_in_statement398); if (failed) return ;
                    pushFollow(FOLLOW_block_in_statement400);
                    block();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // ulNoActions.g:66:13: IF '(' expr ')' block ELSE block
                    {
                    match(input,IF,FOLLOW_IF_in_statement414); if (failed) return ;
                    match(input,16,FOLLOW_16_in_statement416); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement418);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,17,FOLLOW_17_in_statement420); if (failed) return ;
                    pushFollow(FOLLOW_block_in_statement422);
                    block();
                    _fsp--;
                    if (failed) return ;
                    match(input,ELSE,FOLLOW_ELSE_in_statement424); if (failed) return ;
                    pushFollow(FOLLOW_block_in_statement426);
                    block();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 10 :
                    // ulNoActions.g:67:13: IF '(' expr ')' block
                    {
                    match(input,IF,FOLLOW_IF_in_statement440); if (failed) return ;
                    match(input,16,FOLLOW_16_in_statement442); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_statement444);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,17,FOLLOW_17_in_statement446); if (failed) return ;
                    pushFollow(FOLLOW_block_in_statement448);
                    block();
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


    // $ANTLR start block
    // ulNoActions.g:71:1: block : '{' ( statement )* '}' ;
    public final void block() throws RecognitionException {
        try {
            // ulNoActions.g:71:7: ( '{' ( statement )* '}' )
            // ulNoActions.g:71:9: '{' ( statement )* '}'
            {
            match(input,21,FOLLOW_21_in_block468); if (failed) return ;
            // ulNoActions.g:71:13: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=INTEGERCONST && LA8_0<=IF)||(LA8_0>=STRINGCONST && LA8_0<=FALSE)||(LA8_0>=23 && LA8_0<=25)||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ulNoActions.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block470);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_block473); if (failed) return ;

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
    // $ANTLR end block


    // $ANTLR start exprList
    // ulNoActions.g:75:1: exprList : ( expr ( exprMore )* | );
    public final void exprList() throws RecognitionException {
        try {
            // ulNoActions.g:75:10: ( expr ( exprMore )* | )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=INTEGERCONST && LA10_0<=ID)||(LA10_0>=STRINGCONST && LA10_0<=FALSE)) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("75:1: exprList : ( expr ( exprMore )* | );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ulNoActions.g:75:12: expr ( exprMore )*
                    {
                    pushFollow(FOLLOW_expr_in_exprList489);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    // ulNoActions.g:75:17: ( exprMore )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ulNoActions.g:0:0: exprMore
                    	    {
                    	    pushFollow(FOLLOW_exprMore_in_exprList491);
                    	    exprMore();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ulNoActions.g:77:10: 
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
    // $ANTLR end exprList


    // $ANTLR start exprMore
    // ulNoActions.g:79:1: exprMore : ',' expr ;
    public final void exprMore() throws RecognitionException {
        try {
            // ulNoActions.g:79:10: ( ',' expr )
            // ulNoActions.g:79:12: ',' expr
            {
            match(input,18,FOLLOW_18_in_exprMore521); if (failed) return ;
            pushFollow(FOLLOW_expr_in_exprMore523);
            expr();
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
    // $ANTLR end exprMore


    // $ANTLR start expr
    // ulNoActions.g:82:1: expr : ( ID '(' exprList ')' | ID | literal );
    public final void expr() throws RecognitionException {
        try {
            // ulNoActions.g:82:6: ( ID '(' exprList ')' | ID | literal )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==16) ) {
                    alt11=1;
                }
                else if ( (LA11_1==EOF||(LA11_1>=17 && LA11_1<=18)||LA11_1==23) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("82:1: expr : ( ID '(' exprList ')' | ID | literal );", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==INTEGERCONST||(LA11_0>=STRINGCONST && LA11_0<=FALSE)) ) {
                alt11=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("82:1: expr : ( ID '(' exprList ')' | ID | literal );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ulNoActions.g:82:8: ID '(' exprList ')'
                    {
                    match(input,ID,FOLLOW_ID_in_expr541); if (failed) return ;
                    match(input,16,FOLLOW_16_in_expr543); if (failed) return ;
                    pushFollow(FOLLOW_exprList_in_expr545);
                    exprList();
                    _fsp--;
                    if (failed) return ;
                    match(input,17,FOLLOW_17_in_expr547); if (failed) return ;

                    }
                    break;
                case 2 :
                    // ulNoActions.g:83:8: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr556); if (failed) return ;

                    }
                    break;
                case 3 :
                    // ulNoActions.g:84:8: literal
                    {
                    pushFollow(FOLLOW_literal_in_expr565);
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
    // ulNoActions.g:88:1: identifier : ID ;
    public final void identifier() throws RecognitionException {
        try {
            // ulNoActions.g:88:12: ( ID )
            // ulNoActions.g:88:14: ID
            {
            match(input,ID,FOLLOW_ID_in_identifier580); if (failed) return ;

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
    // ulNoActions.g:92:1: type : TYPE ;
    public final void type() throws RecognitionException {
        try {
            // ulNoActions.g:92:7: ( TYPE )
            // ulNoActions.g:92:9: TYPE
            {
            match(input,TYPE,FOLLOW_TYPE_in_type602); if (failed) return ;

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
    // ulNoActions.g:96:1: literal : ( STRINGCONST | INTEGERCONST | FLOATCONST | TRUE | FALSE );
    public final void literal() throws RecognitionException {
        try {
            // ulNoActions.g:96:8: ( STRINGCONST | INTEGERCONST | FLOATCONST | TRUE | FALSE )
            // ulNoActions.g:
            {
            if ( input.LA(1)==INTEGERCONST||(input.LA(1)>=STRINGCONST && input.LA(1)<=FALSE) ) {
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

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ulNoActions.g:59:13: ( expr ';' )
        // ulNoActions.g:59:13: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred8286);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,23,FOLLOW_23_in_synpred8288); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ulNoActions.g:62:13: ( ID '=' expr ';' )
        // ulNoActions.g:62:13: ID '=' expr ';'
        {
        match(input,ID,FOLLOW_ID_in_synpred11338); if (failed) return ;
        match(input,26,FOLLOW_26_in_synpred11340); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred11342);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,23,FOLLOW_23_in_synpred11344); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ulNoActions.g:63:13: ( 'return' ';' )
        // ulNoActions.g:63:13: 'return' ';'
        {
        match(input,27,FOLLOW_27_in_synpred12358); if (failed) return ;
        match(input,23,FOLLOW_23_in_synpred12360); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ulNoActions.g:64:13: ( 'return' expr ';' )
        // ulNoActions.g:64:13: 'return' expr ';'
        {
        match(input,27,FOLLOW_27_in_synpred13374); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred13376);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,23,FOLLOW_23_in_synpred13378); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ulNoActions.g:66:13: ( IF '(' expr ')' block ELSE block )
        // ulNoActions.g:66:13: IF '(' expr ')' block ELSE block
        {
        match(input,IF,FOLLOW_IF_in_synpred15414); if (failed) return ;
        match(input,16,FOLLOW_16_in_synpred15416); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred15418);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,17,FOLLOW_17_in_synpred15420); if (failed) return ;
        pushFollow(FOLLOW_block_in_synpred15422);
        block();
        _fsp--;
        if (failed) return ;
        match(input,ELSE,FOLLOW_ELSE_in_synpred15424); if (failed) return ;
        pushFollow(FOLLOW_block_in_synpred15426);
        block();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_function_in_program37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_functionDecl_in_function55 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_functionBody_in_function57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_functionDecl75 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_functionDecl77 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_functionDecl79 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_formalParameters_in_functionDecl81 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_functionDecl83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_formalParameters105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_formalParameters107 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_formals_in_formalParameters109 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_formals155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_compoundType_in_formals157 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_formals159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType194 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_compoundType196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGERCONST_in_compoundType198 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_compoundType200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_functionBody222 = new BitSet(new long[]{0x000000000BC03DF0L});
    public static final BitSet FOLLOW_varDec_in_functionBody224 = new BitSet(new long[]{0x000000000BC03DF0L});
    public static final BitSet FOLLOW_statement_in_functionBody227 = new BitSet(new long[]{0x000000000BC03DE0L});
    public static final BitSet FOLLOW_22_in_functionBody230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_varDec252 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_varDec254 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_varDec256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement286 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement302 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement304 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement320 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement322 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement338 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement340 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_statement358 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_statement374 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement392 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_statement394 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement396 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement398 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_statement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement414 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_statement416 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement420 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_statement422 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ELSE_in_statement424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_statement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement440 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_statement442 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_statement444 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_statement446 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_statement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_block468 = new BitSet(new long[]{0x000000000BC03DE0L});
    public static final BitSet FOLLOW_statement_in_block470 = new BitSet(new long[]{0x000000000BC03DE0L});
    public static final BitSet FOLLOW_22_in_block473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList489 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_exprMore_in_exprList491 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_exprMore521 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_exprMore523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr541 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_expr543 = new BitSet(new long[]{0x0000000000023C60L});
    public static final BitSet FOLLOW_exprList_in_expr545 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_expr547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_expr565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred8286 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred11338 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred11340 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_synpred11342 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred12358 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred13374 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_synpred13376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred13378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred15414 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_synpred15416 = new BitSet(new long[]{0x0000000000003C60L});
    public static final BitSet FOLLOW_expr_in_synpred15418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred15420 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_synpred15422 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ELSE_in_synpred15424 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_block_in_synpred15426 = new BitSet(new long[]{0x0000000000000002L});

}