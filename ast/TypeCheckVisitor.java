package ast;

import java.util.ArrayList;

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
        int retcount = 0;
        BaseStatement cur = null; 
        Type t = null; 
        for (BaseStatement s: f.body.statementList) {
            if (s instanceof Return) {
                retcount += 1; 
            }
            cur = s; 
            t = s.accept(this); 
        }

        if (retcount == 1 && cur instanceof Return) {
            // now, verify that the type of the return exp is the same
            // as the function says it is
            if (t == f.declaration.type) {
                return t; 
            } else {
                String msg = String.format("Incompatible return type '%s'. Expected: '%s'", 
                    t.toCodeString(), f.declaration.type.toCodeString()); 
                throw new IncompatibleTypesException(msg, f.declaration.id.getLineNumber());
            }
        } else if (retcount == 0) {
            if (this.currentFunction.returnType == void_type)
                return void_type;
            String msg = String.format("No return statement for function with type '%s'", this.currentFunction.returnType.toCodeString()); 
            throw new InvalidReturnException(msg, f.declaration.id.getLineNumber()); 
        } else {
            String msg = "Function may only have return as last statement"; 
            throw new InvalidReturnException(msg, f.declaration.id.getLineNumber());
        }
    }

    Type verify(Assignment assignmentStatement) throws BaseULException {
        // verify type of LHS matches RHS i guess
        ULIdentifier lhsid = assignmentStatement.identifier;
        this.currentFunction.setUsed(lhsid); 
        Type lhs = this.currentFunction.getVariableType(lhsid);
        Type rhs = assignmentStatement.exp.accept(this);
        if (lhs == rhs)
            return lhs;
        String err = String.format("Assigning to '%s' from incompatible type '%s'", lhs.toCodeString(), rhs.toCodeString());
        throw new IncompatibleTypesException(err, lhsid.getLineNumber()); 
    }

    Type verify(ArrayAssignment as) throws BaseULException {
        Type rhs = as.expression.accept(this);
        Type indextype = as.indexExp.accept(this); 
        if (indextype != int_type) {
            String msg = String.format("Invalid type for array index. '%s' could not be coerced to 'int'", indextype.toCodeString());
            throw new IncompatibleTypesException(msg, as.ulid.getLineNumber()); 
        }
        ArrayType lhs = (ArrayType)this.currentFunction.getVariableType(as.ulid);
        if (lhs.type == rhs) {
            return rhs; 
        }
        String err = String.format("Assigning to '%s' from incompatible type '%s'", lhs.type.toCodeString(), rhs.toCodeString());
        throw new IncompatibleTypesException(err, as.ulid.getLineNumber()); 
    }

    Type verify(MultExp e) throws BaseULException {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this);
        // int + int 
        if (lhs == int_type && rhs == int_type) {
            return int_type; 
        }
        // int|float + int|float  
        if (rhs == int_type || rhs == float_type) {
            if (lhs == this.int_type || lhs == this.float_type) {
                return float_type; 
            }
        } 
        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, e.getLineNumber());
    }

    Type verify(AddExp e) throws BaseULException {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this);
        // int + int 
        if (lhs == int_type && rhs == int_type) {
            return int_type; 
        }
        // int|float + int|float  
        if (rhs == int_type || rhs == float_type) {
            if (lhs == this.int_type || lhs == this.float_type) {
                return float_type; 
            }
        } // (int|char + int)|(int + int|char)
        else if ((rhs == char_type && lhs == int_type) || lhs == char_type && rhs == int_type) {
            return char_type; 
        } else if (lhs == rhs && lhs == string_type) {
            return string_type;
        }
        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, 0); // TODO
    }
    
    Type verify(SubExp e) throws BaseULException {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this);
        // int + int 
        if (lhs == int_type && rhs == int_type) {
            return int_type; 
        }
        // int|float + int|float  
        if (rhs == int_type || rhs == float_type) {
            if (lhs == this.int_type || lhs == this.float_type) {
                return float_type; 
            }
        } // (int|char + int)|(int + int|char)
        else if ((rhs == char_type && lhs == int_type) || lhs == char_type && rhs == int_type) {
            return char_type; 
        } else if (lhs == rhs && lhs == char_type) {
            return int_type; 
        }
        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, 0); // TODO
    }

    Type verify(EqualityEqExp e) throws BaseULException {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this);
        if (rhs == int_type || rhs == float_type) {
            if (lhs == this.int_type || lhs == this.float_type) {
                return bool_type; 
            }
        }
        if (lhs == rhs && lhs != void_type) {
            return bool_type; 
        } 

        // arraytype case -- is this correct? 
        // TODO:
        // ask -- arrays should be compared?
        //     -- or nope? 
        // --  and can array indices be used prior to assigned val 
        if (lhs.equals(rhs)) {
            System.out.println("here?");
            return bool_type; 
        }

        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, e.getLineNumber());
    }

    Type verify(EqualityLTExp e) throws BaseULException {
        Type lhs = e.operand_one.accept(this); 
        Type rhs = e.operand_two.accept(this);
        if (rhs == int_type || rhs == float_type) {
            if (lhs == this.int_type || lhs == this.float_type) {
                return bool_type; 
            }
        }
        if (lhs == rhs && lhs != void_type) {
            return bool_type; 
        } 
        // array type?
        String err = String.format("Incompatible operand '%s' for types '%s' and '%s'", e.operator, lhs.toCodeString(), rhs.toCodeString()); 
        throw new IncompatibleTypesException(err, e.getLineNumber()); // TODO  
    }

    Type verify(Print p) throws BaseULException {
        Type t = p.exp.accept(this); 
        if (t == void_type) {
            String err = String.format("Incompatible type for print statement. Type may not be void"); 
            throw new IncompatibleTypesException(err, p.exp.getLineNumber()); // TODO
        }
        return void_type; 
    }

    Type verify(If iff) throws BaseULException {
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
        //TODO: test this 
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

    Type verify(ArrayExpression e) throws BaseULException {
        Type t = e.index.accept(this); 
        if (t == int_type) {
            ArrayType at = (ArrayType)this.currentFunction.getVariableType(e.id); 
            // an array expression would evaluate to the type
            // its build up out of 
            return at.type;
        }
        String msg = String.format("Invalid type for array index. '%s' could not be coerced to 'int'", t.toCodeString());
        throw new IncompatibleTypesException(msg, e.getLineNumber()); 
    }

    Type verify(Return r) throws BaseULException {
        if (r.exp == null && this.currentFunction.returnType == void_type) {
            return void_type;
        }
        Type t = r.exp.accept(this);
        if (t == this.currentFunction.returnType) {
            return t; 
        } 
        String err = String.format("Incompatible return type '%s'. Expected '%s'", 
            t.toCodeString(), this.currentFunction.returnType.toCodeString()); 
        throw new IncompatibleTypesException(err, r.exp.getLineNumber()); 
    }

    Type verify(ULIdentifier e) throws BaseULException {
        Type t = this.currentFunction.getVariableType(e);
        if (this.currentFunction.doesIdHaveValue(e))
            return t;
        String err = String.format("Variable '%s' used before being assigned a value", e); 
        throw new UndefinedValueException(err, e.getLineNumber());  
    }

    Type verify(FunctionCall fc) throws BaseULException {
        FunctionDeclaration fd = this.globals.getFunctionById(fc.id); 
        ArrayList<Type> tl = new ArrayList<Type>(); 
        for (BaseExpression e: fc.expList.expList) {
            Type t = e.accept(this);
            tl.add(t); 
        }
        int index = 0;
        for (Param p: fd.params) {
            if (index > tl.size() - 1) {
                String err = String.format("Expected %s arguements. Got %s", 
                    String.valueOf(fd.params.size()), String.valueOf(fc.expList.expList.size())); 
                throw new InvalidFunctionInvocationException(err, fc.id.getLineNumber());  
            }
            if (index > tl.size() - 1 || !(p.type == tl.get(index))) {
                String err = String.format("Parameter of type '%s' cannot be coerced to '%s'", tl.get(index).toCodeString(), p.type.toCodeString()); 
                throw new IncompatibleTypesException(err, fc.id.getLineNumber());  
            }
            index += 1;
        }
        return fd.type; 
    }

    Type verify(ExpressionStatement e) throws BaseULException {
        return e.exp.accept(this); 
    }

    Type verify(BaseStatement s) {
        System.out.println("Something went terribly terribly wrong (base statement)");
        return new VoidType(); 
    }

    Type verify(BaseExpression be) throws BaseULException {
        System.out.println("Something went terribly terribly wrong (base expression version)");
        return new VoidType();
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
            throw new MissingMainException("Program must contain function called 'main' which takes no parameters has has type 'void'", 0); // does 0 make sense?  --> negative number that gets handled by the printing maybe
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