package Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//lock.tryLock() -> immediately check whether the lock is there or not
//lock.tryLock(time, unit) -> check whether the lock is there or not within specified time
//lock.unlock() -> unlock the lock and should be used in finally block
//lock.lock() -> will wait the lock is acquired
//lock.lockInterruptibly() -> Acquires the lock unless the current thread is interrupted. This is useful when you want to handle interruptions while acquiring a lock.
//Fairness in Fair_Lock
//Read Write Lock
//Deadlock in Deadlock.java -> synchronise the order of the locks
//Thread_Communication -> wait(), notify(), notifyAll()
//Thread Safety
//Thread Pooling
//Executable Service and Future
// CountdownLatch
// Cyclic Barrier
// Completable Future

class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        try {
            if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {

                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance : " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class MultiThreading {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                b.withdraw(50);
            }
        };

        Thread t1 = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");

        t1.start();
        t2.start();
    }
}
