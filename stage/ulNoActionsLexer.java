// $ANTLR 3.0.1 ulNoActions.g 2018-01-06 14:53:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsLexer extends Lexer {
    public static final int INTEGERCONST=5;
    public static final int FLOATCONST=11;
    public static final int COMMENT=15;
    public static final int STRINGCONST=10;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T25=25;
    public static final int T24=24;
    public static final int T27=27;
    public static final int ELSE=9;
    public static final int T26=26;
    public static final int ID=6;
    public static final int WS=14;
    public static final int EOF=-1;
    public static final int TYPE=4;
    public static final int IF=8;
    public static final int Tokens=28;
    public static final int TRUE=12;
    public static final int T16=16;
    public static final int WHILE=7;
    public static final int FALSE=13;
    public static final int T18=18;
    public static final int T17=17;
    public static final int T19=19;
    public ulNoActionsLexer() {;} 
    public ulNoActionsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "ulNoActions.g"; }

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ulNoActions.g:3:5: ( '(' )
            // ulNoActions.g:3:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ulNoActions.g:4:5: ( ')' )
            // ulNoActions.g:4:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ulNoActions.g:5:5: ( ',' )
            // ulNoActions.g:5:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ulNoActions.g:6:5: ( '[' )
            // ulNoActions.g:6:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ulNoActions.g:7:5: ( ']' )
            // ulNoActions.g:7:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ulNoActions.g:8:5: ( '{' )
            // ulNoActions.g:8:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ulNoActions.g:9:5: ( '}' )
            // ulNoActions.g:9:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ulNoActions.g:10:5: ( ';' )
            // ulNoActions.g:10:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ulNoActions.g:11:5: ( 'print' )
            // ulNoActions.g:11:7: 'print'
            {
            match("print"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ulNoActions.g:12:5: ( 'println' )
            // ulNoActions.g:12:7: 'println'
            {
            match("println"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ulNoActions.g:13:5: ( '=' )
            // ulNoActions.g:13:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ulNoActions.g:14:5: ( 'return' )
            // ulNoActions.g:14:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // ulNoActions.g:103:4: ( 'if' )
            // ulNoActions.g:103:6: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start WHILE
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            // ulNoActions.g:106:7: ( 'while' )
            // ulNoActions.g:106:9: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHILE

    // $ANTLR start ELSE
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            // ulNoActions.g:110:6: ( 'else' )
            // ulNoActions.g:110:8: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ELSE

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // ulNoActions.g:114:9: ( 'int' | 'string' | 'float' | 'char' | 'void' | 'boolean' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 's':
                {
                alt1=2;
                }
                break;
            case 'f':
                {
                alt1=3;
                }
                break;
            case 'c':
                {
                alt1=4;
                }
                break;
            case 'v':
                {
                alt1=5;
                }
                break;
            case 'b':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("114:1: TYPE : ( 'int' | 'string' | 'float' | 'char' | 'void' | 'boolean' );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ulNoActions.g:114:11: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // ulNoActions.g:115:11: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 3 :
                    // ulNoActions.g:116:11: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 4 :
                    // ulNoActions.g:117:11: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 5 :
                    // ulNoActions.g:118:11: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 6 :
                    // ulNoActions.g:119:11: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start TRUE
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            // ulNoActions.g:123:5: ( 'true' )
            // ulNoActions.g:123:8: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TRUE

    // $ANTLR start FALSE
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            // ulNoActions.g:124:6: ( 'false' )
            // ulNoActions.g:124:8: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FALSE

    // $ANTLR start INTEGERCONST
    public final void mINTEGERCONST() throws RecognitionException {
        try {
            int _type = INTEGERCONST;
            // ulNoActions.g:128:14: ( ( '0' .. '9' )+ )
            // ulNoActions.g:128:16: ( '0' .. '9' )+
            {
            // ulNoActions.g:128:16: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ulNoActions.g:128:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTEGERCONST

    // $ANTLR start FLOATCONST
    public final void mFLOATCONST() throws RecognitionException {
        try {
            int _type = FLOATCONST;
            // ulNoActions.g:131:12: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ulNoActions.g:131:14: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ulNoActions.g:131:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ulNoActions.g:131:15: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // ulNoActions.g:131:28: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ulNoActions.g:131:29: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOATCONST

    // $ANTLR start STRINGCONST
    public final void mSTRINGCONST() throws RecognitionException {
        try {
            int _type = STRINGCONST;
            // ulNoActions.g:138:14: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | '.' | ',' | '!' )* '\"' )
            // ulNoActions.g:138:16: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | '.' | ',' | '!' )* '\"'
            {
            match('\"'); 
            // ulNoActions.g:138:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | '.' | ',' | '!' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=' ' && LA5_0<='!')||LA5_0==','||LA5_0=='.'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ulNoActions.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRINGCONST

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // ulNoActions.g:142:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ulNoActions.g:142:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ulNoActions.g:142:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ulNoActions.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // ulNoActions.g:147:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
            // ulNoActions.g:147:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            {
            // ulNoActions.g:147:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ulNoActions.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

             channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // ulNoActions.g:151:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )? )
            // ulNoActions.g:151:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )?
            {
            match("//"); 

            // ulNoActions.g:151:16: (~ ( '\\r' | '\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ulNoActions.g:151:16: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ulNoActions.g:151:32: ( '\\r' | '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ulNoActions.g:
                    {
                    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

             channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // ulNoActions.g:1:8: ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | IF | WHILE | ELSE | TYPE | TRUE | FALSE | INTEGERCONST | FLOATCONST | STRINGCONST | ID | WS | COMMENT )
        int alt10=24;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ulNoActions.g:1:10: T16
                {
                mT16(); 

                }
                break;
            case 2 :
                // ulNoActions.g:1:14: T17
                {
                mT17(); 

                }
                break;
            case 3 :
                // ulNoActions.g:1:18: T18
                {
                mT18(); 

                }
                break;
            case 4 :
                // ulNoActions.g:1:22: T19
                {
                mT19(); 

                }
                break;
            case 5 :
                // ulNoActions.g:1:26: T20
                {
                mT20(); 

                }
                break;
            case 6 :
                // ulNoActions.g:1:30: T21
                {
                mT21(); 

                }
                break;
            case 7 :
                // ulNoActions.g:1:34: T22
                {
                mT22(); 

                }
                break;
            case 8 :
                // ulNoActions.g:1:38: T23
                {
                mT23(); 

                }
                break;
            case 9 :
                // ulNoActions.g:1:42: T24
                {
                mT24(); 

                }
                break;
            case 10 :
                // ulNoActions.g:1:46: T25
                {
                mT25(); 

                }
                break;
            case 11 :
                // ulNoActions.g:1:50: T26
                {
                mT26(); 

                }
                break;
            case 12 :
                // ulNoActions.g:1:54: T27
                {
                mT27(); 

                }
                break;
            case 13 :
                // ulNoActions.g:1:58: IF
                {
                mIF(); 

                }
                break;
            case 14 :
                // ulNoActions.g:1:61: WHILE
                {
                mWHILE(); 

                }
                break;
            case 15 :
                // ulNoActions.g:1:67: ELSE
                {
                mELSE(); 

                }
                break;
            case 16 :
                // ulNoActions.g:1:72: TYPE
                {
                mTYPE(); 

                }
                break;
            case 17 :
                // ulNoActions.g:1:77: TRUE
                {
                mTRUE(); 

                }
                break;
            case 18 :
                // ulNoActions.g:1:82: FALSE
                {
                mFALSE(); 

                }
                break;
            case 19 :
                // ulNoActions.g:1:88: INTEGERCONST
                {
                mINTEGERCONST(); 

                }
                break;
            case 20 :
                // ulNoActions.g:1:101: FLOATCONST
                {
                mFLOATCONST(); 

                }
                break;
            case 21 :
                // ulNoActions.g:1:112: STRINGCONST
                {
                mSTRINGCONST(); 

                }
                break;
            case 22 :
                // ulNoActions.g:1:124: ID
                {
                mID(); 

                }
                break;
            case 23 :
                // ulNoActions.g:1:127: WS
                {
                mWS(); 

                }
                break;
            case 24 :
                // ulNoActions.g:1:130: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\11\uffff\1\27\1\uffff\12\27\1\47\4\uffff\2\27\1\53\12\27\2\uffff"+
        "\2\27\1\uffff\1\70\13\27\1\uffff\1\27\1\105\3\27\2\70\1\27\1\112"+
        "\1\114\1\27\1\116\1\uffff\1\27\1\70\1\120\1\27\1\uffff\1\27\1\uffff"+
        "\1\123\1\uffff\1\70\1\uffff\1\27\1\125\1\uffff\1\70\1\uffff";
    static final String DFA10_eofS =
        "\126\uffff";
    static final String DFA10_minS =
        "\1\11\10\uffff\1\162\1\uffff\1\145\1\146\1\150\1\154\1\164\1\141"+
        "\1\150\2\157\1\162\1\56\4\uffff\1\151\1\164\1\60\1\164\1\151\1\163"+
        "\1\162\1\157\1\154\1\141\1\151\1\157\1\165\2\uffff\1\156\1\165\1"+
        "\uffff\1\60\1\154\1\145\1\151\1\141\1\163\1\162\1\144\1\154\1\145"+
        "\1\164\1\162\1\uffff\1\145\1\60\1\156\1\164\1\145\2\60\1\145\2\60"+
        "\1\156\1\60\1\uffff\1\147\2\60\1\141\1\uffff\1\156\1\uffff\1\60"+
        "\1\uffff\1\60\1\uffff\1\156\1\60\1\uffff\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\10\uffff\1\162\1\uffff\1\145\1\156\1\150\1\154\1\164\1\154"+
        "\1\150\2\157\1\162\1\71\4\uffff\1\151\1\164\1\172\1\164\1\151\1"+
        "\163\1\162\1\157\1\154\1\141\1\151\1\157\1\165\2\uffff\1\156\1\165"+
        "\1\uffff\1\172\1\154\1\145\1\151\1\141\1\163\1\162\1\144\1\154\1"+
        "\145\1\164\1\162\1\uffff\1\145\1\172\1\156\1\164\1\145\2\172\1\145"+
        "\2\172\1\156\1\172\1\uffff\1\147\2\172\1\141\1\uffff\1\156\1\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\1\156\1\172\1\uffff\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\13\uffff"+
        "\1\25\1\26\1\27\1\30\15\uffff\1\23\1\24\2\uffff\1\15\14\uffff\1"+
        "\20\14\uffff\1\17\4\uffff\1\21\1\uffff\1\11\1\uffff\1\16\1\uffff"+
        "\1\22\2\uffff\1\14\1\uffff\1\12";
    static final String DFA10_specialS =
        "\126\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\uffff\1\26\5\uffff\1\1\1"+
            "\2\2\uffff\1\3\2\uffff\1\31\12\25\1\uffff\1\10\1\uffff\1\12"+
            "\3\uffff\32\27\1\4\1\uffff\1\5\1\uffff\1\27\1\uffff\1\27\1\23"+
            "\1\21\1\27\1\16\1\20\2\27\1\14\6\27\1\11\1\27\1\13\1\17\1\24"+
            "\1\27\1\22\1\15\3\27\1\6\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "",
            "\1\33",
            "\1\34\7\uffff\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\42\12\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\1\uffff\12\25",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "\1\66",
            "\1\67",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\111",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\113\16\27",
            "\1\115",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\121",
            "",
            "\1\122",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\124",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | IF | WHILE | ELSE | TYPE | TRUE | FALSE | INTEGERCONST | FLOATCONST | STRINGCONST | ID | WS | COMMENT );";
        }
    }
 

}