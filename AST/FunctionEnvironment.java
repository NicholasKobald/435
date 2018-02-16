package ast; 

import java.util.*;

import ast.RedefinitionException;
import ast.ULIdentifier;
import ast.VariableDeclaration;
import sun.tools.tree.VarDeclarationStatement;
import types.Type; 

public class FunctionEnvironment {

    GlobalEnvironment globals;
    Type returnType;

    /* List of local params */ 
    LinkedList<Param> usedParams;
    /* List of local variables */ 
    LinkedList<VariableDeclaration> usedVariables;  

    /*
     * A function environment gets initialized with a function declaration,
     * injecting all of the formalParams* into the environment.
     * Additionally, the function environment is passed a reference to the global environment
     * for checking the existence of external functions called. 
     */
    public FunctionEnvironment(FunctionDeclaration fd, 
                               VariableDeclarationList varDecList, 
                               GlobalEnvironment globals) 
                               throws RedefinitionException {
        this.returnType = fd.type; 
        this.globals = globals; 
        for (Param p: fd.formalParams) {
            this.add(p); 
        }
        for (VariableDeclaration varDec: varDecList) {
            this.addVarDec(varDec); 
        }
    }

    public void add(ULIdentifier id) throws RedefinitionException {
        if (idUsed(id))
            throw new RedefinitionError("Duplicate Param Ids", id.getLineNumber());
        usedIds.add(id); 
    }

    public void addVarDeclaration(VariableDeclaration vardec)
                                  throws RedefinitionException {
        if (isUsed(varDec))
            throw new RedefinitionError("Duplicate Variable Declaration", varDec.id.getLineNumber());
        this.usedVariables.add(varDec); 
    }
    public boolean isUsed(AST p) {
    /*
    * TODO: learn generics (kidding, I'll just keep telling everyone how 
    * bad of a programming language Java is) 
    */
    ULIdentifier target; 
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
}
    /* 
    public boolean isUsed(AST p) {
         * TODO: learn generics (kidding, I'll just keep telling everyone how 
         * bad of a programming language Java is) 
    
        if (p instanceof Param) {
            Param param = (Param)p; 
            for (Param seen: this.usedParams) {
                if (param.equals(seen)) {
                    return true; 
                }
            }
            return false;
        } else if (p instanceof VariableDeclaration) {
            VariableDeclaration varDec = (VariableDeclaration)p;
            for (VariableDeclaration seen: this.usedVariables) {
                if (varDec.equals(seen)) {
                    return true; 
                }
            }
            return false;
        }
        return true;  // crash? 
    }
    */
