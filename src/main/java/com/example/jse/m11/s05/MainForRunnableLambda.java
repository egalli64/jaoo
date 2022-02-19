package com.example.jse.m11.s05;

public class MainForRunnableLambda {
    public static void main(String[] args) {
        System.out.println("In thread " + Thread.currentThread().getName());

        Thread other = new Thread(() -> {
            System.out.println("In thread " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.printf("%s interrupted%n", Thread.currentThread().getName());
                throw new IllegalStateException(e);
            }

            System.out.printf("Thread %s is done%n", Thread.currentThread().getName());
        }, "other");

        System.out.printf("The thread %s has not started yet%n", other.getName());
        other.start();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.printf("%s interrupted%n", Thread.currentThread().getName());
            throw new IllegalStateException(e);
        }

        System.out.printf("Thread %s is done%n", Thread.currentThread().getName());
    }
}
