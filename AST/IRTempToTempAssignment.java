package ast;

public class IRTempToTempAssignment extends Instruction { 
    
    Temp lhs;
    Temp rhs;

    public IRTempToTempAssignment(Temp lhs, Temp rhs) {
        this.lhs = lhs;
        this.rhs = rhs; 
    }

    public String toString() {
        System.out.println(lhs);
        System.out.println(rhs); 
        return String.format("%s := %s;", lhs.toCodeString(), rhs.toCodeString()); 
    }
}