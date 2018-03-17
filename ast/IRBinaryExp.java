package ast;

import types.Type; 

public class IRBinaryExp extends IRExpression {

    Temp op1;
    Temp op2;
    String operand;
    Type optype; 

    public IRBinaryExp(Temp op1, Temp op2, Type optype, String operand) {
        this.op1 = op1;
        this.op2 = op2;
        this.operand = operand;  
        this.optype = optype; 
    }

    public String toString() {
        return String.format("%s %s%s %s",
            op1.toCodeString(), this.convertTypeToIrString(optype), operand, op2.toCodeString());
    }
}