package com.example.jse.m11.s06;

public class CheckInterrupted {
    public static void main(String[] args) {
        System.out.println("In thread " + Thread.currentThread().getName());

        Thread other = new Thread(() -> {
            final Thread cur = Thread.currentThread();
            System.out.println("In thread " + cur.getName());

            int i = 0;
            while (!cur.isInterrupted()) {
                System.out.print("Simulating a job in " + cur.getName() + " ... ");
                System.out.println(i++);
            }

            System.out.printf("Thread %s is done%n", cur.getName());
        }, "other");

        System.out.printf("The thread %s has not started yet%n", other.getName());
        System.out.println("!!! Output could be garbled  !!!");
        System.out.println("!!! Two threads are competing on System.out !!!");

        other.start();

        try {
            System.out.println("Simulating a job in main, to ensure other thread has a chance to kick in");
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        System.out.println("Thread main has enough of other thread!");
        other.interrupt();

        System.out.printf("Thread %s is done%n", Thread.currentThread().getName());
    }
}
