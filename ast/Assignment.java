package ast;


public class Assignment extends BaseStatement {

    public ULIdentifier identifier;
    public BaseExpression exp;

    public Assignment(ULIdentifier id, BaseExpression exp) {
            this.identifier = id;
            this.exp = exp;
    }

    public String toCodeString() {
        // ex: `identifier = 5 + (5);`
        return String.format("%s = %s;\n", this.identifier.toString(), this.exp.toCodeString());
    }
}
