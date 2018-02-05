package ast;


public class MissingMainException extends BaseULException {

    public MissingMainException(String msg, int ln) {
        super(msg, ln); 
    }
}