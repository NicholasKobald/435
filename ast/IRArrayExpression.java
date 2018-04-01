package ast;

import types.*; 

public class IRArrayExpression extends Instruction {

    Temp result; 
    Temp id;
    Temp index;

    public IRArrayExpression(Temp result, Temp id, Temp index) {
        this.result = result; 
        this.id = id;
        this.index = index; 
    }

    public String toString() {
        return String.format("%s := %s[%s];", 
            this.result.toCodeString(), this.id.toCodeString(), this.index.toCodeString());
    }

    public String[] getJasminStrings() {
        return new String[] {
            String.format("%s %d", this.convertTypeToLoadString(id.type), id.tempId),
            String.format("%s %d", this.convertTypeToLoadString(index.type), index.tempId),
            getArrayLoad(), 
            String.format("%s %d", this.convertTypeToStoreString(result.type), result.tempId), 
        };
    }

    private String getArrayLoad() {
        if (this.result.type instanceof CharType) {
            return "caload";
        }
        if (this.result.type instanceof BoolType) {
            return "baload"; 
        }
        if (this.result.type instanceof IntegerType) {
            return "iaload";
        } 
        if (this.result.type instanceof StringType) {
            return "aaload"; 
        }
        if (this.result.type instanceof FloatType) {
            return "faload"; 
        }
        return "^__^ oopsy woopsy";
    }
}

/*
class IRArrayExpression(IRExpression): 

    def __init__(id, index):
        self.id = id
        self.index = index
    
    def __str__():
        return "{}[{}]".format(self.id, self.index)
*/ 