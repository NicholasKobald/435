package ast; 

import java.util.*;

import ast.RedefinitionException;
import ast.ULIdentifier;
import ast.UndeclaredIdentifierException;
import ast.VariableDeclaration;

import types.Type; 
import types.VoidType; 
import types.ArrayType;;

public class FunctionEnvironment {

    GlobalEnvironment globals;
    public Type returnType;
    LinkedList<Param> usedParams;
    LinkedList<VariableDeclaration> usedVariables;
    HashSet<String> hasValue; // sue me

    /*
     * A function environment gets initialized with a function declaration,
     * injecting all of the formalParams* into the environment.
     * Additionally, the function environment is passed a reference to the global environment
     * for checking the existence of external functions called. 
     */
    public FunctionEnvironment(FunctionDeclaration fd, 
                               VariableDeclarationList varDecList, 
                               GlobalEnvironment globals) throws BaseULException {
        this.returnType = fd.type; 
        this.globals = globals;
        this.usedParams = new LinkedList<Param>();
        this.usedVariables = new LinkedList<VariableDeclaration>();
        this.hasValue = new HashSet<String>(); 

        for (Param p: fd.params) {
            this.add(p); 
            if (p.type instanceof ArrayType) {
                this.hasValue.add(p.id.toString()); 
            }
        }
        for (VariableDeclaration varDec: varDecList) {
            this.addVarDeclaration(varDec);
            if (varDec.type instanceof ArrayType) {
                this.hasValue.add(varDec.id.toString()); 
            }
        }
    }

    public void add(Param p) throws BaseULException {
        if (this.isUsed(p))
            throw new RedefinitionException("Duplicate Param Ids", p.id.getLineNumber());
        if (p.type instanceof VoidType)
            throw new InvalidTypeException("Paramter may not be of type 'void'", p.id.getLineNumber());
            usedParams.add(p); 
    }

    public void addVarDeclaration(VariableDeclaration vardec)
                                  throws BaseULException {
        if (this.isUsed(vardec))
            throw new RedefinitionException("Duplicate Variable Declaration", vardec.id.getLineNumber());
        if (vardec.type instanceof VoidType)
            throw new InvalidTypeException("Variable may not be of type 'void'", vardec.id.getLineNumber());

        this.usedVariables.add(vardec); 
    }
    public boolean isUsed(AST p) {
        /*
        * TODO: learn generics (kidding, I'll just keep telling everyone how 
        * bad of a programming language Java is) 
        */
        ULIdentifier target = null; // java is honestly a garbage language 
        if (p instanceof Param) {
            Param param = (Param)p; 
            target = param.id; 
        } else if (p instanceof VariableDeclaration) {
            VariableDeclaration varDec = (VariableDeclaration)p;
            target = varDec.id; 
        }
    
        for (Param seen: this.usedParams) {
            if (target.equals(seen.id)) {
                return true; 
            }
        }
        for (VariableDeclaration seen: this.usedVariables) {
            if (target.equals(seen.id)) {
                return true; 
            }
        }  
        return false;
    }

    public Type getVariableType(ULIdentifier target) throws UndeclaredIdentifierException {
        for (Param seen: this.usedParams) {
            if (target.equals(seen.id)) {
                return seen.type; 
            }
        }
        for (VariableDeclaration seen: this.usedVariables) {
            if (target.equals(seen.id)) {
                return seen.type; 
            }
        }
        String err = String.format("Use of undeclared identifier %s", target.toString());  
        throw new UndeclaredIdentifierException(err, target.getLineNumber()); 
    }
    
    public boolean doesIdHaveValue(ULIdentifier id) {
        return this.hasValue.contains(id.toString()); 
    }

    public void setUsed(ULIdentifier id) {
        this.hasValue.add(id.toString()); 
    }
}
