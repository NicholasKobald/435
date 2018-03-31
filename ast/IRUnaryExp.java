package ast;

public class IRUnaryExp extends IRExpression {

    IRUnaryOp op;
    Temp t;

    public IRUnaryExp(IRUnaryOp op, Temp t) {
        this.op = op;
        this.t = t; 
    }

    public String toJasminString() {
        String[] sa = new String[] {
            String.format("%s %d", this.convertTypeToLoadString(t.type), t.tempId),
            "ldc 1", 
            String.format("%sxor", this.toJasminType(t.type)),
        };
        return this.strJoin(sa, "\n    ");
    }


    
    public String toString() {
        return String.format("%s%s%s", 
            this.convertTypeToIrString(t.type), op.toString(), t.toCodeString()); 
    }
}
