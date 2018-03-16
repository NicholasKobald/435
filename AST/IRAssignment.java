package ast;

public class IRAssignment extends Instruction {
    
    Temp lhs;
    Temp rhs; 

    public IRAssignment(Instruction lhs, Instruction rhs) {
        this.lhs = lhs;
        this.rhs = rhs; 
    }

    public String toString() {
        return String.format()
    }
}