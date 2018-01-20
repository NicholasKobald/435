package ast;


public class PPVisitor {

    public void visit(Program program) {
        for (Function f: program) {
            f.accept(this); 
        }
    }

    void visit(Function f) {
        f.declaration.accept(this);
        f.body.accept(this); 
    }

    void visit(FunctionDeclaration dec) {
        String pPrintDec = String.format("%s %s", dec.id.toString(), dec.type.toString()); 
        System.out.println(pPrintDec);
        dec.params.accept(this); 
    }

    void visit(FunctionBody body) {
        for (VariableDeclaration dec: body.variableList) {
            dec.accept(this); 
        }

        for (BaseStatement st: body.statementList) {
            st.accept(this); 
        }
    }

    void visit(ParamList params) {
        for (Param param: params) {
            param.accept(this); 
        }
    }

    void visit(Param please) {
        //can you
        please.accept(this);
    }
}