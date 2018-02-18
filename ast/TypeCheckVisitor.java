package ast;

import com.sun.jdi.VirtualMachine;

import ast.BaseULException;
import ast.Function;
import types.Type; 
import types.VoidType;

public class TypeCheckVisitor {

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

    Type verify(ExpressionStatement e) {
        return new VoidType(); 
    }

    Type verify(BaseStatement s) {
        System.out.println("Wrong bs");
        return new VoidType(); 
    }

    Type verify(UnaryExpression e) {
        System.out.println("Returning type:" + e.type.toCodeString());
        return e.type; 
    }

    Type verify(BaseExpression be) {
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
}