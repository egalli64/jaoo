package m10.s05;

public class UnsynchronizedHello {
    public void sayHello(String name) {
        System.out.print("Hello ");
        try {
            // job simulation
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(name + "!");
    }
}
