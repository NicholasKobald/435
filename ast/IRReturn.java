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

    public String getJasminString() {
        if (t == null) 
            return "return";
        else 
            return String.format("ret %d", t.tempId); 
    }

    public String[] getJasminStrings() {
        return new String[] {this.getJasminString()};
    }
}