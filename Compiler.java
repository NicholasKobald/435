import java.io.*;

import ast.PPVisitor;
import ast.Program;
import ast.TypeCheckVisitor;
import ast.BaseULException;
import types.*;
import types.BoolType;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class Compiler {

    public static void main (String[] args) throws Exception {
        ANTLRInputStream input;
        FileInputStream fp; 

        if (args.length == 0 ) {
            System.out.println("Usage: Test filename.ul");
            return;
        } else {
            fp = new FileInputStream(args[0]); 
            input = new ANTLRInputStream(fp);
        }

        ULLexer lexer = new ULLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ULParser parser = new ULParser(tokens);
        Program prog = null;
        try {
            prog = (Program)parser.program();
        } catch (RecognitionException e) {
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
        TypeCheckVisitor tcvisitor = new TypeCheckVisitor(
            parser._float, parser._int, parser._bool, parser._char, parser._str, parser._void); 
        
        try {
            tcvisitor.verify(prog);
        } catch (BaseULException e) {
            String line = getFailureLine(e.lineCrashed, args[0]); 
            String msg = String.format("%s:%s:Error: %s", args[0], String.valueOf(e.lineCrashed), e.msg); 
            System.out.println(msg); 
            System.out.println(String.format("Line %s:%s", String.valueOf(e.lineCrashed), line)); 
        } 
    }


    private static String getFailureLine(int linenum, String fname) {
        String line = null; 
        try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
            for (int i = 0; i < linenum - 1; i++)
                br.readLine();
            line = br.readLine();
        } catch (IOException e) {
            // quality engineering 
        }
        return line; 
    }
}
