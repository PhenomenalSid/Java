package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//If you want to make sure that the order of the threads should be same as your choice
//pass true as argument in ReentrantLock constructor

public class Fair_Lock {
    private final Lock lock = new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Fair_Lock example = new Fair_Lock();

        Runnable task = example::accessResource;

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

//        Logical way to do it

//        try {
//            thread1.start();
//            Thread.sleep(50);
//            thread2.start();
//            Thread.sleep(50);
//            thread3.start();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
    }
}
