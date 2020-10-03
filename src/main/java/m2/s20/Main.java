package m2.s20;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");

        String name = tom.getName();
        double speed = tom.getSpeed();

        // dog speed copy, the change here has no effect on original value
        speed += 3;

        System.out.println("Local name and speed: " + name + ", " + speed);
        System.out.println(tom);
    }
}
