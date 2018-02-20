package ast;

import types.Type; 

public class Assignment extends BaseStatement {

    public ULIdentifier identifier;
    public BaseExpression exp;

    public Assignment(ULIdentifier id, BaseExpression exp) {
            this.identifier = id;
            this.exp = exp;
            this.lineNumber = id.getLineNumber();
            this.lineColumn = id.getColumn(); 
    }

    public String toCodeString() {
        // ex: `identifier = 5 + (5);`
        return String.format("%s = %s;\n", this.identifier.toString(), this.exp.toCodeString());
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}
