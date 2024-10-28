package Threads.ThreadSafety;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

    private int count = 0;
//    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
//        counter.incrementAndGet();
        count++;
    }

    public int getCounter() {
//        return counter.get();
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Atomic vc = new Atomic();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(Thread.currentThread().getName());
            }
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vc.increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(vc.getCounter());
    }

}
