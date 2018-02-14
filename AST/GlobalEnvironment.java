package ast; 

import java.util.*;

public class GlobalEnvironment {

    LinkedList<FunctionDeclaration> functionList; 

    public GlobalEnvironment() {
        this.functionList = new LinkedList<FunctionDeclaration>(); 
    }

    public void add(FunctionDeclaration fd) {
        functionList.add(fd); 
    }

    public boolean exists(FunctionDeclaration function) {
        for (FunctionDeclaration fd: functionList) {
            if (fd.equals(function)) {
                return true; 
            }
        }
        return false; 
    }
}