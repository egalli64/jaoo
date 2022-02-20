package com.example.jse.m11.s08;

public class OneProdCon {
    private static final int BASE_VALUE = 42;
    private int result = 0;

    private synchronized void producer() {
        try {
            System.out.println("Producer is working on a (simulated) long job");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        result = BASE_VALUE;
        System.out.println("Producer produces as result " + result);
        notifyAll();
    }

    private synchronized void consumer() {
        try {
            while (result == 0) {
                System.out.println("Consumer waits for the result");
                wait();
                System.out.println("Consumer wait is ended");
            }

            System.out.println("Consumer consumes " + result);
            result = 0;
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void main(String[] args) {
        OneProdCon wn = new OneProdCon();

        new Thread(wn::producer).start();
        wn.consumer();

        System.out.println("Bye");
    }
}
