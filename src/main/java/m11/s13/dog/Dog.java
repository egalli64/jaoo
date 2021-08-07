package m11.s13.dog;

public class Dog {
    private Runnable barkStrategy;

    public Dog(Runnable barkStrategy) {
        this.barkStrategy = barkStrategy;
    }

    public Dog() {
        this(() -> System.out.println("Woof"));
    }

    public void setBarkStrategy(Runnable barkStrategy) {
        this.barkStrategy = barkStrategy;
    }

    void bark() {
        barkStrategy.run();
    }
}
