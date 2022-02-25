package com.example.jse.m11.s11;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OneProdManyCons {
    private static final int BASE_VALUE = 42;
    private int result;
    private Lock lock;
    private Condition available;
    private Condition consumed;

    public OneProdManyCons() {
        this.result = 0;
        this.lock = new ReentrantLock();
        this.available = lock.newCondition();
        this.consumed = lock.newCondition();
    }

    public void checkThreadStates() {
        System.out.println("Checking thread states from " + Thread.currentThread().getName());
        Thread[] ts = new Thread[6];
        // Thread::enumerate() should be used only for debugging and monitoring purposes
        int count = Thread.enumerate(ts);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s is %s%n", ts[i].getName(), ts[i].getState());
        }
    }

    private void producer() {
        int delta = 0;
        try {
            lock.lock();
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Producer is working on a (simulated) long job");
                Thread.sleep(200);
                result = BASE_VALUE + delta++;
                System.out.println("Producer has produced as result " + result);

                checkThreadStates();
                available.signalAll();
                consumed.await();
                while (result != 0) {
                    System.out.println("Producer waits the result to be consumed");
                    consumed.await(500, TimeUnit.MILLISECONDS);
                    System.out.println("Producer wait is ended");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Producer has been interrupted");
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
            System.out.println("Producer has stopped producing values");
        }
    }

    private void consumer() {
        String tName = Thread.currentThread().getName();
        try {
            lock.lock();
            while (result == 0) {
                System.out.println(tName + " waits for the result");
                available.await();
                System.out.println(tName + " wait is ended");
            }

            System.out.printf("Consumer %s consumes %d%n", tName, result);
            result = 0;

            checkThreadStates();
            consumed.signal();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } finally {
            lock.unlock();
            System.out.println(tName + " exits consumer()");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OneProdManyCons wn = new OneProdManyCons();

        Thread producer = new Thread(wn::producer, "TP");

        Thread[] consumers = { //
                new Thread(wn::consumer, "TC1"), //
                new Thread(wn::consumer, "TC2"), //
                new Thread(wn::consumer, "TC3") //
        };

        producer.start();
        for (Thread consumer : consumers) {
            consumer.start();
        }

        wn.checkThreadStates();

        for (Thread consumer : consumers) {
            consumer.join();
        }

        System.out.println("No more consumer, interrupting producer");
        producer.interrupt();
        producer.join();

        System.out.println("Bye");
    }
}
