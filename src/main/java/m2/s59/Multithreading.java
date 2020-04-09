package m2.s59;

public class Multithreading {
    public static void main(String[] args) {
        Runnable runnable = new Runner();

        Thread[] threads = { new Thread(runnable), new MyThread() };
        for (Thread t : threads) {
            t.start();
        }

        System.out.println("Main thread done");
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("The Runner runs");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread runs");
    }
}