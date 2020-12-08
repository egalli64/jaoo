package m06.s11;

public class Robot extends Toy implements Barker, Jumper {
    public Robot() {
        super(10);
    }

    @Override
    public String bark() {
        return "B-A-R-K";
    }

    @Override
    public String toString() {
        return "Hello " + super.toString();
    }

    @Override
    public void jump() {

    }
}
