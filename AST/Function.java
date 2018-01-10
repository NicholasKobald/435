package ast;

public class Function {

    FunctionDeclaration declaration;
    FunctionBody body;

    public void fillFunction(FunctionDeclaration declaration, FunctionBody body) {
        System.out.println("Fillin up dis func tho");
        this.declaration = declaration;
        this.body = body;
        System.out.println(this.toString());
    }

    public String toString() {
        return this.declaration.toString() + "\n" + this.body.toString();
    }
}
