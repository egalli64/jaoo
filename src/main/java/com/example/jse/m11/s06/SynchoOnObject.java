package com.example.jse.m11.s06;

public class SynchoOnObject {
    private Object lockF = new Object();
    private Object lockG = new Object();

    public static void main(String[] args) {
        SynchoOnObject som = new SynchoOnObject();

        Thread[] threads = { //
                new Thread(som::syncOnThis, "This1"), //
                new Thread(som::syncOnF, "F1"), //
                new Thread(som::syncOnG, "G1"), //
                new Thread(som::syncOnThis, "This2"), //
                new Thread(som::syncOnF, "F2"), //
                new Thread(som::syncOnG, "G2") //
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

    public synchronized void syncOnThis() {
        System.out.println("this synchro in " + Thread.currentThread().getName());
        try {
            // simulating a job
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        }

        System.out.println("this unsynchro in " + Thread.currentThread().getName());
    }

    public void syncOnF() {
        synchronized (lockF) {
            System.out.println("F synchro in " + Thread.currentThread().getName());
            try {
                // simulating a job
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
            System.out.println("F unsynchro in " + Thread.currentThread().getName());
        }
    }

    public void syncOnG() {
        synchronized (lockG) {
            System.out.println("G synchro in " + Thread.currentThread().getName());
            try {
                // simulating a job
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }

            System.out.println("G unsynchro in " + Thread.currentThread().getName());
        }
    }
}
