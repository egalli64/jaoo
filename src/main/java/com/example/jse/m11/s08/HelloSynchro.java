package com.example.jse.m11.s08;

public class HelloSynchro {
    public static void main(String[] args) {
        System.out.println("Threads competing on console _with_ synchronization");

        HelloSynchro unsync = new HelloSynchro();
        Thread[] threads = { //
                new Thread(() -> unsync.sayHello("Tom")), //
                new Thread(() -> unsync.sayHello("Kim")), //
                new Thread(() -> unsync.sayHello("Sal")), //
                new Thread(() -> unsync.sayHello("Bob")) //
        };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    synchronized public void sayHello(String name) {
        System.out.print("Hello ");
        try {
            // simulating an undefined job
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println(name + "!");
    }
}
