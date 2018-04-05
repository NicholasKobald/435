package ast;

import types.*; 

public class IRBinaryExp extends IRExpression {

    Temp op1;
    Temp op2;
    String operand;
    Type optype; 
    int n; 

    public IRBinaryExp(Temp op1, Temp op2, Type optype, String operand, int n) {
        this.op1 = op1;
        this.op2 = op2;
        this.operand = operand;  
        this.optype = optype; 
        this.n = n; // dw about me 
    }

    public String toString() {
        return String.format("%s %s%s %s",
            op1.toCodeString(), this.convertTypeToIrString(optype), operand, op2.toCodeString());
    }

    public String toJasminString() {
        String [] sa ; 
        if (this.operand.equals("==") || this.operand.equals("<")) {
            sa = new String[] { 
                String.format("%s %d", this.convertTypeToLoadString(op1.type), op1.tempId), 
                String.format("%s %d", this.convertTypeToLoadString(op2.type), op2.tempId), 
                this.convertTypeToSubString(optype),
                String.format("%s %s", this.jasminOp(), labelOne()),
                "ldc 0", // false case 
                String.format("goto %s", labelTwo()), 
                String.format("%s:", labelOne()), 
                "ldc 1", // true case
                String.format("%s:", labelTwo())
            };
        } else {
            sa = new String[] { 
                String.format("%s %d", this.convertTypeToLoadString(op1.type), op1.tempId), 
                String.format("%s %d", this.convertTypeToLoadString(op2.type), op2.tempId),
                jasminOp()
            };
        }

        return strJoin(sa, "\n    "); // :-)  
    }

    protected String convertTypeToSubString(Type t) {
        if (t instanceof FloatType)
            return "fsub";
        if (t instanceof IntegerType)
            return "isub"; 

        return "Tried to convert invalid sub string!"; 
    }

    private String jasminOp() {
        if (this.operand.equals("<")) {
            return "iflt"; 
        } else if(this.operand.equals("==")) {
            return "ifeq"; 
        }

        return String.format("%s%s", this.toJasminType(this.optype), this.jasminInstruction()); 
    }

    private String jasminInstruction() {
        if (this.operand.equals("*")) 
            return "mul";
        if (this.operand.equals("+")) 
            return "add";
        if (this.operand.equals("-"))
            return "sub";

        return "oh FUCK"; 
    }

    // hacks
    private String labelOne() {
        return String.format("L_%d", n + 1); 
    }

    private String labelTwo() {
        return String.format("L_%d", n + 2); 
    }

}