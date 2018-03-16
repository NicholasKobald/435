package ast;

import java.util.Iterator;

import types.Type; 


public class Function extends AST {

    public FunctionDeclaration declaration;
    public FunctionBody body;

    public void fillFunction(FunctionDeclaration declaration, FunctionBody body) {
        this.declaration = declaration;
        this.body = body;
    }

    public String toString() {
        return this.declaration.toString() + "\n" + this.body.toString();
    }

    public Type type() {
        return this.declaration.type; 
    }

    public Iterator<Param> params() {
        return this.declaration.params.iterator(); 
    }

    public String funcName() {
        return this.declaration.id.toCodeString(); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
    
    void accept(IRGenVisitor v) throws BaseULException {
        v.gen(this); 
    }

    void accept(TypeCheckVisitor v) throws BaseULException {
        v.verify(this); 
    }
}
