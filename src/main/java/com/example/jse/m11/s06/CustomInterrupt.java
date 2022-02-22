package com.example.jse.m11.s06;

public class CustomInterrupt {
    public static void main(String[] args) {
        System.out.println("In thread " + Thread.currentThread().getName());

        MyInterruptibleThread other = new MyInterruptibleThread("other");

        System.out.printf("The thread %s has not started yet%n", other.getName());
        System.out.println("!!! Output could be garbled  !!!");
        System.out.println("!!! Two threads are competing on System.out !!!");

        other.start();

        try {
            System.out.println("Simulating a job in main, let other thread having some fun ...");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        System.out.println("Thread main has enough of other thread!");
        if (args.length == 0) {
            System.out.println("Shutting down other thread");
            other.shutdown();
        } else {
            System.out.println("Interrupting other thread");
            other.interrupt();
        }

        System.out.printf("Thread %s is done%n", Thread.currentThread().getName());
    }
}
