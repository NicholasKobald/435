package ast;

public class FunctionBody {

    String temp;

    public FunctionBody(String body) {
        this.temp = body;
    }

    public String toString() {
        return this.temp;
    }
}
