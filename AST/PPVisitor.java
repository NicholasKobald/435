package ast;


public class PPVisitor {

    void visit(Program p) {
        for (Function f: p.functionSet) {
            this.visit(f); 
        }
    }

    void visit(Function f) {
        this.visit(f.declaration);
        this.visit(f.body); 
    }

    void visit(FunctionDeclaration declaration) {

    }

    void visit(FunctionBody body) {

    }
}