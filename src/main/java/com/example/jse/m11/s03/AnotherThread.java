package com.example.jse.m11.s03;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("A message from an AnotherThread on thread " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Message %d from %s", i, Thread.currentThread().getName()));

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
    }
}
