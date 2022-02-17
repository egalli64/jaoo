package com.example.jse.m11.s04;

public class MainForRunnableLambda {
    public static void main(String[] args) {
        System.out.println("In thread " + Thread.currentThread().getName());

        Thread t0 = new Thread(() -> {
            System.out.println("In " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.printf("%s interrupted%n", Thread.currentThread().getName());
            }

            System.out.printf("%s is done%n", Thread.currentThread().getName());
        });

        System.out.println("The new thread has not started yet");
        t0.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.printf("%s interrupted%n", Thread.currentThread().getName());
        }

        System.out.printf("Thread %s is done%n", Thread.currentThread().getName());
    }
}
