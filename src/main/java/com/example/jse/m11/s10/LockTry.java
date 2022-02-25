package com.example.jse.m11.s10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTry {
    private Lock lockF = new ReentrantLock();
    private Lock lockG = new ReentrantLock();

    public static void main(String[] args) {
        LockTry lt = new LockTry();

        Thread[] threads = { //
                new Thread(lt::syncOnF, "F1"), //
                new Thread(lt::syncOnG, "G1"), //
                new Thread(lt::syncOnF, "F2"), //
                new Thread(lt::syncOnG, "G2") //
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
        if (lockF.tryLock()) {
            try {
                System.out.println("F locked " + Thread.currentThread().getName());
                // simulating a job
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            } finally {
                System.out.println("F unlock " + Thread.currentThread().getName());
                lockF.unlock();
            }
        } else {
            System.out.println("Don't wait, F already locked " + Thread.currentThread().getName());
        }
    }

    public void syncOnG() {
        System.out.println("Need a G lock " + Thread.currentThread().getName());
        if (lockG.tryLock()) {
            try {
                System.out.println("G locked " + Thread.currentThread().getName());
                // simulating a job
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            } finally {
                System.out.println("G unlock " + Thread.currentThread().getName());
                lockG.unlock();
            }
        } else {
            System.out.println("Don't wait, G already locked " + Thread.currentThread().getName());
        }
    }
}
