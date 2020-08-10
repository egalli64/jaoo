package m2.s13ex;

public class Vehicle {
    public void steer(boolean right) {
        System.out.println("Steering " + (right ? "right" : "left"));
    }

    public void brake() {
        System.out.println("Braking");
    }
}
