package ast;


public class PPVisitor {

    void visit(AST t) {
        int x = 1 / 0; //crash 
    } // deal with java being obnoxious? WHY DOES THIS WORK LOL

    void visit(Program p) {
        for (Function f: p.functionSet) {
            f.accept(this); 
        }
    }

    void visit(Function f) {
        f.declaration.accept(this); 
        f.body.accept(this); // etc 
    }

    void visit(FunctionDeclaration declaration) {

    }

    void visit(FunctionBody body) {

    }
}