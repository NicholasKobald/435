package ast;

public class IRReturn extends Instruction {

    Temp t;

    public IRReturn(Temp t) {
        this.t = t; 
    }

    public String toString() {
        if (t == null)
            return "RETURN;"; 
        else
            return String.format("RETURN %s;", t.toCodeString()); 
    }
}