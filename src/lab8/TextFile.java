package lab8;

public class TextFile {

    private String name;

    public TextFile(String s) {
    }

    public TextFile(Object s) {

    }

    // constructor

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

    // additional text file methods (editing, writing, copying, pasting)
}