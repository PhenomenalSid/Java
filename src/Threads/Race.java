package Threads;

// Disadvantages of Sync
//1. Fairness
//2. Blocking
//3. Interruptibility
//4. Read/Write Locking

class Counter {
    public int count = 0;

    public synchronized void increment()
    {
        count++;
    }
}

public class Race {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };


        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
