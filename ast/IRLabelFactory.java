package ast;

public class IRLabelFactory {

    int count;

    public IRLabelFactory() {
        this.count = 0; 
    }

    public IRLabel getLabel() {
        return new IRLabel(this.count++); 
    }
}