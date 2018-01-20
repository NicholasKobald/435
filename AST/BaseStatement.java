package ast;

public abstract class BaseStatement {
    
    void accept(PPVisitor v) {
        v.visit(this);
    } 
}
