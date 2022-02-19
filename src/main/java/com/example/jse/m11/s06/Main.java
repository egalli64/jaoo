package com.example.jse.m11.s06;

public class Main {
    public static void main(String[] args) {
        Thread t0 = new Thread(() -> System.out.println("A message from " + Thread.currentThread().getName()));

        if (!t0.isAlive()) {
            System.out.println("Before starting it, the other thread is not yet alive");
        } else {
            System.out.println("You should not get this message");
        }
        t0.start();
        if (t0.isAlive()) {
            System.out.println("After starting it, the other thread is alive");
        } else {
            System.out.println("You should not get this message");
        }

        try {
            t0.join();
            System.out.println(t0.getName() + " joined");
        } catch (InterruptedException e) {
            System.out.println(t0.getName() + " interrupted");
            // we would usually handle the interruption, or at least reset it
            // like this: Thread.currentThread().interrupt();
        }

        if (!t0.isAlive()) {
            System.out.println("The other thread is not alive anymore");
        } else {
            System.out.println("You should not get this message, join interrupted?");
        }
    }
}
