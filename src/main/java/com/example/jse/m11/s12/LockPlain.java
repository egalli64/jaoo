package com.example.jse.m11.s12;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockPlain {
    private Lock lockF = new ReentrantLock();
    private Lock lockG = new ReentrantLock();

    public static void main(String[] args) {
        LockPlain lp = new LockPlain();

        Thread[] threads = { //
                new Thread(lp::syncOnF, "F1"), //
                new Thread(lp::syncOnG, "G1"), //
                new Thread(lp::syncOnF, "F2"), //
                new Thread(lp::syncOnG, "G2") //
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

    public void syncOnF() {
        try {
            System.out.println("Need a F lock " + Thread.currentThread().getName());
            lockF.lock();
            System.out.println("F locked " + Thread.currentThread().getName());
            // simulating a job
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("F unlock " + Thread.currentThread().getName());
            lockF.unlock();
        }
    }

    public void syncOnG() {
        try {
            System.out.println("Need a G lock " + Thread.currentThread().getName());
            lockG.lock();
            System.out.println("G locked " + Thread.currentThread().getName());
            // simulating a job
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("G unlock " + Thread.currentThread().getName());
            lockG.unlock();
        }
    }
}
