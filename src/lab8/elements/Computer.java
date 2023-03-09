package lab8.elements;

import java.util.ArrayList;
import java.util.List;

public class Computer implements IComputerPart {

    List<IComputerPart> computerParts = new ArrayList<>();

    public Computer() {
        computerParts.add(new Keyboard());
        computerParts.add(new Mouse());
        computerParts.add(new Monitor());
    }

    @Override
    public void accept(IComputerVisitor computerVisitor) {
        computerParts.forEach(computerPart -> {
            computerPart.accept(computerVisitor);
        });

        computerVisitor.visit(this);
    }
}