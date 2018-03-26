package ast;

import java.util.HashMap;
import java.util.LinkedList;

import ast.Assignment;
import ast.BaseULException;
import ast.Function;
import ast.IRAssignment;
import ast.IRConstantAssignment;
import ast.IRInvert;
import ast.IRProgram;
import ast.Instruction;
import ast.TempFactory;
import ast.ULBool;
import ast.ULIdentifier;
import ast.VariableDeclaration;
import types.*; 


public class IRGenVisitor {

    IRProgram irProgram; 
    IRFunction irFunction;
    TempFactory tf; 
    IRLabelFactory lf; 
    HashMap<String, Integer> idToTempNumber; 

    GlobalEnvironment globals; 
    FunctionEnvironment currentFunction; 

    FloatType float_type;
    IntegerType int_type;
    BoolType bool_type;
    CharType char_type;
    StringType string_type;
    VoidType void_type; 
    
    public IRGenVisitor(FloatType ft, IntegerType int_type, BoolType bool_type, CharType ct, StringType st, VoidType vt) {
        this.float_type = ft;
        this.int_type = int_type;
        this.bool_type = bool_type;
        this.char_type = ct;
        this.string_type = st; 
        this.void_type = vt;
    }

    public IRProgram getIRProgram() {
        return this.irProgram; 
    }

    public String getIRRepresenation(String sourceName) {
        return this.irProgram.toString(sourceName); 
    }

    public void gen(Program p) throws BaseULException {
        this.irProgram = new IRProgram();  
        this.lf = new IRLabelFactory(); 
        globals = new GlobalEnvironment();
        for (Function f: p) {       
            globals.add(f.declaration); 
        }

        for (Function f: p) {
            f.accept(this); 
        }   
    }

    public void gen(Function f) throws BaseULException  {
        // String tstring = convertTypetoIrString(f.type()); 
        // String dec = String.format("FUNC %s %s {", f.funcName(), tstring);
        this.irFunction = new IRFunction(f.type(), f.funcName(), f.declaration.params); 
        this.idToTempNumber = new HashMap<String, Integer>(); 
        this.tf = new TempFactory(this.irFunction); 
        for (Param p: f.declaration.params.formals) {
            Temp t = tf.getTemp(p.type); 
            idToTempNumber.put(p.id.toString(), t.tempId); 
        }
        for (VariableDeclaration vd: f.body.variableList) {
            if (vd.type instanceof ArrayType) {
                vd.accept(this); 
            } else {
                Temp t = tf.getTemp(vd.type); 
                idToTempNumber.put(vd.id.toString(), t.tempId); 
            }
        }
        this.irProgram.addFunction(irFunction); 

        for (BaseStatement st: f.body.statementList) {
           st.accept(this); 
        }

        this.irFunction.addInstruction(new IRReturn(null)); 
    }

    public Temp gen(Assignment a) throws BaseULException {
        // need a temp to hold the value of the expression 
        Temp source = a.exp.accept(this); 
        Temp target = this.irFunction.getTempById(this.idToTempNumber.get(a.identifier.toCodeString())); 
        IRTempToTempAssignment irAssignment = new IRTempToTempAssignment(target, source);
        this.irFunction.addInstruction(irAssignment);
        return target;
    }

    public Temp gen(SubExp ae) throws BaseULException {
        Temp lhs = ae.operand_one.accept(this); 
        Temp rhs = ae.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        if (lhs.type == float_type || rhs.type == float_type) {
            optype = float_type; 
            if (rhs.type == int_type) {
                rhs = this.convertTemp(rhs, int_type, float_type); 
            } else if (lhs.type == int_type) {
                lhs = this.convertTemp(lhs, int_type, float_type); 
            }
            result = tf.getTemp(float_type);
        } else {
            optype = int_type; 
            result = tf.getTemp(int_type); 
        }
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "-");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
    }

    
    public Temp gen(AddExp ae) throws BaseULException {
        Temp lhs = ae.operand_one.accept(this); 
        Temp rhs = ae.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        // if either are a float, the expression is coerced into a float
        if (lhs.type == float_type || rhs.type == float_type) {
            optype = float_type; 
            if (rhs.type == int_type) {
                rhs = this.convertTemp(rhs, int_type, float_type); 
            } else if (lhs.type == int_type) {
                lhs = this.convertTemp(lhs, int_type, float_type); 
            }
            result = tf.getTemp(float_type);
        } else {
            optype = int_type; 
            result = tf.getTemp(int_type); 
        }
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "+");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
    }

    public Temp gen(MultExp ae) throws BaseULException {
        Instruction ins; 
        Temp lhs = ae.operand_one.accept(this); 
        Temp rhs = ae.operand_two.accept(this);
        Temp result; 
        Type optype; 
        if (lhs.type == float_type || rhs.type == float_type) {
            optype = float_type; 
            if (rhs.type == int_type) {
                rhs = this.convertTemp(rhs, int_type, float_type); 
            } else if (lhs.type == int_type) {
                lhs = this.convertTemp(lhs, int_type, float_type); 
            }
            result = tf.getTemp(float_type);
        } else {
            optype = int_type; 
            result = tf.getTemp(int_type); 
        }
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "*");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
    }

    private Temp convertTemp(Temp t, Type from, Type to) {
        Instruction ins; 
        Temp new_rh = this.tf.getTemp(float_type);
        ins = new IRConversion(new_rh, from, to, t); 
        this.irFunction.addInstruction(ins); 
        return new_rh;  
    }

    public Temp gen(EqualityEqExp e) throws BaseULException {
        Temp lhs = e.operand_one.accept(this); 
        Temp rhs = e.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        result = tf.getTemp(bool_type); 
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "==");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
    }

    public Temp gen(ParanthesisExpression pe) throws BaseULException {
        return pe.wrapped_expr.accept(this); 
    }

    public Temp gen(EqualityLTExp e) throws BaseULException {
        Temp lhs = e.operand_one.accept(this); 
        Temp rhs = e.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        result = tf.getTemp(bool_type); 
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "<");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
    }

    public Temp gen(If iff) throws BaseULException {
        Instruction ins; 
        IRLabel l1 = lf.getLabel();
        IRLabel l2 = lf.getLabel(); 

        Temp t = iff.cond.accept(this); 

        // this stores the result of the boolean expression
        Temp exp = this.tf.getTemp(bool_type);
        ins = new IRTempToTempAssignment(exp, t);
        this.irFunction.addInstruction(ins);

        // invert it, 
        ins = new IRAssignment(exp, new IRUnaryExp(new IRInvert(), exp)); 
        this.irFunction.addInstruction(ins);

        // if it's true now, take the GOTO to the end of the IF block
        ins = new IRIf(exp, l1);
        this.irFunction.addInstruction(ins); 

        for (BaseStatement s: iff.statements) {
            s.accept(this); 
        }

        this.irFunction.addInstruction(new IRGoto(l2));   
        this.irFunction.addInstruction(l1);

        if (iff.elseStatements != null) {
            for (BaseStatement s: iff.elseStatements) {
                s.accept(this); 
            }
        }
        this.irFunction.addInstruction(l2); 
        return null; 
    }

    public Temp gen(While w) throws BaseULException {
        Instruction ins; 
        IRLabel l1 = lf.getLabel();
        IRLabel l2 = lf.getLabel(); 
        
        //place a label at the top, before we check the condition, to loop
        this.irFunction.addInstruction(l2); 

        Temp t = w.cond.accept(this);
        Temp exp = this.tf.getTemp(bool_type); 
        ins = new IRTempToTempAssignment(exp, t);
        this.irFunction.addInstruction(ins);

        //invert the expression 
        ins = new IRAssignment(exp, new IRUnaryExp(new IRInvert(), exp));
        this.irFunction.addInstruction(ins); 
        

        // if it's true, take the GOTO to the end of the while block. 
        ins = new IRIf(exp, l1); 
        this.irFunction.addInstruction(ins);

        for (BaseStatement s: w.statements) {
            s.accept(this); 
        }

        this.irFunction.addInstruction(new IRGoto(l2)); 
        this.irFunction.addInstruction(l1); 

        return null; 
    }

    public Temp gen(Print ps) throws BaseULException {
        Instruction ins; 
        Temp t = ps.exp.accept(this);
        ins = new IRPrint(t, ps.exp_type, ps.newLine); 
        this.irFunction.addInstruction(ins); 
        return null; 
    }

    public Temp gen(FunctionCall fc) throws BaseULException {
        Instruction ins;
        LinkedList<Temp> params = new LinkedList<Temp>(); 
        for (BaseExpression e: fc.expList.expList) {
            Temp t = e.accept(this); 
            params.add(t); 
        }
        FunctionDeclaration callee = this.globals.getFunctionById(fc.id); 
        Temp result = null; 
        if (callee.type != void_type)
            result = tf.getTemp(callee.type); 
        
        ins = new IRFunctionCall(result, callee.id.toCodeString(), params);
        this.irFunction.addInstruction(ins);
        return result;  
    }

    public Temp gen(Return r) throws BaseULException {
        Instruction ins;
        Temp op = null; 
        if (r.exp != null) {
            op = r.exp.accept(this); 
        }
        ins = new IRReturn(op); 
        this.irFunction.addInstruction(ins);
        return null; 
    }

    public Temp gen(ArrayAssignment as) throws BaseULException {
        Temp rhs = as.expression.accept(this);
        Temp indexOp = as.indexExp.accept(this);
        Temp lhs = this.irFunction.getTempById(this.idToTempNumber.get(as.ulid.toCodeString()));
        Instruction ins = new IRArrayAssignment(lhs, indexOp, rhs);
        this.irFunction.addInstruction(ins);
        return null;
    }

    public Temp gen(ArrayExpression ae) throws BaseULException {
        Temp array = this.irFunction.getTempById(this.idToTempNumber.get(ae.id.toCodeString()));
        Temp index = ae.index.accept(this); 
        Temp result = tf.getTemp(ae.atomicType);
        Instruction ins = new IRArrayExpression(result, array, index);
        this.irFunction.addInstruction(ins);
        return result; 
    }

    public Temp gen(VariableDeclaration v) {
        // this should only be called with an array declaration
        ArrayType at = (ArrayType)v.type;
        Type atomicType = at.type; 
        Temp res = tf.getTemp(v.type); 
        IRArrayDec ins = new IRArrayDec(res, atomicType, at.size);
        this.irFunction.addArrayDec(ins); 
        this.idToTempNumber.put(v.id.toString(), res.tempId); 
        return res; 
    }

    public Temp gen(ULIdentifier id) throws BaseULException {
        return this.irFunction.getTempById(idToTempNumber.get(id.toCodeString())); 
    }


    public Temp gen(UnaryExpression ue) throws BaseULException {
        System.out.println("Some unary expression might be missing its visitor methods."); 
        return null; 
    }

    public Temp gen(ExpressionStatement es) throws BaseULException {
        if (es.exp != null) 
            return es.exp.accept(this);
        return null; 
    }

    public Temp gen(BaseExpression be) {
        System.out.println("Did you not implemenet the visitor methods on some expression?");
        return null; 
    }

    public Temp gen(BaseStatement d) throws BaseULException {
        System.out.println("Could you have forgotten to implement the visitor method on some statement?");
        return null; 
    }

    Temp gen(ULString s) {
        Temp t = tf.getTemp(s.type);
        IRConstantAssignment a = new IRConstantAssignment(t, s);
        this.irFunction.addInstruction(a); 
        return t; 
    }

    Temp gen(ULInteger s) {
        Temp t = tf.getTemp(s.type);
        IRConstantAssignment a = new IRConstantAssignment(t, s);
        this.irFunction.addInstruction(a); 
        return t;     
    }

    Temp gen(ULChar s) {
        Temp t = tf.getTemp(s.type);
        IRConstantAssignment a = new IRConstantAssignment(t, s);
        this.irFunction.addInstruction(a); 
        return t;    
    }

    Temp gen(ULFloat s) {
        Temp t = tf.getTemp(s.type);
        IRConstantAssignment a = new IRConstantAssignment(t, s);
        this.irFunction.addInstruction(a); 
        return t;     
    }

    Temp gen(ULBool s) {
        Temp t = tf.getTemp(s.type);
        IRConstantAssignment a = new IRConstantAssignment(t, s);
        this.irFunction.addInstruction(a); 
        return t; 
    }
}
