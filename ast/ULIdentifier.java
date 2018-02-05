
package ast;

import org.antlr.runtime.Token;


public class ULIdentifier extends UnaryExpression {


    public ULIdentifier(Token token) {
        super(token);
    }

    public boolean equals(Object o) {
        return this.token.getText().equals(o); 
    }
}
