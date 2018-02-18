package ast;


public class UndeclaredIdentifierException extends BaseULException {

    public UndeclaredIdentifierException(String msg, int ln) {
        super(msg, ln); 
    }
}