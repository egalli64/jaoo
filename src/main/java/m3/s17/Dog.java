package m3.s17;

public class Dog extends Pet {
    private double speed;

    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}