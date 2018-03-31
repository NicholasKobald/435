package ast; 


public class Instruction extends IRBase {

    public String[] getJasminStrings() {
        return new String[] {this.getJasminString()}; 
    }

    public String getJasminString() {
        return "NotImplemented quite yet - you are trying to generate an instruction that you haven't"
             + " Implemented one of 'getJasminString' or 'getJasminStrings' on.";
    }
}
