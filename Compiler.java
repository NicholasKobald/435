/*
 * Compiler.java
 *
 *
 */
import java.io.*;

import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.CommonTreeAdaptor;



public class Compiler {

    static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
        public Object create(Token payload) {
          return new CommonTree(payload);
        }
    };

    public static void main (String[] args) throws Exception {
        ANTLRInputStream input;

        if (args.length == 0 ) {
            System.out.println("Usage: Test filename.ul");
            return;
        }
        else {
            input = new ANTLRInputStream(new FileInputStream(args[0]));
        }

        // black magic antlr thing

        // The name of the grammar here is "ulNoActions",
        // so ANTLR generates ulNoActionsLexer and ulNoActionsParser
        ulNoActionsLexer lexer = new ulNoActionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ulNoActionsParser parser = new ulNoActionsParser(tokens);
        // parser.setTreeAdaptor(adaptor);

        try {
            parser.program();
        }
        catch (RecognitionException e)	{
            // A lexical or parsing error occured.
            // ANTLR will have already printed information on the
        }
        catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
