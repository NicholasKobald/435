package ast;


public class InvalidFunctionInvocationException extends BaseULException {

    public InvalidFunctionInvocationException(String msg, int ln) {
        super(msg, ln); 
    }
}