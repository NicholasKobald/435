// $ANTLR 3.0.1 ulNoActions.g 2018-01-05 01:28:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ulNoActionsLexer extends Lexer {
    public static final int T5=5;
    public static final int T6=6;
    public static final int T7=7;
    public static final int T8=8;
    public static final int T9=9;
    public static final int T10=10;
    public static final int T12=12;
    public static final int T11=11;
    public static final int T14=14;
    public static final int T13=13;
    public static final int WS=4;
    public static final int EOF=-1;
    public static final int Tokens=15;
    public ulNoActionsLexer() {;} 
    public ulNoActionsLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "ulNoActions.g"; }

    // $ANTLR start T5
    public final void mT5() throws RecognitionException {
        try {
            int _type = T5;
            // ulNoActions.g:3:4: ( '(' )
            // ulNoActions.g:3:6: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T5

    // $ANTLR start T6
    public final void mT6() throws RecognitionException {
        try {
            int _type = T6;
            // ulNoActions.g:4:4: ( ')' )
            // ulNoActions.g:4:6: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T6

    // $ANTLR start T7
    public final void mT7() throws RecognitionException {
        try {
            int _type = T7;
            // ulNoActions.g:5:4: ( 'abc' )
            // ulNoActions.g:5:6: 'abc'
            {
            match("abc"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T7

    // $ANTLR start T8
    public final void mT8() throws RecognitionException {
        try {
            int _type = T8;
            // ulNoActions.g:6:4: ( 'int' )
            // ulNoActions.g:6:6: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T8

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // ulNoActions.g:7:4: ( 'string' )
            // ulNoActions.g:7:6: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ulNoActions.g:8:5: ( '+' )
            // ulNoActions.g:8:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ulNoActions.g:9:5: ( '-' )
            // ulNoActions.g:9:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ulNoActions.g:10:5: ( '==' )
            // ulNoActions.g:10:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ulNoActions.g:11:5: ( '<' )
            // ulNoActions.g:11:7: '<'
            {
            match('<'); 

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
            // ulNoActions.g:12:5: ( '*' )
            // ulNoActions.g:12:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // ulNoActions.g:61:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ulNoActions.g:61:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ulNoActions.g:61:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // ulNoActions.g:1:8: ( T5 | T6 | T7 | T8 | T9 | T10 | T11 | T12 | T13 | T14 | WS )
        int alt2=11;
        switch ( input.LA(1) ) {
        case '(':
            {
            alt2=1;
            }
            break;
        case ')':
            {
            alt2=2;
            }
            break;
        case 'a':
            {
            alt2=3;
            }
            break;
        case 'i':
            {
            alt2=4;
            }
            break;
        case 's':
            {
            alt2=5;
            }
            break;
        case '+':
            {
            alt2=6;
            }
            break;
        case '-':
            {
            alt2=7;
            }
            break;
        case '=':
            {
            alt2=8;
            }
            break;
        case '<':
            {
            alt2=9;
            }
            break;
        case '*':
            {
            alt2=10;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T5 | T6 | T7 | T8 | T9 | T10 | T11 | T12 | T13 | T14 | WS );", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // ulNoActions.g:1:10: T5
                {
                mT5(); 

                }
                break;
            case 2 :
                // ulNoActions.g:1:13: T6
                {
                mT6(); 

                }
                break;
            case 3 :
                // ulNoActions.g:1:16: T7
                {
                mT7(); 

                }
                break;
            case 4 :
                // ulNoActions.g:1:19: T8
                {
                mT8(); 

                }
                break;
            case 5 :
                // ulNoActions.g:1:22: T9
                {
                mT9(); 

                }
                break;
            case 6 :
                // ulNoActions.g:1:25: T10
                {
                mT10(); 

                }
                break;
            case 7 :
                // ulNoActions.g:1:29: T11
                {
                mT11(); 

                }
                break;
            case 8 :
                // ulNoActions.g:1:33: T12
                {
                mT12(); 

                }
                break;
            case 9 :
                // ulNoActions.g:1:37: T13
                {
                mT13(); 

                }
                break;
            case 10 :
                // ulNoActions.g:1:41: T14
                {
                mT14(); 

                }
                break;
            case 11 :
                // ulNoActions.g:1:45: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}