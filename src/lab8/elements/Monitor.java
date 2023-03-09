package lab8.elements;

public class Monitor implements IComputerPart {

    @Override
    public void accept(IComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}
