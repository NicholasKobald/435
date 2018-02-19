package ast;

import types.Type;


public class FunctionDeclaration extends AST {

    ULIdentifier id;
    Type type;
    ParamList params;

    public FunctionDeclaration(Type type, ULIdentifier id, ParamList params) {
        this.id = id;
        this.type = type;
        this.params = params; 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (!(o instanceof FunctionDeclaration)) return false; 
        
        FunctionDeclaration declaration = (FunctionDeclaration)o;
        return declaration.id.equals(this.id.toString()) && declaration.type == this.type && declaration.params.equals(this.params); 
    }
}
