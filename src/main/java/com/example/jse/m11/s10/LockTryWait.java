package com.example.jse.m11.s10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTryWait {
    private Lock lockF = new ReentrantLock();
    private Lock lockG = new ReentrantLock();

    public static void main(String[] args) {
        LockTryWait ltw = new LockTryWait();

        Thread[] threads = { //
                new Thread(ltw::syncOnF, "F1"), //
                new Thread(ltw::syncOnG, "G1"), //
                new Thread(ltw::syncOnF, "F2"), //
                new Thread(ltw::syncOnG, "G2") //
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
        System.out.println("Need a F lock " + Thread.currentThread().getName());
        boolean locked = false;
        try {
            locked = lockF.tryLock(250, TimeUnit.MILLISECONDS);
            if (locked) {
                System.out.println("F locked " + Thread.currentThread().getName());
                // simulating a job
                Thread.sleep(200);
            } else {
                System.out.println("Waited a bit, but F already locked " + Thread.currentThread().getName());
            }

        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (locked) {
                System.out.println("F unlock " + Thread.currentThread().getName());
                lockF.unlock();
            }
        }
    }

    public void syncOnG() {
        System.out.println("Need a G lock " + Thread.currentThread().getName());
        boolean locked = false;
        try {
            locked = lockG.tryLock(50, TimeUnit.MILLISECONDS);
            if (locked) {
                System.out.println("G locked " + Thread.currentThread().getName());
                // simulating a job
                Thread.sleep(200);
            } else {
                System.out.println("Waited a bit, but G already locked " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (locked) {
                System.out.println("G unlock " + Thread.currentThread().getName());
                lockG.unlock();
            }
        }
    }
}
