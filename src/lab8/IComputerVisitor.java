package lab8;

import lab8.elements.Computer;
import lab8.elements.Keyboard;
import lab8.elements.Monitor;
import lab8.elements.Mouse;

public interface IComputerVisitor {
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Monitor computer);
    void visit(Mouse computer);
}