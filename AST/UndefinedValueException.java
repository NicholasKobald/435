package ast;


public class UndefinedValueException extends BaseULException {

    public UndefinedValueException(String msg, int ln) {
        super(msg, ln); 
    }
}