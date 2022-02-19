package com.example.jse.m11.s03;

import java.lang.Thread.State;

/**
 * Enable assertion with -ea argument
 */
public class Waiting {
    public static void aMethod() {
        System.out.printf("Emulating a long job for %s thread%n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);

            System.out.print("Checking main status from " + Thread.currentThread().getName());
            Thread[] ts = new Thread[2];
            // Thread::enumerate() should be used only for debugging and monitoring purposes
            int count = Thread.enumerate(ts);
            for (int i = 0; i < count; i++) {
                if (ts[i].getName().equals("main")) {
                    State state = ts[i].getState();

                    assert state == State.WAITING;
                    System.out.printf(", its state is %s%n", state);
                    break;
                }
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String name = "waited";
        Thread t1 = new Thread(Waiting::aMethod, name);

        t1.start();

        System.out.printf("Emulating a short job, to let %s thread to kick in%n", t1.getName());
        Thread.sleep(100);

        System.out.printf("Checking %s from main,", t1.getName());
        System.out.printf(" its state is %s%n", t1.getState());
        assert t1.getState() == State.TIMED_WAITING;

        t1.join();
        System.out.println("Bye");
    }
}
