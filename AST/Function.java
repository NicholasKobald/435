package ast;

public class Function {

    FunctionDeclaration declaration;
    FunctionBody body;

    public void fillFunction(FunctionDeclaration declaration, FunctionBody body) {
        this.declaration = declaration;
        this.body = body;
    }

    public String toString() {
        return this.declaration.toString() + "\n" + this.body.toString();
    }
}
