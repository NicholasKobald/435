package ast; 


public class BaseULException extends Exception {

    public int lineCrashed;
    public String msg; 

    public BaseULException(String msg, int lineNumber) {
        super(msg); 
        this.lineCrashed = lineNumber;
        this.msg = msg; 
    }
}