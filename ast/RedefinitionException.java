package ast;


public class RedefinitionException extends BaseULException {

    public RedefinitionException(String msg, int ln) {
        super(msg, ln); 
    }
}