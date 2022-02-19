package com.example.jse.m11.s03;

import java.lang.Thread.State;

/**
 * Enable assertion with -ea argument
 */
public class Blocked {
    public static synchronized void aSynchronizedMethod() {
        System.out.printf("Emulating a long job for %s thread%n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Long job done for thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(Blocked::aSynchronizedMethod, "blocking").start();

        System.out.println("Emulating a short job, to let blocking thread to kick in");
        Thread.sleep(100);

        String name = "blocked";
        Thread t1 = new Thread(Blocked::aSynchronizedMethod, name);

        t1.start();
        System.out.printf("Emulating a short job, to let %s thread to kick in%n", t1.getName());
        Thread.sleep(100);

        assert t1.getState() == State.BLOCKED;
        System.out.printf("Thread %s state is %s%n", t1.getName(), t1.getState());

        System.out.printf("Emulating a long job, to let %s thread to end its run%n", t1.getName());
        Thread.sleep(1_000);
        assert t1.getState() == State.TERMINATED;
        System.out.printf("Thread %s state is %s%n", t1.getName(), t1.getState());

        System.out.println("Bye");
    }
}
