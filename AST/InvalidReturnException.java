package ast;


public class InvalidReturnException extends BaseULException {

    public InvalidReturnException(String msg, int ln) {
        super(msg, ln); 
    }
}