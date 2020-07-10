package m2.s19;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");

        String name = tom.getName();
        double speed = tom.getSpeed();

        System.out.println("Name and speed: " + name + ", " + speed);
    }
}
