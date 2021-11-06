package com.example.jse.m11.s04;

public class Main {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();

        System.out.println("The default name for the main thread is -> " + main.getName());
        System.out.println("It is in the thread group named -> " + main.getThreadGroup().getName());
        System.out.println("And its default priority is -> " + main.getPriority());

        Thread t0 = new Thread(() -> System.out.println("A message from a Runnable"));

        System.out.println("Starting " + t0.getName());
        t0.start();

        try {
            t0.join();
            System.out.println(t0.getName() + " joins to main");
        } catch (InterruptedException e) {
            System.out.println(t0.getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }
}
