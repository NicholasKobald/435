package ast; 


public class BaseULException extends Exception {

    protected int lineCrashed;

    public BaseULException(String msg, int lineNumber) {
        super(msg); 
        this.lineCrashed = lineNumber; 
    }
}