// $ANTLR 3.0.1 ulNoActions.g 2018-01-06 00:48:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsLexer extends Lexer {
    public static final int INTEGERCONST=7;
    public static final int COMMENT=12;
    public static final int STRINGCONST=6;
    public static final int T21=21;
    public static final int T20=20;
    public static final int ID=5;
    public static final int WS=11;
    public static final int EOF=-1;
    public static final int TYPE=4;
    public static final int IF=10;
    public static final int Tokens=22;
    public static final int TRUE=8;
    public static final int T14=14;
    public static final int T13=13;
    public static final int T16=16;
    public static final int T15=15;
    public static final int FALSE=9;
    public static final int T18=18;
    public static final int T17=17;
    public static final int T19=19;
    public ulNoActionsLexer() {;} 
    public ulNoActionsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "ulNoActions.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
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
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
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
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
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
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ulNoActions.g:6:5: ( '{' )
            // ulNoActions.g:6:7: '{'
            {
            match('{'); 

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
            // ulNoActions.g:7:5: ( '}' )
            // ulNoActions.g:7:7: '}'
            {
            match('}'); 

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
            // ulNoActions.g:8:5: ( ';' )
            // ulNoActions.g:8:7: ';'
            {
            match(';'); 

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
            // ulNoActions.g:9:5: ( 'print' )
            // ulNoActions.g:9:7: 'print'
            {
            match("print"); 


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
            // ulNoActions.g:10:5: ( '=' )
            // ulNoActions.g:10:7: '='
            {
            match('='); 

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
            // ulNoActions.g:11:5: ( 'return' )
            // ulNoActions.g:11:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start IF
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            // ulNoActions.g:77:4: ( 'if' )
            // ulNoActions.g:77:6: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IF

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // ulNoActions.g:80:9: ( 'int' | 'string' | 'float' | 'char' | 'void' | 'boolean' )
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
                    new NoViableAltException("80:1: TYPE : ( 'int' | 'string' | 'float' | 'char' | 'void' | 'boolean' );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ulNoActions.g:80:11: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // ulNoActions.g:81:11: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 3 :
                    // ulNoActions.g:82:11: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 4 :
                    // ulNoActions.g:83:11: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 5 :
                    // ulNoActions.g:84:11: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 6 :
                    // ulNoActions.g:85:11: 'boolean'
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
            // ulNoActions.g:88:5: ( 'true' )
            // ulNoActions.g:88:8: 'true'
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
            // ulNoActions.g:89:6: ( 'false' )
            // ulNoActions.g:89:8: 'false'
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
            // ulNoActions.g:91:14: ( ( '0' .. '9' )+ )
            // ulNoActions.g:91:16: ( '0' .. '9' )+
            {
            // ulNoActions.g:91:16: ( '0' .. '9' )+
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
            	    // ulNoActions.g:91:17: '0' .. '9'
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

    // $ANTLR start STRINGCONST
    public final void mSTRINGCONST() throws RecognitionException {
        try {
            int _type = STRINGCONST;
            // ulNoActions.g:98:14: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | '.' | ',' | '!' )* '\"' )
            // ulNoActions.g:98:16: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | '.' | ',' | '!' )* '\"'
            {
            match('\"'); 
            // ulNoActions.g:98:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | '.' | ',' | '!' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=' ' && LA3_0<='!')||LA3_0==','||LA3_0=='.'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // ulNoActions.g:101:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ulNoActions.g:101:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ulNoActions.g:101:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // ulNoActions.g:105:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
            // ulNoActions.g:105:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            {
            // ulNoActions.g:105:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ulNoActions.g:108:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
            // ulNoActions.g:108:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
            {
            match("//"); 

            // ulNoActions.g:108:16: (~ ( '\\r' | '\\n' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ulNoActions.g:108:16: ~ ( '\\r' | '\\n' )
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
            	    break loop6;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
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
        // ulNoActions.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | IF | TYPE | TRUE | FALSE | INTEGERCONST | STRINGCONST | ID | WS | COMMENT )
        int alt7=18;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt7=1;
            }
            break;
        case ')':
            {
            alt7=2;
            }
            break;
        case ',':
            {
            alt7=3;
            }
            break;
        case '{':
            {
            alt7=4;
            }
            break;
        case '}':
            {
            alt7=5;
            }
            break;
        case ';':
            {
            alt7=6;
            }
            break;
        case 'p':
            {
            int LA7_7 = input.LA(2);

            if ( (LA7_7=='r') ) {
                int LA7_22 = input.LA(3);

                if ( (LA7_22=='i') ) {
                    int LA7_33 = input.LA(4);

                    if ( (LA7_33=='n') ) {
                        int LA7_44 = input.LA(5);

                        if ( (LA7_44=='t') ) {
                            int LA7_54 = input.LA(6);

                            if ( ((LA7_54>='0' && LA7_54<='9')||(LA7_54>='A' && LA7_54<='Z')||LA7_54=='_'||(LA7_54>='a' && LA7_54<='z')) ) {
                                alt7=16;
                            }
                            else {
                                alt7=7;}
                        }
                        else {
                            alt7=16;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case '=':
            {
            alt7=8;
            }
            break;
        case 'r':
            {
            int LA7_9 = input.LA(2);

            if ( (LA7_9=='e') ) {
                int LA7_23 = input.LA(3);

                if ( (LA7_23=='t') ) {
                    int LA7_34 = input.LA(4);

                    if ( (LA7_34=='u') ) {
                        int LA7_45 = input.LA(5);

                        if ( (LA7_45=='r') ) {
                            int LA7_55 = input.LA(6);

                            if ( (LA7_55=='n') ) {
                                int LA7_62 = input.LA(7);

                                if ( ((LA7_62>='0' && LA7_62<='9')||(LA7_62>='A' && LA7_62<='Z')||LA7_62=='_'||(LA7_62>='a' && LA7_62<='z')) ) {
                                    alt7=16;
                                }
                                else {
                                    alt7=9;}
                            }
                            else {
                                alt7=16;}
                        }
                        else {
                            alt7=16;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA7_24 = input.LA(3);

                if ( ((LA7_24>='0' && LA7_24<='9')||(LA7_24>='A' && LA7_24<='Z')||LA7_24=='_'||(LA7_24>='a' && LA7_24<='z')) ) {
                    alt7=16;
                }
                else {
                    alt7=10;}
                }
                break;
            case 'n':
                {
                int LA7_25 = input.LA(3);

                if ( (LA7_25=='t') ) {
                    int LA7_36 = input.LA(4);

                    if ( ((LA7_36>='0' && LA7_36<='9')||(LA7_36>='A' && LA7_36<='Z')||LA7_36=='_'||(LA7_36>='a' && LA7_36<='z')) ) {
                        alt7=16;
                    }
                    else {
                        alt7=11;}
                }
                else {
                    alt7=16;}
                }
                break;
            default:
                alt7=16;}

            }
            break;
        case 's':
            {
            int LA7_11 = input.LA(2);

            if ( (LA7_11=='t') ) {
                int LA7_26 = input.LA(3);

                if ( (LA7_26=='r') ) {
                    int LA7_37 = input.LA(4);

                    if ( (LA7_37=='i') ) {
                        int LA7_47 = input.LA(5);

                        if ( (LA7_47=='n') ) {
                            int LA7_56 = input.LA(6);

                            if ( (LA7_56=='g') ) {
                                int LA7_63 = input.LA(7);

                                if ( ((LA7_63>='0' && LA7_63<='9')||(LA7_63>='A' && LA7_63<='Z')||LA7_63=='_'||(LA7_63>='a' && LA7_63<='z')) ) {
                                    alt7=16;
                                }
                                else {
                                    alt7=11;}
                            }
                            else {
                                alt7=16;}
                        }
                        else {
                            alt7=16;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA7_27 = input.LA(3);

                if ( (LA7_27=='o') ) {
                    int LA7_38 = input.LA(4);

                    if ( (LA7_38=='a') ) {
                        int LA7_48 = input.LA(5);

                        if ( (LA7_48=='t') ) {
                            int LA7_57 = input.LA(6);

                            if ( ((LA7_57>='0' && LA7_57<='9')||(LA7_57>='A' && LA7_57<='Z')||LA7_57=='_'||(LA7_57>='a' && LA7_57<='z')) ) {
                                alt7=16;
                            }
                            else {
                                alt7=11;}
                        }
                        else {
                            alt7=16;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
                }
                break;
            case 'a':
                {
                int LA7_28 = input.LA(3);

                if ( (LA7_28=='l') ) {
                    int LA7_39 = input.LA(4);

                    if ( (LA7_39=='s') ) {
                        int LA7_49 = input.LA(5);

                        if ( (LA7_49=='e') ) {
                            int LA7_58 = input.LA(6);

                            if ( ((LA7_58>='0' && LA7_58<='9')||(LA7_58>='A' && LA7_58<='Z')||LA7_58=='_'||(LA7_58>='a' && LA7_58<='z')) ) {
                                alt7=16;
                            }
                            else {
                                alt7=13;}
                        }
                        else {
                            alt7=16;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
                }
                break;
            default:
                alt7=16;}

            }
            break;
        case 'c':
            {
            int LA7_13 = input.LA(2);

            if ( (LA7_13=='h') ) {
                int LA7_29 = input.LA(3);

                if ( (LA7_29=='a') ) {
                    int LA7_40 = input.LA(4);

                    if ( (LA7_40=='r') ) {
                        int LA7_50 = input.LA(5);

                        if ( ((LA7_50>='0' && LA7_50<='9')||(LA7_50>='A' && LA7_50<='Z')||LA7_50=='_'||(LA7_50>='a' && LA7_50<='z')) ) {
                            alt7=16;
                        }
                        else {
                            alt7=11;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case 'v':
            {
            int LA7_14 = input.LA(2);

            if ( (LA7_14=='o') ) {
                int LA7_30 = input.LA(3);

                if ( (LA7_30=='i') ) {
                    int LA7_41 = input.LA(4);

                    if ( (LA7_41=='d') ) {
                        int LA7_51 = input.LA(5);

                        if ( ((LA7_51>='0' && LA7_51<='9')||(LA7_51>='A' && LA7_51<='Z')||LA7_51=='_'||(LA7_51>='a' && LA7_51<='z')) ) {
                            alt7=16;
                        }
                        else {
                            alt7=11;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case 'b':
            {
            int LA7_15 = input.LA(2);

            if ( (LA7_15=='o') ) {
                int LA7_31 = input.LA(3);

                if ( (LA7_31=='o') ) {
                    int LA7_42 = input.LA(4);

                    if ( (LA7_42=='l') ) {
                        int LA7_52 = input.LA(5);

                        if ( (LA7_52=='e') ) {
                            int LA7_59 = input.LA(6);

                            if ( (LA7_59=='a') ) {
                                int LA7_65 = input.LA(7);

                                if ( (LA7_65=='n') ) {
                                    int LA7_67 = input.LA(8);

                                    if ( ((LA7_67>='0' && LA7_67<='9')||(LA7_67>='A' && LA7_67<='Z')||LA7_67=='_'||(LA7_67>='a' && LA7_67<='z')) ) {
                                        alt7=16;
                                    }
                                    else {
                                        alt7=11;}
                                }
                                else {
                                    alt7=16;}
                            }
                            else {
                                alt7=16;}
                        }
                        else {
                            alt7=16;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case 't':
            {
            int LA7_16 = input.LA(2);

            if ( (LA7_16=='r') ) {
                int LA7_32 = input.LA(3);

                if ( (LA7_32=='u') ) {
                    int LA7_43 = input.LA(4);

                    if ( (LA7_43=='e') ) {
                        int LA7_53 = input.LA(5);

                        if ( ((LA7_53>='0' && LA7_53<='9')||(LA7_53>='A' && LA7_53<='Z')||LA7_53=='_'||(LA7_53>='a' && LA7_53<='z')) ) {
                            alt7=16;
                        }
                        else {
                            alt7=12;}
                    }
                    else {
                        alt7=16;}
                }
                else {
                    alt7=16;}
            }
            else {
                alt7=16;}
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=14;
            }
            break;
        case '\"':
            {
            alt7=15;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'u':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=16;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=17;
            }
            break;
        case '/':
            {
            alt7=18;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | IF | TYPE | TRUE | FALSE | INTEGERCONST | STRINGCONST | ID | WS | COMMENT );", 7, 0, input);

            throw nvae;
        }

        switch (alt7) {
            case 1 :
                // ulNoActions.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ulNoActions.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ulNoActions.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ulNoActions.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ulNoActions.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ulNoActions.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ulNoActions.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ulNoActions.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ulNoActions.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ulNoActions.g:1:46: IF
                {
                mIF(); 

                }
                break;
            case 11 :
                // ulNoActions.g:1:49: TYPE
                {
                mTYPE(); 

                }
                break;
            case 12 :
                // ulNoActions.g:1:54: TRUE
                {
                mTRUE(); 

                }
                break;
            case 13 :
                // ulNoActions.g:1:59: FALSE
                {
                mFALSE(); 

                }
                break;
            case 14 :
                // ulNoActions.g:1:65: INTEGERCONST
                {
                mINTEGERCONST(); 

                }
                break;
            case 15 :
                // ulNoActions.g:1:78: STRINGCONST
                {
                mSTRINGCONST(); 

                }
                break;
            case 16 :
                // ulNoActions.g:1:90: ID
                {
                mID(); 

                }
                break;
            case 17 :
                // ulNoActions.g:1:93: WS
                {
                mWS(); 

                }
                break;
            case 18 :
                // ulNoActions.g:1:96: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


 

}