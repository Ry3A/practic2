package lab5;

public class Singleton3 {
    public static final Singleton3 INSTANCE = new Singleton3(); ;

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}
