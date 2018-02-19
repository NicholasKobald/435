package ast;

import ast.BaseULException;
import ast.Function;
import types.*;

public class TypeCheckVisitor {

    FloatType float_type;
    IntegerType int_type;
    BoolType bool_type;
    CharType char_type;
    StringType string_type;
    VoidType void_type; 
    
    
    public TypeCheckVisitor(FloatType ft, IntegerType int_type, BoolType bool_type, CharType ct, StringType st, VoidType vt) {
        this.float_type = ft;
        this.int_type = int_type;
        this.bool_type = bool_type;
        this.char_type = ct;
        this.string_type = st; 
        this.void_type = vt; 
    }

    GlobalEnvironment globals;
    FunctionEnvironment currentFunction;  

    public void verify(Program p) throws BaseULException { 
        verifyContainsValidMain(p);
        globals = new GlobalEnvironment();
        for (Function f: p) {
            globals.add(f.declaration); 
        }
        for (Function f: p) {
            f.accept(this);
        }
        return; 
    }

    Type verify(Function f) throws BaseULException {
        FunctionEnvironment functionEnv = new FunctionEnvironment(
            f.declaration, f.body.variableList, this.globals);
        this.currentFunction = functionEnv; 
        // creating the function environment checks for 
        // identity uniqueness, so we omit calling `accept` on the function
        // declaration, and variable declarations
        // so at this point, our currently function should be acceptable
        // up until the statement list starts 
        for (BaseStatement s: f.body.statementList) {
            s.accept(this); 
        }
        return new VoidType();
    }

    Type verify(Assignment assignmentStatement) throws BaseULException {
        // verify type of LHS matches RHS i guess
        ULIdentifier lhsid = assignmentStatement.identifier; 
        Type lhs = this.currentFunction.getVariableType(lhsid);
        Type rhs = assignmentStatement.exp.accept(this);
        if (lhs == rhs)
            return lhs;
        String err = String.format("assigning to '%s' from incompatible type '%s'", lhs.toCodeString(), rhs.toCodeString());
        throw new IncompatibleTypesException(err, lhsid.getLineNumber()); 
    }

    Type verify(MultExp e) {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this); 
        if (lhs == rhs) {
            if (lhs == this.int_type || 
                lhs == this.float_type) {
                    return lhs; 
                }
        }
        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, e.getLineNumber()); // TODO
    }

    Type verify(AddExp e) throws BaseULException {
        return this.verifyBinaryMathExp(e); 
    }
    
    Type verify(SubExp e) throws BaseULException {
        return this.verifyBinaryMathExp(e); 
    }

    Type verify(EqualityEqExp e) throws BaseULException {
        return this.verifyBooleanExp(e);
    }
    Type verify(EqualityLTExp e) throws BaseULException {
        return this.verifyBooleanExp(e);
    }

    Type verify(If iff) throws BaseULException {
        System.out.println("Verifying If..");
        Type cond = iff.cond.accept(this);
        if (cond != bool_type) {
            String err = String.format("Expected 'boolean' got %s in if statement expression.", cond); 
            throw new IncompatibleTypesException(err, iff.cond.getLineNumber()); // TODO      
        }
        for (BaseStatement s: iff.statements) {
            s.accept(this); 
        }
        if (iff.elseStatements != null) {
            for (BaseStatement s: iff.elseStatements) {
                s.accept(this); 
            }
        }
        return void_type; // ?
    }

    Type verify(While ws) throws BaseULException {
        Type cond = ws.cond.accept(this);
        if (cond != bool_type) {
            String err = String.format("Expected 'boolean' got %s in while statement expression.", cond); 
            throw new IncompatibleTypesException(err, ws.cond.getLineNumber());           
        }
        for (BaseStatement s: ws.statements) {
            s.accept(this); 
        } 
        return void_type; // ?   
    }

    Type verify(ExpressionStatement e) {
        return new VoidType(); 
    }

    Type verify(BaseStatement s) {
        return new VoidType(); 
    }

    Type verify(BaseExpression be) throws BaseULException {
        return new VoidType();
    }

    void verify(FunctionDeclaration fd) {

    }

    void verify(FunctionBody fb) {

    }

    void verify(ParamList pl) {

    }

    void verify(Param p) {

    }

    // ad nauseum ... 

    /*
     * Verifies Program p contains a main that is of VoidType, and takes no paramaters. 
     */
    private static void verifyContainsValidMain(Program p) throws BaseULException {
        int valid_main_count = 0;
        for (Function f: p) {
            if(isValidMain(f.declaration)) {
                valid_main_count += 1; 
            }
        }
        if (valid_main_count != 1)       
            throw new MissingMainException("", 0); // does 0 make sense?  --> negative number that gets handled by the printing maybe
        // potentailly I can make MME take only 1 param without fuckingshitup
    }

    private static boolean isValidMain(FunctionDeclaration fd) {
        return fd.id.equals("main") && fd.type instanceof VoidType && fd.params.size() == 0; 
    }

    private Type verifyBinaryMathExp(BinaryExpression e) throws BaseULException {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this); 
        if (lhs == rhs) {
            if (lhs == this.int_type || 
                lhs == this.float_type) {
                    return lhs; 
                }
        }
        // todo Char and Int stuff?
        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, 0); // TODO
    }

    private Type verifyBooleanExp(BinaryExpression e) throws BaseULException {
        System.out.println("Verifying equality exp");
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this);
        if ((lhs == float_type || lhs == int_type) && (rhs == float_type || rhs == int_type)) {
            return bool_type;
        } 
        if (lhs == rhs) 
            return bool_type; 

        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, e.getLineNumber()); // TODO  
    }

    Type verify(ULString s) {
        return s.type; 
    }
    Type verify(ULInteger s) {
        return s.type; 
    }
    Type verify(ULChar s) {
        return s.type; 
    }
    Type verify(ULFloat s) {
        return s.type; 
    }
    Type verify(ULBool s) {
        return s.type; 
    }
}