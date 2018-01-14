package ast;

public class Statement {

    String stype;
    BaseExpression exp;

    public Statement(String stype, BaseExpression exp) {
        this.stype = stype;
        this.exp = exp;
    }

    public String toString() {
        // return EXP ;
        return String.format("%s %s;\n", this.stype, this.exp.toString());
    }
}
