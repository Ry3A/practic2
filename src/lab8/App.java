package lab8;

import lab8.elements.Computer;

public class App {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartVisitorWithDisplay());


        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
        textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt");
    }
}