package com.example.jse.m11.s08;

public class OneProdManyCons {
    private static final int BASE_VALUE = 42;
    private int result;
    private boolean producing;

    public OneProdManyCons() {
        this.result = 0;
        this.producing = true;
    }

    public void stopProducer() {
        producing = false;
    }

    public synchronized void checkThreadStates() {
        System.out.println("Checking thread states from " + Thread.currentThread().getName());
        Thread[] ts = new Thread[6];
        // Thread::enumerate() should be used only for debugging and monitoring purposes
        int count = Thread.enumerate(ts);
        for (int i = 0; i < count; i++) {
            System.out.printf("Thread %s state is %s%n", ts[i].getName(), ts[i].getState());
        }
    }

    private synchronized void producer() {
        int delta = 0;
        try {
            while (producing) {
                System.out.println("Producer is working on a (simulated) long job");
                Thread.sleep(500);
                result = BASE_VALUE + delta;
                delta += 1;
                System.out.println("Producer has produced as result " + result);

                checkThreadStates();
                notifyAll();
                while (result != 0) {
                    System.out.println("Producer waits the result to be consumed");
                    wait(500);
                    System.out.println("Producer wait is ended");
                }
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

    }

    private synchronized void consumer() {
        try {
            while (result == 0) {
                System.out.printf("Consumer %s waits for the result%n", Thread.currentThread().getName());
                wait();
                System.out.printf("Consumer %s wait is ended%n", Thread.currentThread().getName());
            }

            System.out.printf("Consumer %s consumes %d%n", Thread.currentThread().getName(), result);
            result = 0;

            checkThreadStates();
            notifyAll();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.printf("Consumer %s is done%n", Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        OneProdManyCons wn = new OneProdManyCons();

        Thread producer = new Thread(wn::producer, "Producer");

        Thread[] consumers = { //
                new Thread(wn::consumer, "Consumer1"), //
                new Thread(wn::consumer, "Consumer2"), //
                new Thread(wn::consumer, "Consumer3") //
        };

        producer.start();
        for (Thread consumer : consumers) {
            consumer.start();
        }

        wn.checkThreadStates();

        for (Thread consumer : consumers) {
            consumer.join();
        }

        wn.stopProducer();
        producer.join();

        System.out.println("Bye");
    }
}
