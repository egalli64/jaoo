package m10.s06;

public class WaitNotify {
    private static class Worker extends Thread {
        private boolean done;

        public Worker() {
            this.done = false;
        }

        @Override
        public synchronized void run() {
            done = true;
            notify();
        }

        public boolean isDone() {
            return done;
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();

        synchronized (worker) {
            try {
                while (!worker.isDone()) {
                    System.out.println("Wait for the job");
                    worker.wait();
                    System.out.println("Back to work");
                }
            } catch (InterruptedException e) {
                System.out.println("Wait interrupted");
            }
        }
    }
}
