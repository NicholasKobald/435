package ast;


public class ULString extends BaseExpression {

    String token; // honestly, who cares 

    public ULString(String s) {
        this.token = s; 
    }
}