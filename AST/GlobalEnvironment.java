package ast; 

import java.util.*;

public class GlobalEnvironment {

    LinkedList<FunctionDeclaration> functionList; 

    public GlobalEnvironment() {
        this.functionList = new LinkedList<FunctionDeclaration>(); 
    }

    public void add(FunctionDeclaration fd) throws DuplicateFunctionException {
        if (this.exists(fd)) 
            throw new DuplicateFunctionException("Duplicate Function Found", fd.id.getLineNumber());
        functionList.add(fd); 
    }

    public boolean exists(FunctionDeclaration functionDec) {
        for (FunctionDeclaration fd: functionList) {
            if (fd.equals(functionDec)) {
                return true; 
            }
        }
        return false; 
    }
}