package m2.s13;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
//        Barker[] group = new Barker[3];
//        
//        group[0] = new Fox();
//        group[1] = new Dog();
//        group[2] = new Robot();
        
        Barker[] barkers = { new Fox(), new Dog(), new Robot() };
        System.out.println(barkers);
        System.out.println(Arrays.toString(barkers));

        for (Barker aBarker : barkers) {
            System.out.println(aBarker.bark());
        }

        WaggingBarker baw = new Dog();
        System.out.println(baw.wag());

        Dog dog = new Dog();
        System.out.println(dog.bark(3));

        interact(dog);

        Object obj = new Dog();
        System.out.println(obj.toString());
    }

    static void interact(Barker barker) {
        System.out.println(barker.bark());
    }

    static void interact(Object obj) {
        System.out.println(obj.toString());
    }
}
