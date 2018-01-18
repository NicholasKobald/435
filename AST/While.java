package ast;

public class While extends BaseStatement { 

    BaseExpression cond; 
    StatementList statements; 

    public While(BaseExpression cond, StatementList stats) {
        this.cond = cond;
        this.statements = stats; 
    }
}