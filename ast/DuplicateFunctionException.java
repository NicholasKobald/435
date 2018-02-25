package ast;


public class DuplicateFunctionException extends BaseULException {

    public DuplicateFunctionException(String msg, int ln) {
        super(msg, ln); 
        System.out.println("Found duplicate function at line: " + ln); 
    }
}