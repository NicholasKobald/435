/*
 * Compiler.java
 *
 * N. Kobald Jan, 2018 
 */
import java.io.*;

import ast.PPVisitor;
import ast.Program;
import ast.TypeCheckVisitor;
import types.*;
import types.BoolType;
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
            prog = (Program)parser.program();
        } catch (RecognitionException e)	{
            // This exception is silenced for reasonable debugging Output
            // when run with the enclosed runtests.py script. see the README.
            // System.out.println("Error: could not 'compile' grammar. Aborting.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        //PPVisitor visitor = new PPVisitor(); 
        //visitor.visit(prog); 
        TypeCheckVisitor tcvisitor = new TypeCheckVisitor(); 
        tcvisitor.verify(prog); 
    }
}
