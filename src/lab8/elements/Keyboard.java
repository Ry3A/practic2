package lab8.elements;

public class Keyboard implements IComputerPart {

    @Override
    public void accept(IComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}