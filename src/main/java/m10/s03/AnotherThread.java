package m10.s03;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println("A message from AnotherThread");
    }
}
