package ast;

import types.Type; 
                             
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

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}