package ast; 

import java.util.*; 

import types.Type; 

public class FunctionEnvironment {

    GlobalEnvironment global;
    Type returnType;


    /*
     * A function environment gets initialized with a function declaration,
     * injecting all of the formalParams* into the environment.
     * Additionally, the function environment is passed a reference to the global environment
     * for checking the existence of external functions called. 
     */
    public FunctionEnvironment(FunctionDeclaration fd, GlobalEnvironment global) {
        
    }   
}