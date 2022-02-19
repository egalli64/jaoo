package com.example.jse.m11.s04;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Running thread %s%n", Thread.currentThread().getName());

        System.out.printf("About to sleep @ %d%n", System.currentTimeMillis());
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted: " + e.getMessage());
        }

        System.out.printf("...sleep ended @ %d%n", System.currentTimeMillis());
    }
}
