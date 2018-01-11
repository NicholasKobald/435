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

import ast.Program;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;



public class Compiler {

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
        //ULParser.program_return prog = null; // fuck off java
        Program prog = null;
        try {
            prog = parser.program();
        } catch (RecognitionException e)	{
            // This exception is silenced for reasonable debugging Output
            // when run with the enclosed runtests.py script. see the README.
            // System.out.println("Error: could not 'compile' grammar. Aborting.");
            return;
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            return;
        }
        //System.out.println("PPrint Output:\n");
        //System.out.println(prog);
        // org.antlr.runtime.tree
    }
}
