package ast;

import org.antlr.runtime.Token;

import types.BoolType;
import types.Type; 

public class ULBool extends UnaryExpression {

    public BoolType type; 

    public ULBool(Token token, BoolType bt) {
        super(token);
        this.type = bt;  
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }

    Temp accept(IRGenVisitor v) throws BaseULException {
        return v.gen(this); 
    }
    
    public String toString() {
        return this.token.getText();
    }

    public String toCodeString() {
        return this.toString().toUpperCase(); 
    }
    
    public String toJasminString() {
        return this.toString().equals("true") ? "1" : "0"; 
    }
}