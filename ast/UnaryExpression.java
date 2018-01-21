package ast;

import org.antlr.runtime.Token;


public abstract class UnaryExpression extends BaseExpression {

    Token token;

    public UnaryExpression(Token token) {
        this.token = token;
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
}