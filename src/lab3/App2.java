package lab3;

import java.util.concurrent.Semaphore;

public class App2 {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for(int i=1;i<6;i++){
            new Philosopher(sem,i).start();
        }
    }
}
class Philosopher extends Thread {
    Semaphore sem; // семафор. ограничивающий число философов
    int num = 0;
    int id;
    Philosopher(Semaphore sem, int id) {
        this.sem=sem;
        this.id=id;
    }

    public void run() {
        try {
            while(num<3){// пока не достигнет 3
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println ("пошел " + id);
                sleep(500);
                num++;
                System.out.println ("вышел " + id);
                sem.release();
                // ожидание
                sleep(500);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}