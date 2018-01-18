package ast;


public class Return extends BaseStatement { 

    BaseExpression exp; 

    public Return() {
        this.exp = null; 
    }

    public Return(BaseExpression exp) {
        this.exp = exp; 
    }
}