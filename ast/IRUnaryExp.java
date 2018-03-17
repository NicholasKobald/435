package ast;

public class IRUnaryExp extends IRExpression {

    IRUnaryOp op;
    Temp t;

    public IRUnaryExp(IRUnaryOp op, Temp t) {
        this.op = op;
        this.t = t; 
    }

    public String toString() {
        return String.format("%s%s%s", 
            this.convertTypeToIrString(t.type), t.toString(), t.toCodeString()); 
    }
}