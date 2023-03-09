package lab8.elements;

public class Mouse implements IComputerPart {

    @Override
    public void accept(IComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}
