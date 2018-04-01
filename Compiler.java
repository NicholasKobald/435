import java.io.*;
import java.nio.file.*; 


import ast.PPVisitor;
import ast.Program;
import ast.TypeCheckVisitor;
import ast.BaseULException;
import ast.IRGenVisitor;
import ast.IRProgram;
import types.*;
import types.BoolType;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import jvmgen.ULJVMGenerator; 

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
            String msg = String.format("%s:%s:Error:%s: %s", 
                args[0], String.valueOf(e.lineCrashed), e.getClass().getSimpleName(), e.msg); 
            System.out.println(msg); 
            System.out.println(String.format("Line %s:%s", String.valueOf(e.lineCrashed), line)); 
            return;
        }
        IRGenVisitor irvisitor = new IRGenVisitor(
            parser._float, parser._int, parser._bool, parser._char, parser._str, parser._void, args[0]); 

        try {
            irvisitor.gen(prog); 
        } catch(BaseULException e) {
            System.out.println("An error occured when generating the IR");
            e.printStackTrace(); 
        }
        Path p = Paths.get(args[0]);
        String className = p.getFileName().toString();
        String iRRepresentation = irvisitor.getIRRepresenation(className); 

        ultype type_package = new ultype(
            parser._float, parser._int, parser._bool, parser._char, parser._str, parser._void); 

        IRProgram irP = irvisitor.getIRProgram(); 
        ULJVMGenerator uljvmgen = new ULJVMGenerator(irP, args[0], className, type_package); 
        uljvmgen.generate();

        if (args.length > 1 && "--compare".equals(args[1])) { 
            System.out.println(iRRepresentation); 
            System.out.println(" -- converted to -- "); 
        }

        System.out.println(uljvmgen.toString());
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
