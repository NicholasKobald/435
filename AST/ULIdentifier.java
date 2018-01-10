
package ast;

public class ULIdentifier {

    String id;

    public ULIdentifier(String token) {
        this.id = token;
    }

    public String ToString() {
        return this.id;
    }
}
