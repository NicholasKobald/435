package ast;

import java.util.*;


public class ExpressionList {

    ArrayList<BaseExpression> expList; 

    public ExpressionList() {
        expList = new ArrayList<BaseExpression>(); 
    }

    public void append(BaseExpression exp) {
        expList.add(exp); 
    }
}