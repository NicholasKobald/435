package ast;

public class FunctionDeclaration extends AST {

    ULIdentifier id;
    BaseType type;
    ParamList params;

    public FunctionDeclaration(ULIdentifier id, BaseType type, ParamList params ) {
        this.id = id;
        this.type = type;
        this.params = params; 
    }

}
