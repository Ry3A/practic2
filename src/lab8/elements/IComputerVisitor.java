package lab8.elements;

public interface IComputerVisitor {
    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Monitor computer);
    void visit(Mouse computer);
}