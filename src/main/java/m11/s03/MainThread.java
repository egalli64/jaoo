package m11.s03;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Starting main thread");

        Thread t0 = new Thread(() -> System.out.println("A message from a Runnable"));
        Thread t1 = new AnotherThread();
        RunnableClass rc = new RunnableClass();

        System.out.println("Starting " + t0.getName());
        t0.start();
        System.out.println("Starting " + t1.getName());
        t1.start();
        System.out.println("Starting " + rc.getName());
        rc.start();

        System.out.println("Main thread done");
    }
}
