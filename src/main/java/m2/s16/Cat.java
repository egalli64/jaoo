package m2.s16;

public class Cat extends Mammal {
    private Tail tail;

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
