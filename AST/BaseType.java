package ast;

import org.antlr.runtime.Token;

public class BaseType {
    //lets just use this as our only type for now...

    Token token;

    public BaseType(Token t) {
        this.token = t;
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
}
