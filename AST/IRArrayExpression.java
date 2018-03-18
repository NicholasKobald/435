package ast;

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
}

/*
class IRArrayExpression(IRExpression): 

    def __init__(id, index):
        self.id = id
        self.index = index
    
    def __str__():
        return "{}[%s]".format(self.id, self.index)
*/ 