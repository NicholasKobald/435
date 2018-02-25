package ast;


public class IncompatibleTypesException extends BaseULException {

    public IncompatibleTypesException(String msg, int ln) {
        super(msg, ln); 
    }
}