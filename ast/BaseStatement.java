package ast;

public abstract class BaseStatement {

    void accept(PPVisitor v) {
        v.visit(this);
    }

    public String toCodeString() {
        return "";
    }

    public String toCodeString(int indent) {
        return ""; 
    }
}
