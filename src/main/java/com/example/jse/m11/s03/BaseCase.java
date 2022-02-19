package com.example.jse.m11.s03;

import java.lang.Thread.State;

/**
 * Enable assertions with -ea argument
 */
public class BaseCase {
    public static void main(String[] args) throws InterruptedException {
        String name = "base";
        System.out.printf("Thread states for %s%n", name);
        Thread t = new Thread(() -> System.out.printf("Hello from %s%n", name), name);

        assert t.getState() == State.NEW && !t.isAlive();
        System.out.printf("Thread %s state is %s%n", t.getName(), t.getState());

        t.start();
        assert t.getState() == State.RUNNABLE || t.getState() == State.TERMINATED;
        System.out.printf("Thread %s state is %s%n", t.getName(), t.getState());
        if (t.isAlive()) {
            System.out.println("After start, a thread is alive");
        } else {
            System.out.printf("If main thread is slow, the other thread could terminate in the meantime!");
        }

        Thread.sleep(100);
        assert t.getState() == State.TERMINATED && !t.isAlive();
        System.out.printf("Thread %s state is %s%n", t.getName(), t.getState());
        if (!t.isAlive()) {
            System.out.println("After termination, a thread is no more alive");
        }

        System.out.println("Bye");
    }
}
