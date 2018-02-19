
package ast;

import org.antlr.runtime.Token;

import types.Type; 

public class ULIdentifier extends UnaryExpression {

    public ULIdentifier(Token token) {
        super(token);
    }

    // this is how u HACK
    // starting to be worried about how much depends on this
    public boolean equals(Object o) {
        if (o instanceof ULIdentifier) {
            return this.toString().equals(o.toString()); 
        } else {
            return this.toString().equals(o); 
        }
    }

    public boolean idEquals(String s) {
        return this.toString().equals(s); 
    }

    public Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}
