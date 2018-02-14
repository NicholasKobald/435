package ast;

import ast.BaseULException;
import ast.Function;
import types.VoidType;

public class TypeCheckVisitor {

    GlobalEnvironment globals; 

    public void verify(Program p) throws BaseULException { 
        System.out.println("Verifying contains main..");
        verifyContainsValidMain(p);
        globals = new GlobalEnvironment();
        for (Function f: p) {
            globals.add(f.declaration); 
        }
    }

    void verify(Function f) {

    }

    void verify(FunctionDeclaration fd) {

    }

    void verify(FunctionBody fb) {

    }

    // ad nauseum ... 

    /*
     * Verifies Program p contains a main that is of VoidType, and takes no paramaters. 
     */
    private static void verifyContainsValidMain(Program p) throws BaseULException {
        int valid_main_count = 0;
        for (Function f: p) {
            if(isValidMain(f.declaration)) {
                valid_main_count += 1; 
            }
        }
        if (valid_main_count != 1)       
            throw new MissingMainException("", 0); // does 0 make sense?  --> negative number that gets handled by the printing maybe
        // potentailly I can make MME take only 1 param without fuckingshitup
    }

    private static boolean isValidMain(FunctionDeclaration fd) {
        return fd.id.equals("main") && fd.type instanceof VoidType && fd.params.size() == 0; 
    }
}