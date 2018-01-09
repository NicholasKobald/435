/*
 * Compiler.java
 *
 *
 */
import java.io.*;

/* prolly fix this
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.CommonTreeAdaptor; */

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;



public class Compiler {
    // black magic antlr thing
    static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
            CommonTree tree = new CommonTree(payload);
            if (tree.isNil()) {

            } else {
                System.out.println("Processing Symbol: " + payload.getType());
            }
            return tree;
        }
    };

    public static void main (String[] args) throws Exception {
        ANTLRInputStream input;

        if (args.length == 0 ) {
            System.out.println("Usage: Test filename.ul");
            return;
        } else {
            input = new ANTLRInputStream(new FileInputStream(args[0]));
        }

        ULLexer lexer = new ULLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ULParser parser = new ULParser(tokens);
        parser.setTreeAdaptor(adaptor);
        ULParser.program_return prog = null; // fuck off java

        try {
            prog = parser.program();
        } catch (RecognitionException e)	{ // my codes perfect, it was probably user error
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        // org.antlr.runtime.tree
        CommonTree t = (CommonTree)prog.getTree();
        System.out.println(t.toStringTree());
    }
}
