
package ast;

import org.antlr.runtime.Token;


public class ULIdentifier extends UnaryExpression {


    public ULIdentifier(Token token) {
        super(token);
    }

    // this is how u HACK
    public boolean equals(Object o) {
        return this.toString().equals(o); 
    }
}
