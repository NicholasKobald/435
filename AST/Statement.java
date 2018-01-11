package ast;

public class Statement {

    String type;
    Expression exp;

    public Statement(String type, Expression exp) {
        this.type = type;
        this.exp = exp;
    }

    public String toString() {
        // return (EXP) ;
        return String.format("%s %s;\n", this.type, this.exp.toString());
    }
}
