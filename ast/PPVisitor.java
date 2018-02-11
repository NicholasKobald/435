package ast;

import java.util.Iterator;
import java.util.Collections;


public class PPVisitor {

    private static int indent_level = 0;

    public void visit(Program program) {
        for (Function f: program)
            f.accept(this); 
    }

    void visit(Function f) {
        f.declaration.accept(this);
        f.body.accept(this);
        System.out.println();
    }

    void visit(FunctionDeclaration dec) {
        System.out.print(String.format("%s %s (", dec.type.toCodeString(), dec.id.toString()));
        dec.params.accept(this);
        System.out.println(")");
    }

    void visit(FunctionBody body) {
        System.out.print("{");
        indent_level += 4;

        if (body.variableList.iterator().hasNext())
            System.out.println(); 
            
        for (VariableDeclaration dec: body.variableList)
            dec.accept(this); 

        if (body.statementList.iterator().hasNext()) 
            System.out.println(); 
        
        for (BaseStatement st: body.statementList) 
            st.accept(this); 

        indent_level -= 4;

        if (!body.variableList.iterator().hasNext() && !body.statementList.iterator().hasNext())
            System.out.println();

        System.out.println("}"); 
    }

    void visit(ParamList params) {
        Iterator<Param> paramIt = params.iterator();
        if (paramIt.hasNext()) {
            paramIt.next().accept(this);
            while (paramIt.hasNext()) {
                System.out.print(", ");
                paramIt.next().accept(this);
            }
        }
    }

    void visit(FunctionCall fc) {
        System.out.println(fc.toString());
    }

    void visit(Param p) {
        System.out.print(p.toString());
    }

    void visit(While w) {
        String indent = get_indent(indent_level);
        System.out.println(indent + w.toCodeString());
        this.printBlock(w.statements);
    }

    void visit(BaseStatement st) {
        String indent = get_indent(indent_level);
        System.out.print(indent + st.toCodeString()); 
    }

    void visit(VariableDeclaration dec) {
        String indent = get_indent(indent_level);
        System.out.print(indent + dec.toCodeString(this.indent_level)); 
    }

    void visit(If if_block) {
        String indent = get_indent(indent_level);
        System.out.println(indent + if_block.toCodeString());
        this.printBlock(if_block.statements);
        if (if_block.elseStatements != null) {
            System.out.println(indent + "else");
            this.printBlock(if_block.elseStatements);
        }
    }

    void visit(Return ret) {
        String indent = get_indent(indent_level);
        System.out.println(indent + ret.toCodeString()); 
    }

    void visit(Print ps) {
        String indent = get_indent(indent_level);
        System.out.println(indent + ps.toCodeString());
    }

    void visit(ArrayAssignment as) {
        String indent = get_indent(indent_level);
        System.out.println(indent + as.toCodeString() + ";"); 
    }

    void visit(ArrayExpression ae) {
        String indent = get_indent(indent_level);
        System.out.println(indent + ae.toCodeString() + ";"); 
    }

    void visit(ExpressionStatement et) {
        String indent = get_indent(indent_level);
        System.out.println(indent + et.toCodeString() + ";");
    }

    void printBlock(StatementList statements) {
        String indent = get_indent(indent_level);
        System.out.println(indent + "{"); 
        this.indent_level += 4;
        for (BaseStatement st: statements)
            st.accept(this); 
        this.indent_level -= 4;
        indent = get_indent(indent_level);
        System.out.println(indent + "}");
    }

    private static String get_indent(int indent_depth) {
        String ind = "";
        for (int i = 0; i < indent_depth; i++) {
            ind += " "; 
        }
        return ind; 
    }
}
