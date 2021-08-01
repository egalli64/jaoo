package m06.s14;

public class Dog extends Pet {
    public static final double STANDARD_SPEED = 0.0;

    private double speed;

    public Dog() {
        // notice the implicit call to super
        this.speed = STANDARD_SPEED;
    }

    public Dog(String name) {
        this(name, STANDARD_SPEED);
    }

    public Dog(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Dog [speed=" + speed + "] " + super.toString();
    }
}