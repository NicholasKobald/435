package ast;

public class Function {

    FunctionDeclaration declaration;
    FunctionBody body;

    public void fillFunction(FunctionDeclaration declaration, FunctionBody body) {
        System.out.println("Init function");
        this.declaration = declaration;
        this.body = body;
        //print self out
        System.out.println(this.toString());
    }

    public String toString() {
        return this.declaration.toString() + "\n" + this.body.toString();
    }
}
