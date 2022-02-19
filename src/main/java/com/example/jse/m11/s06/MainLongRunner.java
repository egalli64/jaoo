package com.example.jse.m11.s06;

public class MainLongRunner {
    public static void main(String[] args) {
        Thread t0 = new Thread(() -> {
            System.out.println("A message from " + Thread.currentThread().getName());
            try {
                System.out.println("Simulating a long job for " + Thread.currentThread().getName());
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
                throw new IllegalStateException(e);
            }
            System.out.printf("%s is done now", Thread.currentThread().getName());
        });

        t0.start();

        try {
            System.out.println("Waiting a while for the other thread, then go back to do other stuff");
            t0.join(500);
        } catch (InterruptedException e) {
            System.out.println(t0.getName() + " interrupted");
            throw new IllegalStateException(e);
        }

        if (t0.isAlive()) {
            System.out.printf("After join(), but %s is still alive%n", t0.getName());
        } else {
            System.out.println("You should not get this message");
        }

        System.out.println("Terminating main thread");
    }
}
