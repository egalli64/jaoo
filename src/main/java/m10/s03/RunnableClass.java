package m10.s03;

public class RunnableClass implements Runnable {
    private Thread thread;

    public RunnableClass() {
        this.thread = new Thread(this);
    }

    @Override
    public void run() {
        System.out.println("A message from a RunnableClass on thread " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%s message %d", Thread.currentThread().getName(), i));

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
    }

    public void start() {
        thread.start();
    }

    public String getName() {
        return thread.getName();
    }
}
