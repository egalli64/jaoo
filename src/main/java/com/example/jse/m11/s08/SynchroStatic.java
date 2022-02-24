package com.example.jse.m11.s08;

public class SynchroStatic {
    private synchronized static void m1() {
        System.out.println("[In m1] " + Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("[Out m1] " + Thread.currentThread().getName());
    }

    private synchronized static void m2() {
        System.out.println("[In m2] " + Thread.currentThread().getName());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("[Out m2] " + Thread.currentThread().getName());
    }

    public synchronized void hello1() {
        System.out.println("In hello1 " + Thread.currentThread().getName());
        try {
            m1();
            // simulating a job
            Thread.sleep(200);
            m2();
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
        System.out.println("Out hello1 " + Thread.currentThread().getName());
    }

    public synchronized void hello2() {
        System.out.println("In hello2 " + Thread.currentThread().getName());
        try {
            m1();
            // simulating a job
            Thread.sleep(200);
            m2();
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }
        System.out.println("Out hello2 " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SynchroStatic sy1 = new SynchroStatic();
        SynchroStatic sy2 = new SynchroStatic();

        Thread[] threads = { //
                new Thread(sy1::hello1, "ObjectOneA"), //
                new Thread(sy1::hello2, "ObjectOneB"), //
                new Thread(sy2::hello1, "ObjectTwoA"), //
                new Thread(sy2::hello2, "ObjectTwoB") //
        };

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
        }
        System.out.println("Bye from " + Thread.currentThread().getName());
    }
}
