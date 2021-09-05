package m11.s06;

public class WaitNotify {
    private static class Worker implements Runnable {
        private boolean done;

        public Worker() {
            this.done = false;
        }

        @Override
        public synchronized void run() {
            done = true;
            notifyAll();
        }

        public boolean isDone() {
            return done;
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t = new Thread(worker);
        t.start();

        synchronized (worker) {
            try {
                while (!worker.isDone()) {
                    System.out.println("Wait for the job");
                    worker.wait();
                    System.out.println("Back to work");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Wait interrupted");
            }
        }
    }
}
