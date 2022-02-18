package com.example.jse.m11.s06;

public class HelloSynchroRetrofit {
    public static void main(String[] args) {
        System.out.println("Simulating the method synchronization by the caller");

        HelloNoSynchro unsync = new HelloNoSynchro();

        Thread[] threads = { //
                new Thread(() -> {
                    synchronized (unsync) {
                        unsync.sayHello("Tom");
                    }
                }), new Thread(() -> {
                    synchronized (unsync) {
                        unsync.sayHello("Kim");
                    }
                }), new Thread(() -> {
                    synchronized (unsync) {
                        unsync.sayHello("Sal");
                    }
                }), new Thread(() -> {
                    synchronized (unsync) {
                        unsync.sayHello("Bob");
                    }
                }) //
        };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }
}
