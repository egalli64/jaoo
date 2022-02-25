package com.example.jse.m11.s11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OneProdCon {
    private static final int BASE_VALUE = 42;
    private int result = 0;
    private Lock lock;
    private Condition available;

    public OneProdCon() {
        this.result = 0;
        this.lock = new ReentrantLock();
        this.available = lock.newCondition();
    }

    private void producer() {
        String tName = Thread.currentThread().getName();

        System.out.println(tName + " enter producer()");
        try {
            lock.lock();
            System.out.println(tName + " is working on a (simulated) long job");
            Thread.sleep(500);

            result = BASE_VALUE;
            System.out.println(tName + " has produced as result " + result);
            available.signal();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } finally {
            lock.unlock();
        }
    }

    private void consumer() {
        String tName = Thread.currentThread().getName();

        System.out.println(tName + " enter consumer()");
        try {
            lock.lock();
            while (result == 0) {
                System.out.println(tName + " waits for the result");
                available.await();
                System.out.println(tName + " wait is ended");
            }

            System.out.println(tName + " consumes " + result);
            result = 0;
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        OneProdCon wn = new OneProdCon();

        Thread ts[] = { new Thread(wn::consumer, "TC"), new Thread(wn::producer, "TP") };

        for (Thread t : ts) {
            t.start();
        }

        for (Thread t : ts) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }

        System.out.println("Bye");
    }
}
