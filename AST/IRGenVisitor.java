package ast;

import java.util.HashMap;
import java.util.LinkedList;

import ast.Assignment;
import ast.BaseULException;
import ast.Function;
import ast.IRConstantAssignment;
import ast.TempFactory;
import ast.ULBool;
import ast.ULIdentifier;
import ast.VariableDeclaration;
import types.*; 


public class IRGenVisitor {

    IRProgram irProgram; 
    IRFunction irFunction;
    TempFactory tf; 
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
        IRBinaryExp irBin = new IRBinaryExp(result, lhs, rhs, optype, "-");
        this.irFunction.addInstruction(irBin);
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
        IRBinaryExp irBin = new IRBinaryExp(result, lhs, rhs, optype, "+");
        this.irFunction.addInstruction(irBin);
        return result; 
    }

    public Temp gen(MultExp ae) throws BaseULException {
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
        IRBinaryExp irBin = new IRBinaryExp(result, lhs, rhs, optype, "*");
        this.irFunction.addInstruction(irBin);
        return result; 
    }

    public Temp gen(EqualityEqExp e) throws BaseULException {
        Temp lhs = e.operand_one.accept(this); 
        Temp rhs = e.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        // if either are a float, the expression is coerced into a float
        // lets worry about chars later, maybe?
        result = tf.getTemp(bool_type); 
        IRBinaryExp irBin = new IRBinaryExp(result, lhs, rhs, optype, "==");
        this.irFunction.addInstruction(irBin);
        return result; 
    }

    public Temp gen(EqualityLTExp e) throws BaseULException {
        Temp lhs = e.operand_one.accept(this); 
        Temp rhs = e.operand_two.accept(this);
        Temp result; 
        Type optype = lhs.type; 
        // if either are a float, the expression is coerced into a float
        // lets worry about chars later, maybe?
        result = tf.getTemp(bool_type); 
        IRBinaryExp irBin = new IRBinaryExp(result, lhs, rhs, optype, "<");
        this.irFunction.addInstruction(irBin);
        return result; 
    }

    public Temp gen(ULIdentifier id) throws BaseULException {
        return this.irFunction.getTempById(idToTempNumber.get(id.toCodeString())); 
    }

    public Temp gen(UnaryExpression ue) throws BaseULException {
        System.out.println("Generating Unary Exp?"); 
        return null; 
    }

    public Temp gen(BaseExpression be) {
        System.out.println("This is BAD. BAD BAD.");
        return null; 
    }

    public Temp gen(BaseStatement d) throws BaseULException {
        System.out.println("Something went terrible terribly wrong");
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
