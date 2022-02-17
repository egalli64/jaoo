package com.example.jse.m11.s04;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("In " + Thread.currentThread().getName());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.printf("%s interrupted%n", Thread.currentThread().getName());
        }

        System.out.printf("%s is done%n", Thread.currentThread().getName());
    }

}
