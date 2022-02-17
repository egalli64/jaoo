package com.example.jse.m11.s05;

public class Main {
    public static void main(String[] args) {
        Thread t0 = new Thread(() -> System.out.println("A message from " + Thread.currentThread().getName()));

        if (!t0.isAlive()) {
            System.out.println("Before start(), a thread is not yet alive");
        } else {
            System.out.println("You should not get this message");
        }
        t0.start();
        if (t0.isAlive()) {
            System.out.println("After start(), a thread is alive");
        } else {
            System.out.println("You should not get this message");
        }

        try {
            t0.join();
            System.out.println(t0.getName() + " joined");
        } catch (InterruptedException e) {
            System.out.println(t0.getName() + " interrupted");
            // we would usually handle the exception, or at least reset it
            // like this: Thread.currentThread().interrupt();
        }

        if (!t0.isAlive()) {
            System.out.println("After join(), a thread is not alive anymore");
        } else {
            System.out.println("You should not get this message");
        }
    }
}
