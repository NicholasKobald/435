package ast;


public class Print extends BaseStatement {

    BaseExpression exp;
    boolean newLine; 

    public Print(BaseExpression exp, boolean newLine) {
        this.exp = exp;
        this.newLine = newLine; 
    }
}