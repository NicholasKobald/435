package ast;

public class IRTempToTempAssignment extends IRAssignment { 
    
    Temp lhs;
    Temp rhs;

    public IRTempToTempAssignment(Temp lhs, Temp rhs) {
        this.lhs = lhs;
        this.rhs = rhs; 
    }

    public String toString() {
        return String.format("%s := %s;", lhs.toCodeString(), rhs.toCodeString()); 
    }
}