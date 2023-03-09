package lab8;

import lab8.elements.Computer;
import lab8.elements.Keyboard;
import lab8.elements.Monitor;
import lab8.elements.Mouse;

public class ComputerPartVisitorWithDisplay implements IComputerVisitor, lab8.elements.IComputerVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer method");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard method");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor method");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse method");
    }
}
