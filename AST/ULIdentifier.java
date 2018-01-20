
package ast;

import org.antlr.runtime.Token;


public class ULIdentifier extends BaseExpression {

    Token token;

    public ULIdentifier(Token token) {
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
}
