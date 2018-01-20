package ast;


import types.Type;

public class FunctionDeclaration extends AST {

    ULIdentifier id;
    Type type;
    ParamList params;

    public FunctionDeclaration(Type type, ULIdentifier id, ParamList params ) {
        this.id = id;
        this.type = type;
        this.params = params; 
    }

}
