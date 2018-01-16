package ast;


public class Statement extends BaseStatement {

    BaseExpression exp = null;

    public Statement(BaseExpression exp) {
        this.exp = exp;
    }

    public String toString() {
        // return EXP ;
        return String.format("%s;", this.exp.toString());
    }
}
