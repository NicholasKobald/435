package ast;

import java.util.Iterator;

public class FunctionBody extends AST {

    VariableDeclarationList variableList;
    public StatementList statementList;

    public FunctionBody() {
        variableList = new VariableDeclarationList();
        statementList = new StatementList();
    }

    public void addDeclaration(VariableDeclaration varDec) {
        variableList.append(varDec);
    }

    public void addStatement(BaseStatement statement) {
        statementList.append(statement); // see, its like python 
    }

    public Iterator<VariableDeclaration> varDecs() {
        return this.variableList.iterator(); 
    }

    public String toString() {
        String ret_string = "{\n";
        ret_string += this.variableList  != null ? this.variableList.toString()  : "";
        ret_string += this.statementList != null ? this.statementList.toString() : "";
        return ret_string + "\n}\n\n";
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }   
}
