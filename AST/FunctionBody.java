package ast;

public class FunctionBody {

    String temp;

    VariableDeclarationList variableList;
    StatementList statementList;

    public FunctionBody() {
        variableList = new VariableDeclarationList();
        statementList = new StatementList();
    }

    public void addDeclaration(VariableDeclaration varDec) {
        variableList.append(varDec);
    }

    public void addStatement(Statement statement) {
        statementList.append(statement);
    }

    public String toString() {
        String ret_string = "{\n";
        ret_string += this.variableList  != null ? this.variableList.toString()  : "";
        ret_string += this.statementList != null ? this.statementList.toString() : "";
        return ret_string + "\n}\n\n";
    }
}
