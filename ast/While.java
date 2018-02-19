package ast;

public class While extends BaseStatement { 

    BaseExpression cond; 
    StatementList statements; 

    public While(BaseExpression cond, StatementList stats) {
        this.cond = cond;
        this.statements = stats; 
    }

    public String toCodeString() {
        return String.format("while (%s)", cond.toCodeString()); 
    }
    
    void accept(PPVisitor v) {
        v.visit(this);
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}