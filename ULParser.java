// $ANTLR 3.0.1 UL.g 2018-01-09 12:21:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class ULParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARDEC", "FUNCDEC", "EXPR", "FUNCCALL", "FUNCBODY", "ARRINDEX", "TYPE", "INTEGERCONST", "ID", "WHILE", "IF", "ELSE", "STRINGCONST", "FLOATCONST", "CHARCONST", "TRUE", "FALSE", "WS", "COMMENT", "'('", "')'", "','", "'['", "']'", "'{'", "'}'", "';'", "'print'", "'println'", "'='", "'return'", "'*'", "'+'", "'-'", "'<'", "'=='"
    };
    public static final int VARDEC=4;
    public static final int INTEGERCONST=11;
    public static final int FLOATCONST=17;
    public static final int FUNCBODY=8;
    public static final int COMMENT=22;
    public static final int FUNCCALL=7;
    public static final int ARRINDEX=9;
    public static final int STRINGCONST=16;
    public static final int EXPR=6;
    public static final int CHARCONST=18;
    public static final int ELSE=15;
    public static final int ID=12;
    public static final int WS=21;
    public static final int EOF=-1;
    public static final int TYPE=10;
    public static final int IF=14;
    public static final int TRUE=19;
    public static final int FUNCDEC=5;
    public static final int WHILE=13;
    public static final int FALSE=20;

        public ULParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[56+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "UL.g"; }


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


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // UL.g:41:1: program : ( function )+ ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        function_return function1 = null;



        try {
            // UL.g:41:9: ( ( function )+ )
            // UL.g:41:11: ( function )+
            {
            root_0 = (Object)adaptor.nil();

            // UL.g:41:11: ( function )+
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
            	    // UL.g:0:0: function
            	    {
            	    pushFollow(FOLLOW_function_in_program93);
            	    function1=function();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, function1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function
    // UL.g:43:1: function : functionDecl functionBody ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        functionDecl_return functionDecl2 = null;

        functionBody_return functionBody3 = null;



        try {
            // UL.g:43:10: ( functionDecl functionBody )
            // UL.g:43:12: functionDecl functionBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_functionDecl_in_function103);
            functionDecl2=functionDecl();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, functionDecl2.getTree());
            pushFollow(FOLLOW_functionBody_in_function105);
            functionBody3=functionBody();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, functionBody3.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end function

    public static class functionDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionDecl
    // UL.g:45:1: functionDecl : type identifier '(' formalParameters ')' -> ^( FUNCDEC type identifier formalParameters ) ;
    public final functionDecl_return functionDecl() throws RecognitionException {
        functionDecl_return retval = new functionDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        type_return type4 = null;

        identifier_return identifier5 = null;

        formalParameters_return formalParameters7 = null;


        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // UL.g:45:14: ( type identifier '(' formalParameters ')' -> ^( FUNCDEC type identifier formalParameters ) )
            // UL.g:45:16: type identifier '(' formalParameters ')'
            {
            pushFollow(FOLLOW_type_in_functionDecl114);
            type4=type();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_type.add(type4.getTree());
            pushFollow(FOLLOW_identifier_in_functionDecl116);
            identifier5=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_identifier.add(identifier5.getTree());
            char_literal6=(Token)input.LT(1);
            match(input,23,FOLLOW_23_in_functionDecl118); if (failed) return retval;
            if ( backtracking==0 ) stream_23.add(char_literal6);

            pushFollow(FOLLOW_formalParameters_in_functionDecl120);
            formalParameters7=formalParameters();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_formalParameters.add(formalParameters7.getTree());
            char_literal8=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_functionDecl122); if (failed) return retval;
            if ( backtracking==0 ) stream_24.add(char_literal8);


            // AST REWRITE
            // elements: type, identifier, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:57: -> ^( FUNCDEC type identifier formalParameters )
            {
                // UL.g:45:60: ^( FUNCDEC type identifier formalParameters )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCDEC, "FUNCDEC"), root_1);

                adaptor.addChild(root_1, stream_type.next());
                adaptor.addChild(root_1, stream_identifier.next());
                adaptor.addChild(root_1, stream_formalParameters.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionDecl

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameters
    // UL.g:47:1: formalParameters : ( compoundType identifier ( formals )* | );
    public final formalParameters_return formalParameters() throws RecognitionException {
        formalParameters_return retval = new formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        compoundType_return compoundType9 = null;

        identifier_return identifier10 = null;

        formals_return formals11 = null;



        try {
            // UL.g:47:18: ( compoundType identifier ( formals )* | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPE) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("47:1: formalParameters : ( compoundType identifier ( formals )* | );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // UL.g:47:20: compoundType identifier ( formals )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_compoundType_in_formalParameters143);
                    compoundType9=compoundType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compoundType9.getTree());
                    pushFollow(FOLLOW_identifier_in_formalParameters145);
                    identifier10=identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, identifier10.getTree());
                    // UL.g:47:44: ( formals )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==25) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // UL.g:0:0: formals
                    	    {
                    	    pushFollow(FOLLOW_formals_in_formalParameters147);
                    	    formals11=formals();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, formals11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // UL.g:49:18: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end formalParameters

    public static class formals_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formals
    // UL.g:51:1: formals : ',' compoundType identifier ;
    public final formals_return formals() throws RecognitionException {
        formals_return retval = new formals_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal12=null;
        compoundType_return compoundType13 = null;

        identifier_return identifier14 = null;


        Object char_literal12_tree=null;

        try {
            // UL.g:51:9: ( ',' compoundType identifier )
            // UL.g:51:11: ',' compoundType identifier
            {
            root_0 = (Object)adaptor.nil();

            char_literal12=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_formals193); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal12_tree = (Object)adaptor.create(char_literal12);
            adaptor.addChild(root_0, char_literal12_tree);
            }
            pushFollow(FOLLOW_compoundType_in_formals195);
            compoundType13=compoundType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, compoundType13.getTree());
            pushFollow(FOLLOW_identifier_in_formals197);
            identifier14=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, identifier14.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end formals

    public static class compoundType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compoundType
    // UL.g:53:1: compoundType : ( TYPE | TYPE '[' INTEGERCONST ']' );
    public final compoundType_return compoundType() throws RecognitionException {
        compoundType_return retval = new compoundType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPE15=null;
        Token TYPE16=null;
        Token char_literal17=null;
        Token INTEGERCONST18=null;
        Token char_literal19=null;

        Object TYPE15_tree=null;
        Object TYPE16_tree=null;
        Object char_literal17_tree=null;
        Object INTEGERCONST18_tree=null;
        Object char_literal19_tree=null;

        try {
            // UL.g:53:14: ( TYPE | TYPE '[' INTEGERCONST ']' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TYPE) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else if ( (LA4_1==ID) ) {
                    alt4=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("53:1: compoundType : ( TYPE | TYPE '[' INTEGERCONST ']' );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("53:1: compoundType : ( TYPE | TYPE '[' INTEGERCONST ']' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // UL.g:53:16: TYPE
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPE15=(Token)input.LT(1);
                    match(input,TYPE,FOLLOW_TYPE_in_compoundType206); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TYPE15_tree = (Object)adaptor.create(TYPE15);
                    adaptor.addChild(root_0, TYPE15_tree);
                    }

                    }
                    break;
                case 2 :
                    // UL.g:54:16: TYPE '[' INTEGERCONST ']'
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPE16=(Token)input.LT(1);
                    match(input,TYPE,FOLLOW_TYPE_in_compoundType223); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TYPE16_tree = (Object)adaptor.create(TYPE16);
                    adaptor.addChild(root_0, TYPE16_tree);
                    }
                    char_literal17=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_compoundType225); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);
                    }
                    INTEGERCONST18=(Token)input.LT(1);
                    match(input,INTEGERCONST,FOLLOW_INTEGERCONST_in_compoundType227); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INTEGERCONST18_tree = (Object)adaptor.create(INTEGERCONST18);
                    adaptor.addChild(root_0, INTEGERCONST18_tree);
                    }
                    char_literal19=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_compoundType229); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end compoundType

    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionBody
    // UL.g:57:1: functionBody : '{' ( varDec )* ( statement )* '}' -> ^( FUNCBODY ( varDec )* ( statement )* ) ;
    public final functionBody_return functionBody() throws RecognitionException {
        functionBody_return retval = new functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        Token char_literal23=null;
        varDec_return varDec21 = null;

        statement_return statement22 = null;


        Object char_literal20_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_varDec=new RewriteRuleSubtreeStream(adaptor,"rule varDec");
        try {
            // UL.g:57:14: ( '{' ( varDec )* ( statement )* '}' -> ^( FUNCBODY ( varDec )* ( statement )* ) )
            // UL.g:57:16: '{' ( varDec )* ( statement )* '}'
            {
            char_literal20=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_functionBody251); if (failed) return retval;
            if ( backtracking==0 ) stream_28.add(char_literal20);

            // UL.g:57:20: ( varDec )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==TYPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // UL.g:0:0: varDec
            	    {
            	    pushFollow(FOLLOW_varDec_in_functionBody253);
            	    varDec21=varDec();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_varDec.add(varDec21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // UL.g:57:28: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=INTEGERCONST && LA6_0<=IF)||(LA6_0>=STRINGCONST && LA6_0<=FALSE)||LA6_0==23||(LA6_0>=30 && LA6_0<=32)||(LA6_0>=34 && LA6_0<=39)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // UL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionBody256);
            	    statement22=statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_statement.add(statement22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal23=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_functionBody259); if (failed) return retval;
            if ( backtracking==0 ) stream_29.add(char_literal23);


            // AST REWRITE
            // elements: statement, varDec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:43: -> ^( FUNCBODY ( varDec )* ( statement )* )
            {
                // UL.g:57:46: ^( FUNCBODY ( varDec )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCBODY, "FUNCBODY"), root_1);

                // UL.g:57:57: ( varDec )*
                while ( stream_varDec.hasNext() ) {
                    adaptor.addChild(root_1, stream_varDec.next());

                }
                stream_varDec.reset();
                // UL.g:57:65: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionBody

    public static class varDec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start varDec
    // UL.g:60:1: varDec : compoundType ID ';' -> ^( VARDEC compoundType ID ) ;
    public final varDec_return varDec() throws RecognitionException {
        varDec_return retval = new varDec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID25=null;
        Token char_literal26=null;
        compoundType_return compoundType24 = null;


        Object ID25_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_compoundType=new RewriteRuleSubtreeStream(adaptor,"rule compoundType");
        try {
            // UL.g:60:8: ( compoundType ID ';' -> ^( VARDEC compoundType ID ) )
            // UL.g:60:10: compoundType ID ';'
            {
            pushFollow(FOLLOW_compoundType_in_varDec294);
            compoundType24=compoundType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_compoundType.add(compoundType24.getTree());
            ID25=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_varDec296); if (failed) return retval;
            if ( backtracking==0 ) stream_ID.add(ID25);

            char_literal26=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_varDec298); if (failed) return retval;
            if ( backtracking==0 ) stream_30.add(char_literal26);


            // AST REWRITE
            // elements: ID, compoundType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:30: -> ^( VARDEC compoundType ID )
            {
                // UL.g:60:33: ^( VARDEC compoundType ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARDEC, "VARDEC"), root_1);

                adaptor.addChild(root_1, stream_compoundType.next());
                adaptor.addChild(root_1, stream_ID.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end varDec

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // UL.g:63:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal27=null;
        Token char_literal29=null;
        Token string_literal30=null;
        Token char_literal32=null;
        Token string_literal33=null;
        Token char_literal35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token ID40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token string_literal47=null;
        Token char_literal48=null;
        Token string_literal49=null;
        Token char_literal51=null;
        Token WHILE52=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token IF57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token ELSE62=null;
        Token IF64=null;
        Token char_literal65=null;
        Token char_literal67=null;
        expr_return expr28 = null;

        expr_return expr31 = null;

        expr_return expr34 = null;

        expr_return expr38 = null;

        expr_return expr42 = null;

        expr_return expr45 = null;

        expr_return expr50 = null;

        expr_return expr54 = null;

        block_return block56 = null;

        expr_return expr59 = null;

        block_return block61 = null;

        block_return block63 = null;

        expr_return expr66 = null;

        block_return block68 = null;


        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        Object string_literal30_tree=null;
        Object char_literal32_tree=null;
        Object string_literal33_tree=null;
        Object char_literal35_tree=null;
        Object ID36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object ID40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        Object string_literal47_tree=null;
        Object char_literal48_tree=null;
        Object string_literal49_tree=null;
        Object char_literal51_tree=null;
        Object WHILE52_tree=null;
        Object char_literal53_tree=null;
        Object char_literal55_tree=null;
        Object IF57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        Object ELSE62_tree=null;
        Object IF64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // UL.g:63:11: ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred7()) ) {
                    alt7=1;
                }
                else if ( (synpred8()) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) );", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case INTEGERCONST:
            case STRINGCONST:
            case FLOATCONST:
            case CHARCONST:
            case TRUE:
            case FALSE:
            case 23:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt7=2;
                }
                break;
            case ID:
                {
                int LA7_7 = input.LA(2);

                if ( (synpred8()) ) {
                    alt7=2;
                }
                else if ( (synpred11()) ) {
                    alt7=5;
                }
                else if ( (synpred12()) ) {
                    alt7=6;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) );", 7, 7, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                int LA7_12 = input.LA(2);

                if ( (synpred13()) ) {
                    alt7=7;
                }
                else if ( (synpred14()) ) {
                    alt7=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) );", 7, 12, input);

                    throw nvae;
                }
                }
                break;
            case WHILE:
                {
                alt7=9;
                }
                break;
            case IF:
                {
                int LA7_14 = input.LA(2);

                if ( (synpred16()) ) {
                    alt7=10;
                }
                else if ( (true) ) {
                    alt7=11;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("63:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) );", 7, 14, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("63:1: statement : ( ';' | expr ';' | 'print' expr ';' | 'println' expr ';' | ID '=' expr ';' -> ^( '=' ID expr ) | ID '[' expr ']' '=' expr ';' -> ^( '=' ^( ARRINDEX ID expr ) expr ) | 'return' ';' | 'return' expr ';' | WHILE '(' expr ')' block -> ^( WHILE expr block ) | IF '(' expr ')' block ELSE block -> ^( IF expr block ELSE block ) | IF '(' expr ')' block -> ^( IF expr block ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // UL.g:63:13: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal27=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement318); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // UL.g:64:13: expr ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_statement333);
                    expr28=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr28.getTree());
                    char_literal29=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement335); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // UL.g:65:13: 'print' expr ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal30=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_statement350); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal30_tree = (Object)adaptor.create(string_literal30);
                    adaptor.addChild(root_0, string_literal30_tree);
                    }
                    pushFollow(FOLLOW_expr_in_statement352);
                    expr31=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr31.getTree());
                    char_literal32=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement354); if (failed) return retval;

                    }
                    break;
                case 4 :
                    // UL.g:66:13: 'println' expr ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal33=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_statement369); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);
                    }
                    pushFollow(FOLLOW_expr_in_statement371);
                    expr34=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr34.getTree());
                    char_literal35=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement373); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // UL.g:67:13: ID '=' expr ';'
                    {
                    ID36=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_statement388); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID36);

                    char_literal37=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_statement390); if (failed) return retval;
                    if ( backtracking==0 ) stream_33.add(char_literal37);

                    pushFollow(FOLLOW_expr_in_statement392);
                    expr38=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr38.getTree());
                    char_literal39=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement394); if (failed) return retval;
                    if ( backtracking==0 ) stream_30.add(char_literal39);


                    // AST REWRITE
                    // elements: 33, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:49: -> ^( '=' ID expr )
                    {
                        // UL.g:67:52: ^( '=' ID expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_33.next(), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        adaptor.addChild(root_1, stream_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 6 :
                    // UL.g:68:13: ID '[' expr ']' '=' expr ';'
                    {
                    ID40=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_statement438); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID40);

                    char_literal41=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_statement440); if (failed) return retval;
                    if ( backtracking==0 ) stream_26.add(char_literal41);

                    pushFollow(FOLLOW_expr_in_statement442);
                    expr42=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr42.getTree());
                    char_literal43=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_statement444); if (failed) return retval;
                    if ( backtracking==0 ) stream_27.add(char_literal43);

                    char_literal44=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_statement446); if (failed) return retval;
                    if ( backtracking==0 ) stream_33.add(char_literal44);

                    pushFollow(FOLLOW_expr_in_statement448);
                    expr45=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr45.getTree());
                    char_literal46=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement450); if (failed) return retval;
                    if ( backtracking==0 ) stream_30.add(char_literal46);


                    // AST REWRITE
                    // elements: ID, expr, expr, 33
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:49: -> ^( '=' ^( ARRINDEX ID expr ) expr )
                    {
                        // UL.g:68:52: ^( '=' ^( ARRINDEX ID expr ) expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_33.next(), root_1);

                        // UL.g:68:58: ^( ARRINDEX ID expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(ARRINDEX, "ARRINDEX"), root_2);

                        adaptor.addChild(root_2, stream_ID.next());
                        adaptor.addChild(root_2, stream_expr.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 7 :
                    // UL.g:69:13: 'return' ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal47=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_statement487); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal47_tree = (Object)adaptor.create(string_literal47);
                    adaptor.addChild(root_0, string_literal47_tree);
                    }
                    char_literal48=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement489); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);
                    }

                    }
                    break;
                case 8 :
                    // UL.g:70:13: 'return' expr ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal49=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_statement503); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal49_tree = (Object)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);
                    }
                    pushFollow(FOLLOW_expr_in_statement505);
                    expr50=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr50.getTree());
                    char_literal51=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_statement507); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal51_tree = (Object)adaptor.create(char_literal51);
                    adaptor.addChild(root_0, char_literal51_tree);
                    }

                    }
                    break;
                case 9 :
                    // UL.g:71:13: WHILE '(' expr ')' block
                    {
                    WHILE52=(Token)input.LT(1);
                    match(input,WHILE,FOLLOW_WHILE_in_statement521); if (failed) return retval;
                    if ( backtracking==0 ) stream_WHILE.add(WHILE52);

                    char_literal53=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_statement523); if (failed) return retval;
                    if ( backtracking==0 ) stream_23.add(char_literal53);

                    pushFollow(FOLLOW_expr_in_statement525);
                    expr54=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr54.getTree());
                    char_literal55=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_statement527); if (failed) return retval;
                    if ( backtracking==0 ) stream_24.add(char_literal55);

                    pushFollow(FOLLOW_block_in_statement529);
                    block56=block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_block.add(block56.getTree());

                    // AST REWRITE
                    // elements: WHILE, block, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:49: -> ^( WHILE expr block )
                    {
                        // UL.g:71:52: ^( WHILE expr block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_WHILE.next(), root_1);

                        adaptor.addChild(root_1, stream_expr.next());
                        adaptor.addChild(root_1, stream_block.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 10 :
                    // UL.g:72:13: IF '(' expr ')' block ELSE block
                    {
                    IF57=(Token)input.LT(1);
                    match(input,IF,FOLLOW_IF_in_statement564); if (failed) return retval;
                    if ( backtracking==0 ) stream_IF.add(IF57);

                    char_literal58=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_statement566); if (failed) return retval;
                    if ( backtracking==0 ) stream_23.add(char_literal58);

                    pushFollow(FOLLOW_expr_in_statement568);
                    expr59=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr59.getTree());
                    char_literal60=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_statement570); if (failed) return retval;
                    if ( backtracking==0 ) stream_24.add(char_literal60);

                    pushFollow(FOLLOW_block_in_statement572);
                    block61=block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_block.add(block61.getTree());
                    ELSE62=(Token)input.LT(1);
                    match(input,ELSE,FOLLOW_ELSE_in_statement574); if (failed) return retval;
                    if ( backtracking==0 ) stream_ELSE.add(ELSE62);

                    pushFollow(FOLLOW_block_in_statement576);
                    block63=block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_block.add(block63.getTree());

                    // AST REWRITE
                    // elements: IF, block, ELSE, expr, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:49: -> ^( IF expr block ELSE block )
                    {
                        // UL.g:72:52: ^( IF expr block ELSE block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.next(), root_1);

                        adaptor.addChild(root_1, stream_expr.next());
                        adaptor.addChild(root_1, stream_block.next());
                        adaptor.addChild(root_1, stream_ELSE.next());
                        adaptor.addChild(root_1, stream_block.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 11 :
                    // UL.g:73:13: IF '(' expr ')' block
                    {
                    IF64=(Token)input.LT(1);
                    match(input,IF,FOLLOW_IF_in_statement607); if (failed) return retval;
                    if ( backtracking==0 ) stream_IF.add(IF64);

                    char_literal65=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_statement609); if (failed) return retval;
                    if ( backtracking==0 ) stream_23.add(char_literal65);

                    pushFollow(FOLLOW_expr_in_statement611);
                    expr66=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr66.getTree());
                    char_literal67=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_statement613); if (failed) return retval;
                    if ( backtracking==0 ) stream_24.add(char_literal67);

                    pushFollow(FOLLOW_block_in_statement615);
                    block68=block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_block.add(block68.getTree());

                    // AST REWRITE
                    // elements: expr, block, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:49: -> ^( IF expr block )
                    {
                        // UL.g:73:52: ^( IF expr block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.next(), root_1);

                        adaptor.addChild(root_1, stream_expr.next());
                        adaptor.addChild(root_1, stream_block.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // UL.g:77:1: block : '{' ( statement )* '}' ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        statement_return statement70 = null;


        Object char_literal69_tree=null;
        Object char_literal71_tree=null;

        try {
            // UL.g:77:7: ( '{' ( statement )* '}' )
            // UL.g:77:9: '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal69=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_block659); if (failed) return retval;
            // UL.g:77:14: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=INTEGERCONST && LA8_0<=IF)||(LA8_0>=STRINGCONST && LA8_0<=FALSE)||LA8_0==23||(LA8_0>=30 && LA8_0<=32)||(LA8_0>=34 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // UL.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block662);
            	    statement70=statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, statement70.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal71=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_block665); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end block

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exprList
    // UL.g:80:1: exprList : ( expr ( exprMore )* | );
    public final exprList_return exprList() throws RecognitionException {
        exprList_return retval = new exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expr_return expr72 = null;

        exprMore_return exprMore73 = null;



        try {
            // UL.g:80:10: ( expr ( exprMore )* | )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=INTEGERCONST && LA10_0<=ID)||(LA10_0>=STRINGCONST && LA10_0<=FALSE)||LA10_0==23||LA10_0==25||(LA10_0>=35 && LA10_0<=39)) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                int LA10_2 = input.LA(2);

                if ( (synpred19()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("80:1: exprList : ( expr ( exprMore )* | );", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("80:1: exprList : ( expr ( exprMore )* | );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // UL.g:80:12: expr ( exprMore )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_exprList681);
                    expr72=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr72.getTree());
                    // UL.g:80:17: ( exprMore )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // UL.g:0:0: exprMore
                    	    {
                    	    pushFollow(FOLLOW_exprMore_in_exprList683);
                    	    exprMore73=exprMore();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, exprMore73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // UL.g:82:10: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end exprList

    public static class baseExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start baseExp
    // UL.g:84:1: baseExp : ( | ID | literal | '(' expr ')' | ID '(' exprList ')' -> ^( FUNCCALL ID exprList ) );
    public final baseExp_return baseExp() throws RecognitionException {
        baseExp_return retval = new baseExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID74=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token ID79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        literal_return literal75 = null;

        expr_return expr77 = null;

        exprList_return exprList81 = null;


        Object ID74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object ID79_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // UL.g:84:9: ( | ID | literal | '(' expr ')' | ID '(' exprList ')' -> ^( FUNCCALL ID exprList ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case EOF:
            case 24:
            case 25:
            case 27:
            case 30:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==23) ) {
                    alt11=5;
                }
                else if ( (LA11_2==EOF||(LA11_2>=24 && LA11_2<=25)||LA11_2==27||LA11_2==30||(LA11_2>=35 && LA11_2<=39)) ) {
                    alt11=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("84:1: baseExp : ( | ID | literal | '(' expr ')' | ID '(' exprList ')' -> ^( FUNCCALL ID exprList ) );", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case INTEGERCONST:
            case STRINGCONST:
            case FLOATCONST:
            case CHARCONST:
            case TRUE:
            case FALSE:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("84:1: baseExp : ( | ID | literal | '(' expr ')' | ID '(' exprList ')' -> ^( FUNCCALL ID exprList ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // UL.g:85:9: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // UL.g:85:11: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID74=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_baseExp723); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID74_tree = (Object)adaptor.create(ID74);
                    adaptor.addChild(root_0, ID74_tree);
                    }

                    }
                    break;
                case 3 :
                    // UL.g:86:11: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_baseExp735);
                    literal75=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal75.getTree());

                    }
                    break;
                case 4 :
                    // UL.g:87:11: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal76=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_baseExp747); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_baseExp750);
                    expr77=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr77.getTree());
                    char_literal78=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_baseExp752); if (failed) return retval;

                    }
                    break;
                case 5 :
                    // UL.g:88:11: ID '(' exprList ')'
                    {
                    ID79=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_baseExp765); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID79);

                    char_literal80=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_baseExp767); if (failed) return retval;
                    if ( backtracking==0 ) stream_23.add(char_literal80);

                    pushFollow(FOLLOW_exprList_in_baseExp769);
                    exprList81=exprList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_exprList.add(exprList81.getTree());
                    char_literal82=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_baseExp771); if (failed) return retval;
                    if ( backtracking==0 ) stream_24.add(char_literal82);


                    // AST REWRITE
                    // elements: ID, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:31: -> ^( FUNCCALL ID exprList )
                    {
                        // UL.g:88:34: ^( FUNCCALL ID exprList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCCALL, "FUNCCALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        adaptor.addChild(root_1, stream_exprList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end baseExp

    public static class exprMore_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exprMore
    // UL.g:91:1: exprMore : ',' expr ;
    public final exprMore_return exprMore() throws RecognitionException {
        exprMore_return retval = new exprMore_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal83=null;
        expr_return expr84 = null;


        Object char_literal83_tree=null;

        try {
            // UL.g:91:10: ( ',' expr )
            // UL.g:91:12: ',' expr
            {
            root_0 = (Object)adaptor.nil();

            char_literal83=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_exprMore798); if (failed) return retval;
            if ( backtracking==0 ) {
            char_literal83_tree = (Object)adaptor.create(char_literal83);
            adaptor.addChild(root_0, char_literal83_tree);
            }
            pushFollow(FOLLOW_expr_in_exprMore800);
            expr84=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr84.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end exprMore

    public static class multExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multExp
    // UL.g:94:1: multExp : baseExp ( '*' baseExp )* ;
    public final multExp_return multExp() throws RecognitionException {
        multExp_return retval = new multExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        baseExp_return baseExp85 = null;

        baseExp_return baseExp87 = null;


        Object char_literal86_tree=null;

        try {
            // UL.g:94:9: ( baseExp ( '*' baseExp )* )
            // UL.g:94:11: baseExp ( '*' baseExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_baseExp_in_multExp818);
            baseExp85=baseExp();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, baseExp85.getTree());
            // UL.g:94:19: ( '*' baseExp )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // UL.g:94:20: '*' baseExp
            	    {
            	    char_literal86=(Token)input.LT(1);
            	    match(input,35,FOLLOW_35_in_multExp821); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal86_tree = (Object)adaptor.create(char_literal86);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal86_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_baseExp_in_multExp824);
            	    baseExp87=baseExp();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, baseExp87.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end multExp

    public static class addExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start addExp
    // UL.g:97:1: addExp : multExp ( ( '+' | '-' ) multExp )* ;
    public final addExp_return addExp() throws RecognitionException {
        addExp_return retval = new addExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal89=null;
        Token char_literal90=null;
        multExp_return multExp88 = null;

        multExp_return multExp91 = null;


        Object char_literal89_tree=null;
        Object char_literal90_tree=null;

        try {
            // UL.g:97:8: ( multExp ( ( '+' | '-' ) multExp )* )
            // UL.g:97:10: multExp ( ( '+' | '-' ) multExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multExp_in_addExp843);
            multExp88=multExp();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multExp88.getTree());
            // UL.g:97:18: ( ( '+' | '-' ) multExp )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=36 && LA14_0<=37)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // UL.g:97:19: ( '+' | '-' ) multExp
            	    {
            	    // UL.g:97:19: ( '+' | '-' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==36) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==37) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("97:19: ( '+' | '-' )", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // UL.g:97:20: '+'
            	            {
            	            char_literal89=(Token)input.LT(1);
            	            match(input,36,FOLLOW_36_in_addExp847); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            char_literal89_tree = (Object)adaptor.create(char_literal89);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal89_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // UL.g:97:25: '-'
            	            {
            	            char_literal90=(Token)input.LT(1);
            	            match(input,37,FOLLOW_37_in_addExp850); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            char_literal90_tree = (Object)adaptor.create(char_literal90);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal90_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multExp_in_addExp854);
            	    multExp91=multExp();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multExp91.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end addExp

    public static class equalityLT_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityLT
    // UL.g:101:1: equalityLT : addExp ( '<' addExp )* ;
    public final equalityLT_return equalityLT() throws RecognitionException {
        equalityLT_return retval = new equalityLT_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal93=null;
        addExp_return addExp92 = null;

        addExp_return addExp94 = null;


        Object char_literal93_tree=null;

        try {
            // UL.g:101:12: ( addExp ( '<' addExp )* )
            // UL.g:101:14: addExp ( '<' addExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExp_in_equalityLT873);
            addExp92=addExp();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, addExp92.getTree());
            // UL.g:101:21: ( '<' addExp )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // UL.g:101:22: '<' addExp
            	    {
            	    char_literal93=(Token)input.LT(1);
            	    match(input,38,FOLLOW_38_in_equalityLT876); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    char_literal93_tree = (Object)adaptor.create(char_literal93);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal93_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_addExp_in_equalityLT879);
            	    addExp94=addExp();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, addExp94.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityLT

    public static class equalityExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExp
    // UL.g:104:1: equalityExp : equalityLT ( '==' equalityLT )? ;
    public final equalityExp_return equalityExp() throws RecognitionException {
        equalityExp_return retval = new equalityExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        equalityLT_return equalityLT95 = null;

        equalityLT_return equalityLT97 = null;


        Object string_literal96_tree=null;

        try {
            // UL.g:104:13: ( equalityLT ( '==' equalityLT )? )
            // UL.g:104:15: equalityLT ( '==' equalityLT )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityLT_in_equalityExp901);
            equalityLT95=equalityLT();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityLT95.getTree());
            // UL.g:104:26: ( '==' equalityLT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // UL.g:104:28: '==' equalityLT
                    {
                    string_literal96=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_equalityExp905); if (failed) return retval;
                    if ( backtracking==0 ) {
                    string_literal96_tree = (Object)adaptor.create(string_literal96);
                    root_0 = (Object)adaptor.becomeRoot(string_literal96_tree, root_0);
                    }
                    pushFollow(FOLLOW_equalityLT_in_equalityExp908);
                    equalityLT97=equalityLT();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, equalityLT97.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExp

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expr
    // UL.g:107:1: expr : ( equalityExp | ID '(' exprList ')' | ID '[' expr ']' -> ^( ARRINDEX ID expr ) );
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token ID103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        equalityExp_return equalityExp98 = null;

        exprList_return exprList101 = null;

        expr_return expr105 = null;


        Object ID99_tree=null;
        Object char_literal100_tree=null;
        Object char_literal102_tree=null;
        Object ID103_tree=null;
        Object char_literal104_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // UL.g:107:6: ( equalityExp | ID '(' exprList ')' | ID '[' expr ']' -> ^( ARRINDEX ID expr ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EOF||LA17_0==INTEGERCONST||(LA17_0>=STRINGCONST && LA17_0<=FALSE)||(LA17_0>=23 && LA17_0<=25)||LA17_0==27||LA17_0==30||(LA17_0>=35 && LA17_0<=39)) ) {
                alt17=1;
            }
            else if ( (LA17_0==ID) ) {
                int LA17_11 = input.LA(2);

                if ( (synpred29()) ) {
                    alt17=1;
                }
                else if ( (synpred30()) ) {
                    alt17=2;
                }
                else if ( (true) ) {
                    alt17=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("107:1: expr : ( equalityExp | ID '(' exprList ')' | ID '[' expr ']' -> ^( ARRINDEX ID expr ) );", 17, 11, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("107:1: expr : ( equalityExp | ID '(' exprList ')' | ID '[' expr ']' -> ^( ARRINDEX ID expr ) );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // UL.g:107:8: equalityExp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_equalityExp_in_expr931);
                    equalityExp98=equalityExp();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, equalityExp98.getTree());

                    }
                    break;
                case 2 :
                    // UL.g:108:8: ID '(' exprList ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    ID99=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expr940); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ID99_tree = (Object)adaptor.create(ID99);
                    adaptor.addChild(root_0, ID99_tree);
                    }
                    char_literal100=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_expr942); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal100_tree = (Object)adaptor.create(char_literal100);
                    adaptor.addChild(root_0, char_literal100_tree);
                    }
                    pushFollow(FOLLOW_exprList_in_expr944);
                    exprList101=exprList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, exprList101.getTree());
                    char_literal102=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_expr946); if (failed) return retval;
                    if ( backtracking==0 ) {
                    char_literal102_tree = (Object)adaptor.create(char_literal102);
                    adaptor.addChild(root_0, char_literal102_tree);
                    }

                    }
                    break;
                case 3 :
                    // UL.g:109:8: ID '[' expr ']'
                    {
                    ID103=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expr955); if (failed) return retval;
                    if ( backtracking==0 ) stream_ID.add(ID103);

                    char_literal104=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_expr957); if (failed) return retval;
                    if ( backtracking==0 ) stream_26.add(char_literal104);

                    pushFollow(FOLLOW_expr_in_expr959);
                    expr105=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expr.add(expr105.getTree());
                    char_literal106=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_expr961); if (failed) return retval;
                    if ( backtracking==0 ) stream_27.add(char_literal106);


                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:24: -> ^( ARRINDEX ID expr )
                    {
                        // UL.g:109:27: ^( ARRINDEX ID expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRINDEX, "ARRINDEX"), root_1);

                        adaptor.addChild(root_1, stream_ID.next());
                        adaptor.addChild(root_1, stream_expr.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end expr

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start identifier
    // UL.g:112:1: identifier : ID ;
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID107=null;

        Object ID107_tree=null;

        try {
            // UL.g:112:12: ( ID )
            // UL.g:112:14: ID
            {
            root_0 = (Object)adaptor.nil();

            ID107=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_identifier985); if (failed) return retval;
            if ( backtracking==0 ) {
            ID107_tree = (Object)adaptor.create(ID107);
            adaptor.addChild(root_0, ID107_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end identifier

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start type
    // UL.g:114:1: type : TYPE ;
    public final type_return type() throws RecognitionException {
        type_return retval = new type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPE108=null;

        Object TYPE108_tree=null;

        try {
            // UL.g:114:7: ( TYPE )
            // UL.g:114:9: TYPE
            {
            root_0 = (Object)adaptor.nil();

            TYPE108=(Token)input.LT(1);
            match(input,TYPE,FOLLOW_TYPE_in_type995); if (failed) return retval;
            if ( backtracking==0 ) {
            TYPE108_tree = (Object)adaptor.create(TYPE108);
            adaptor.addChild(root_0, TYPE108_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end type

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // UL.g:116:1: literal : ( STRINGCONST | INTEGERCONST | FLOATCONST | CHARCONST | TRUE | FALSE );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set109=null;

        Object set109_tree=null;

        try {
            // UL.g:116:8: ( STRINGCONST | INTEGERCONST | FLOATCONST | CHARCONST | TRUE | FALSE )
            // UL.g:
            {
            root_0 = (Object)adaptor.nil();

            set109=(Token)input.LT(1);
            if ( input.LA(1)==INTEGERCONST||(input.LA(1)>=STRINGCONST && input.LA(1)<=FALSE) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set109));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_literal0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

                catch (RecognitionException ex) {
                        reportError(ex);
                        throw ex;
                }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // UL.g:63:13: ( ';' )
        // UL.g:63:13: ';'
        {
        match(input,30,FOLLOW_30_in_synpred7318); if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // UL.g:64:13: ( expr ';' )
        // UL.g:64:13: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred8333);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,30,FOLLOW_30_in_synpred8335); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // UL.g:67:13: ( ID '=' expr ';' )
        // UL.g:67:13: ID '=' expr ';'
        {
        match(input,ID,FOLLOW_ID_in_synpred11388); if (failed) return ;
        match(input,33,FOLLOW_33_in_synpred11390); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred11392);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,30,FOLLOW_30_in_synpred11394); if (failed) return ;

        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // UL.g:68:13: ( ID '[' expr ']' '=' expr ';' )
        // UL.g:68:13: ID '[' expr ']' '=' expr ';'
        {
        match(input,ID,FOLLOW_ID_in_synpred12438); if (failed) return ;
        match(input,26,FOLLOW_26_in_synpred12440); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred12442);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,27,FOLLOW_27_in_synpred12444); if (failed) return ;
        match(input,33,FOLLOW_33_in_synpred12446); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred12448);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,30,FOLLOW_30_in_synpred12450); if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // UL.g:69:13: ( 'return' ';' )
        // UL.g:69:13: 'return' ';'
        {
        match(input,34,FOLLOW_34_in_synpred13487); if (failed) return ;
        match(input,30,FOLLOW_30_in_synpred13489); if (failed) return ;

        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // UL.g:70:13: ( 'return' expr ';' )
        // UL.g:70:13: 'return' expr ';'
        {
        match(input,34,FOLLOW_34_in_synpred14503); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred14505);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,30,FOLLOW_30_in_synpred14507); if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // UL.g:72:13: ( IF '(' expr ')' block ELSE block )
        // UL.g:72:13: IF '(' expr ')' block ELSE block
        {
        match(input,IF,FOLLOW_IF_in_synpred16564); if (failed) return ;
        match(input,23,FOLLOW_23_in_synpred16566); if (failed) return ;
        pushFollow(FOLLOW_expr_in_synpred16568);
        expr();
        _fsp--;
        if (failed) return ;
        match(input,24,FOLLOW_24_in_synpred16570); if (failed) return ;
        pushFollow(FOLLOW_block_in_synpred16572);
        block();
        _fsp--;
        if (failed) return ;
        match(input,ELSE,FOLLOW_ELSE_in_synpred16574); if (failed) return ;
        pushFollow(FOLLOW_block_in_synpred16576);
        block();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // UL.g:80:12: ( expr ( exprMore )* )
        // UL.g:80:12: expr ( exprMore )*
        {
        pushFollow(FOLLOW_expr_in_synpred19681);
        expr();
        _fsp--;
        if (failed) return ;
        // UL.g:80:17: ( exprMore )*
        loop19:
        do {
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }


            switch (alt19) {
        	case 1 :
        	    // UL.g:0:0: exprMore
        	    {
        	    pushFollow(FOLLOW_exprMore_in_synpred19683);
        	    exprMore();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop19;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // UL.g:107:8: ( equalityExp )
        // UL.g:107:8: equalityExp
        {
        pushFollow(FOLLOW_equalityExp_in_synpred29931);
        equalityExp();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // UL.g:108:8: ( ID '(' exprList ')' )
        // UL.g:108:8: ID '(' exprList ')'
        {
        match(input,ID,FOLLOW_ID_in_synpred30940); if (failed) return ;
        match(input,23,FOLLOW_23_in_synpred30942); if (failed) return ;
        pushFollow(FOLLOW_exprList_in_synpred30944);
        exprList();
        _fsp--;
        if (failed) return ;
        match(input,24,FOLLOW_24_in_synpred30946); if (failed) return ;

        }
    }
    // $ANTLR end synpred30

    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
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
    public final boolean synpred30() {
        backtracking++;
        int start = input.mark();
        try {
            synpred30_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_function_in_program93 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_functionDecl_in_function103 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_functionBody_in_function105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_functionDecl114 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_identifier_in_functionDecl116 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_functionDecl118 = new BitSet(new long[]{0x0000000001000400L});
    public static final BitSet FOLLOW_formalParameters_in_functionDecl120 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_functionDecl122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_formalParameters143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_identifier_in_formalParameters145 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_formals_in_formalParameters147 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_formals193 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_compoundType_in_formals195 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_identifier_in_formals197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_compoundType223 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_compoundType225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEGERCONST_in_compoundType227 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_compoundType229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_functionBody251 = new BitSet(new long[]{0x000000FDE09F7C00L});
    public static final BitSet FOLLOW_varDec_in_functionBody253 = new BitSet(new long[]{0x000000FDE09F7C00L});
    public static final BitSet FOLLOW_statement_in_functionBody256 = new BitSet(new long[]{0x000000FDE09F7800L});
    public static final BitSet FOLLOW_29_in_functionBody259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_varDec294 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_varDec296 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_varDec298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_statement318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement333 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_statement350 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_statement352 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_statement369 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_statement371 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement388 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_statement390 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_statement392 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_statement438 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement440 = new BitSet(new long[]{0x000000F8089F1800L});
    public static final BitSet FOLLOW_expr_in_statement442 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_statement444 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_statement446 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_statement448 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_statement487 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_statement503 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_statement505 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_statement507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement521 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement523 = new BitSet(new long[]{0x000000F8019F1800L});
    public static final BitSet FOLLOW_expr_in_statement525 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement527 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement564 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement566 = new BitSet(new long[]{0x000000F8019F1800L});
    public static final BitSet FOLLOW_expr_in_statement568 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement570 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement572 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_statement574 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement607 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement609 = new BitSet(new long[]{0x000000F8019F1800L});
    public static final BitSet FOLLOW_expr_in_statement611 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement613 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_block659 = new BitSet(new long[]{0x000000FDE09F7800L});
    public static final BitSet FOLLOW_statement_in_block662 = new BitSet(new long[]{0x000000FDE09F7800L});
    public static final BitSet FOLLOW_29_in_block665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList681 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_exprMore_in_exprList683 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ID_in_baseExp723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_baseExp735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_baseExp747 = new BitSet(new long[]{0x000000F8019F1800L});
    public static final BitSet FOLLOW_expr_in_baseExp750 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_baseExp752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_baseExp765 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_baseExp767 = new BitSet(new long[]{0x000000F8039F1800L});
    public static final BitSet FOLLOW_exprList_in_baseExp769 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_baseExp771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_exprMore798 = new BitSet(new long[]{0x000000F8009F1802L});
    public static final BitSet FOLLOW_expr_in_exprMore800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseExp_in_multExp818 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_multExp821 = new BitSet(new long[]{0x00000000009F1802L});
    public static final BitSet FOLLOW_baseExp_in_multExp824 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_multExp_in_addExp843 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_addExp847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_addExp850 = new BitSet(new long[]{0x00000038009F1802L});
    public static final BitSet FOLLOW_multExp_in_addExp854 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_addExp_in_equalityLT873 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_equalityLT876 = new BitSet(new long[]{0x00000038009F1802L});
    public static final BitSet FOLLOW_addExp_in_equalityLT879 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equalityLT_in_equalityExp901 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_equalityExp905 = new BitSet(new long[]{0x00000078009F1802L});
    public static final BitSet FOLLOW_equalityLT_in_equalityExp908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExp_in_expr931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr940 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_expr942 = new BitSet(new long[]{0x000000F8039F1800L});
    public static final BitSet FOLLOW_exprList_in_expr944 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_expr946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr955 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expr957 = new BitSet(new long[]{0x000000F8089F1800L});
    public static final BitSet FOLLOW_expr_in_expr959 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_expr961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred8333 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred11388 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred11390 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_synpred11392 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred12438 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred12440 = new BitSet(new long[]{0x000000F8089F1800L});
    public static final BitSet FOLLOW_expr_in_synpred12442 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred12444 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_synpred12446 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_synpred12448 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred13487 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred14503 = new BitSet(new long[]{0x000000F8409F1800L});
    public static final BitSet FOLLOW_expr_in_synpred14505 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_synpred14507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred16564 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred16566 = new BitSet(new long[]{0x000000F8019F1800L});
    public static final BitSet FOLLOW_expr_in_synpred16568 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred16570 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_synpred16572 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_synpred16574 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_synpred16576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred19681 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_exprMore_in_synpred19683 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_equalityExp_in_synpred29931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred30940 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred30942 = new BitSet(new long[]{0x000000F8039F1800L});
    public static final BitSet FOLLOW_exprList_in_synpred30944 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred30946 = new BitSet(new long[]{0x0000000000000002L});

}