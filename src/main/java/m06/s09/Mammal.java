package m06.s09;

public class Mammal {
    protected int gestation;

    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    public void eat() {
        System.out.println("Gnam!");
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
