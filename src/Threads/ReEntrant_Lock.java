package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrant_Lock {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
//        lock.lockInterruptibly();
        try {
            System.out.println("Outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReEntrant_Lock example = new ReEntrant_Lock();
        example.outerMethod();
    }
}
