package m10.s03;

public class RunnableClass implements Runnable {
    private Thread thread;

    public RunnableClass() {
        this.thread = new Thread(this);
    }

    @Override
    public void run() {
        System.out.println("A message from a Runnable Class");
    }

    public void start() {
        thread.start();
    }

    public String getName() {
        return thread.getName();
    }
}
