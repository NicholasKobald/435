package ast;


public class Return extends BaseStatement { 

    BaseExpression exp; 

    public Return() {
        this.exp = null; 
    }

    public Return(BaseExpression exp) {
        this.exp = exp; 
    }

    public String toCodeString() {
        if (exp == null)
            return "return;"; 
        return String.format("return %s;", exp.toCodeString()); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
}