package ast;

import org.antlr.runtime.Token;

import types.Type; 

public abstract class UnaryExpression extends BaseExpression {

    protected Token token;
    Type type; 

    public UnaryExpression(Token token) {
        this.token = token;
        this.type = null; // trick java into thinking its ok to be accessing the childrens 'type' (which it sort of is)
    }

    public int getLineNumber() {
        return this.token.getLine();
    }

    public int getCharPositionInLine() {
        return this.token.getCharPositionInLine();
    }

    public String toString() {
        return this.token.getText();
    }

    public String toCodeString() {
        return this.toString(); 
    }
    
    public Type accepts(TypeCheckVisitor v) {
        System.out.println("UE TCV called");
        return v.verify(this);
    }
}