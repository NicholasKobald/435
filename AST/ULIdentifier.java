
package ast;

import org.antlr.runtime.Token;

/*
 * Virtually a Token wrapper? might not be really needed
 * can probably make a template for a lot of this...
 */
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
