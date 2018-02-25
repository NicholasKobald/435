package ast;


public class InvalidTypeException extends BaseULException {

    public InvalidTypeException(String msg, int ln) {
        super(msg, ln); 
    }
}