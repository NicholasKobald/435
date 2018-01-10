package ast;

public class FunctionBody {

    String temp;

    VariableDeclarationList variableList;
    StatementList statementList;

    public void addDeclarations(VariableDeclarationList variableList) {
        this.variableList = variableList;
    }

    public void addStatements(StatementList statementList) {
        this.statementList = statementList;
    }

    public String toString() {
        String ret_string = "\n{\n";
        ret_string += this.statementList != null ? this.statementList.toString() : "";
        ret_string += this.variableList  != null ? this.variableList.toString()  : "";
        return ret_string + "\n}";
    }
}
