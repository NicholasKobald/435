package ast;

public class IRAssignment extends Instruction { 

    Temp lhs;
    IRExpression rhs; 

    public IRAssignment(Temp lhs, IRExpression e) {
        this.lhs = lhs;
        this.rhs = e;  
    }

    public String toString() {
        return String.format("%s := %s;", lhs.toCodeString(), rhs.toString()); 
    }
}
