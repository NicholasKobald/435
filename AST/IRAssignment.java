package ast;

public class IRAssignment extends Instruction {
    
    Temp lhs;
    IRBase rhs; 
    UnaryExpression constantVal; 

    public IRAssignment(Temp lhs, IRBase rhs) {
        this.lhs = lhs;
        this.rhs = rhs; 
    }

    public IRAssignment(Temp lhs, UnaryExpression rhs) {
        this.lhs = lhs;
        this.constantVal = rhs; 
    }

    public String toString() {
        if (constantVal != null)
            return String.format("%s := %s", lhs.toCodeString(), constantVal.toCodeString()); 
        else 
            return String.format("%s := %s", lhs.toCodeString(), rhs.toCodeString()); 

        }
}