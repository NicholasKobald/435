package ast;

import org.antlr.runtime.Token;

public class BaseExpression {

    String token;

    public BaseExpression(String t) {
        this.token = t;
    }

/*
    public int getLineNumber() {
        return this.token.getLine();
    }

    public int getCharPositionInLine() {
        return this.token.getCharPositionInLine();
    }
*/
    public String toString() {
        return token;
    }
}
