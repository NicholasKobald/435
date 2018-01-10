package ast;

public class Function {

    FunctionDeclaration declaration;
    FunctionBody body;

    public void fillFunction(FunctionDeclaration declaration, FunctionBody body) {
        System.out.println("Recieved declaration and body at func");
        this.declaration = declaration;
        this.body = body;
    }

    public String toString() {
        return this.declaration.toString() + this.body.toString();
    }
}
