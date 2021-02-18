package m10.s05;

public class Main {
    public void unsynchroHello() {
        UnsynchronizedHello unsync = new UnsynchronizedHello();

        Thread[] threads = { new Thread(() -> unsync.sayHello("Tom")), //
                new Thread(() -> unsync.sayHello("Kim")), //
                new Thread(() -> unsync.sayHello("Sal")), //
                new Thread(() -> unsync.sayHello("Bob")) };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted join on " + thread.getName());
            }
        }
    }

    public void synchroHello() {
        SynchronizedHello sync = new SynchronizedHello();

        Thread[] threads = { new Thread(() -> sync.sayHello("Tom")), //
                new Thread(() -> sync.sayHello("Kim")), //
                new Thread(() -> sync.sayHello("Sal")), //
                new Thread(() -> sync.sayHello("Bob")) };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted join on " + thread.getName());
            }
        }
    }

    public void retrofit() {
        UnsynchronizedHello unsync = new UnsynchronizedHello();

        Thread[] threads = { new Thread(() -> {
            synchronized (unsync) {
                unsync.sayHello("Tom");
            }
        }), new Thread(() -> {
            synchronized (unsync) {
                unsync.sayHello("Kim");
            }
        }), new Thread(() -> {
            synchronized (unsync) {
                unsync.sayHello("Sal");
            }
        }), new Thread(() -> {
            synchronized (unsync) {
                unsync.sayHello("Bob");
            }
        }) };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted join on " + thread.getName());
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Unsynchronized");
        main.unsynchroHello();
        System.out.println("Synchronized");
        main.synchroHello();
        System.out.println("Synchrony patch");
        main.retrofit();
    }
}
