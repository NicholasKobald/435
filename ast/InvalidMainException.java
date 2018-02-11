package ast;


public class InvalidMainException extends BaseULException {

    public InvalidMainException(String msg, int ln) {
        super(msg, ln); 
    }
}