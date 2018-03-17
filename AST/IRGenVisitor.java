package ast;

import java.util.HashMap;
import java.util.LinkedList;

import ast.Assignment;
import ast.BaseULException;
import ast.Function;
import ast.IRAssignment;
import ast.IRConstantAssignment;
import ast.IRInvert;
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

    public String getIRRepresenation() {
        return this.irProgram.toString(); 
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
            Temp t = tf.getTemp(vd.type); 
            idToTempNumber.put(vd.id.toString(), t.tempId); 
        }
        this.irProgram.addFunction(irFunction); 

        for (BaseStatement st: f.body.statementList) {
           st.accept(this); 
        }
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
        // if either are a float, the expression is coerced into a float
        // lets worry about chars later, maybe?
        if (lhs.type == float_type || rhs.type == float_type) {
            result = tf.getTemp(float_type); 
        } else {
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
        // lets worry about chars later, maybe?
        if (lhs.type == float_type || rhs.type == float_type) {
            result = tf.getTemp(float_type); 
        } else {
            result = tf.getTemp(int_type); 
        }
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "+");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
    }

    public Temp gen(MultExp ae) throws BaseULException {
        Temp lhs = ae.operand_one.accept(this); 
        Temp rhs = ae.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        if (lhs.type == float_type || rhs.type == float_type) {
                result = tf.getTemp(float_type);
        } else {
            result = tf.getTemp(int_type); 
        }
        IRBinaryExp irBin = new IRBinaryExp(lhs, rhs, optype, "*");
        IRAssignment a = new IRAssignment(result, irBin); 
        this.irFunction.addInstruction(a);
        return result; 
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

    public Temp gen(Print ps) throws BaseULException {
        Instruction ins; 
        Temp t = ps.exp.accept(this);
        ins = new IRPrint(t, ps.exp_type, ps.newLine); 
        this.irFunction.addInstruction(ins); 
        return null; 
    }

    public Temp gen(ULIdentifier id) throws BaseULException {
        return this.irFunction.getTempById(idToTempNumber.get(id.toCodeString())); 
    }

    public Temp gen(UnaryExpression ue) throws BaseULException {
        System.out.println("Some unary expression might be missing its visitor methods."); 
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
