package ast;

import types.Type; 

public class IRBinaryExp extends IRAssignment {

    Temp lhs;
    Temp op1;
    Temp op2;
    String operand;
    Type optype; 

    public IRBinaryExp(Temp lhs, Temp op1, Temp op2, Type optype, String operand) {
        this.lhs = lhs;
        this.op1 = op1;
        this.op2 = op2;
        this.operand = operand;  
        this.optype = optype; 
    }

    public String toString() {
        return String.format("%s := %s %s%s %s;",
            lhs.toCodeString(), op1.toCodeString(), this.convertTypeToIrString(optype), operand, op2.toCodeString());
    }
}