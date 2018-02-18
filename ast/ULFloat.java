package ast;

import org.antlr.runtime.Token;

import types.FloatType; 
import types.Type;

public class ULFloat extends UnaryExpression {

    public FloatType type;

    public ULFloat(Token token, FloatType ft) {
        super(token);
        this.type = ft; 
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}