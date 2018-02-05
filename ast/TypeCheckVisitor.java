package ast;

import ast.BaseULException;

public class TypeCheckVisitor {

    void verify(Program p) {

    }

    void verify(Function f) {

    }

    void verify(FunctionDeclaration fd) {

    }

    void verify(FunctionBody fb) {

    }

    // ad nauseum ... 

    private static void verify_contains_valid_main(Program p) throws BaseULException {
        for (Function f: p) 
            if (f.declaration.id.equals("main")) {
                if (f.declaration.type == VoidType )
            }

        throw new MissingMainException("", f.declaration.id.getLineNumber()); 
    }
}