package m06.s09;

public class Dog extends Mammal implements Barker {
    private Tail tail;

    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }

    public void wag() {
        tail.wag();
    }

    @Override
    public void bark() {
        System.out.println("Wap!");
    }
}
