package lab3;

/*(10)  Map с использованием ключевого слова synchronized, Set с
        использованием Semaphore*/

import java.util.HashMap;
import java.util.Map;


public class App {
    static volatile int key = 0;
    static Map<Integer, String> states = new HashMap<Integer, String>();
    synchronized static void set_map(int key, String message) {
        states.put(key, message);
        System.out.println(states);
    }
    synchronized static void set_key() {
        key++;
        System.out.println(key);
    }


    public static void main(String[] args) {
        Thread one = new Thread(()->{
            set_key();
            set_map(key,"Первый поток");
        });
        Thread two = new Thread(()->{
            set_key();
            set_map(key,"Второй поток");
        });
        one.start();
        two.start();
    }
}







