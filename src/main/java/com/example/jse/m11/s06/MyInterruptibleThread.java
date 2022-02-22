package com.example.jse.m11.s06;

public class MyInterruptibleThread extends Thread {
    private volatile boolean done;

    public MyInterruptibleThread(String name) {
        super(name);
        this.done = false;

    }

    public void shutdown() {
        done = true;
    }

    @Override
    public void run() {
        System.out.println("In thread " + getName());

        try {
            int i = 0;
            while (!done) {
                System.out.print("Simulating a job in " + getName() + " ... ");
                Thread.sleep(100);
                System.out.println(i++);
            }
        } catch (InterruptedException e) {
            System.out.printf("Someone has interrupted %s in its sleep!%n", getName());
            // reset the flag on the current thread as interrupted
            interrupt();
        }

        System.out.printf("Thread %s is done%n", getName());
    }
}
