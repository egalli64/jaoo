package m06.s09;

public class Dog extends Mammal implements Barker, Drinker {
    private Tail tail;
    
    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    public Dog(int gestationDays) {
        super(gestationDays);
        this.tail = new Tail(12);
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

    @Override
    public void drink() {
        System.out.println("Sip!");
    }
}
