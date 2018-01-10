package ast;

public class FunctionBody {

    String temp;

    VariableDeclarationList variableList;
    StatementList statementList;

    public void addDeclarations(VariableDeclarationList variableList) {
        System.out.println("Added variableList to funcbod " + variableList);
        this.variableList = variableList;
    }

    public void addStatements(StatementList statementList) {
        System.out.println("Added statlist to funcbod " + statementList);
        this.statementList = statementList;
    }

    public String toString() {
        String ret_string = "";
        ret_string += this.statementList != null ? this.statementList.toString() : "";
        ret_string += this.variableList  != null ? this.variableList.toString()  : "";
        return ret_string;
    }
}
