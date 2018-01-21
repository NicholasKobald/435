package ast;

import java.util.*;

import ast.BaseExpression;


public class ExpressionList {

    ArrayList<BaseExpression> expList; 

    public ExpressionList() {
        expList = new ArrayList<BaseExpression>(); 
    }

    public void append(BaseExpression exp) {
        expList.add(exp); 
    }

    public String toCodeString() {
        Iterator<BaseExpression> expIt = expList.iterator();
        StringBuilder sb = new StringBuilder();
        if (expIt.hasNext()) {
            sb.append(expIt.next().toCodeString());
            while (expIt.hasNext()) {
                sb.append(",");
                sb.append(expIt.next().toCodeString()); 
            }
        }
        return sb.toString(); 
    }
}