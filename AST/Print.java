package ast;


public class Print extends BaseStatement {

    BaseExpression exp;
    boolean newLine; 

    public Print(BaseExpression exp, boolean newLine) {
        this.exp = exp;
        this.newLine = newLine; 
    }

    public String toCodeString() {
        if (newLine)
            return String.format("println %s;", exp.toCodeString());
        else 
            return String.format("print %s;", exp.toCodeString()); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
}