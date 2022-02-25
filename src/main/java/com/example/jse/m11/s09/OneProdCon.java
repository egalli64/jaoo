package com.example.jse.m11.s09;

public class OneProdCon {
    private static final int BASE_VALUE = 42;
    private int result = 0;

    private synchronized void producer() {
        String tName = Thread.currentThread().getName();
        try {
            System.out.println(tName + " is working on a (simulated) long job");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        result = BASE_VALUE;
        System.out.printf("%s has produced as result %d%n", tName, result);
        notifyAll();
    }

    private synchronized void consumer() {
        String tName = Thread.currentThread().getName();
        try {
            while (result == 0) {
                System.out.println(tName + " waits for the result");
                wait();
                System.out.println(tName + " wait is ended");
            }

            System.out.printf("%s consumes %d%n", tName, result);
            result = 0;
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void main(String[] args) {
        OneProdCon wn = new OneProdCon();

        Thread ts[] = { new Thread(wn::consumer, "consumer"), new Thread(wn::producer, "producer") };

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
