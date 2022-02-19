package com.example.jse.m11.s05;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("In thread " + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.printf("%s interrupted%n", Thread.currentThread().getName());
            throw new IllegalStateException(e);
        }

        System.out.printf("Thread %s is done%n", Thread.currentThread().getName());
    }
}
