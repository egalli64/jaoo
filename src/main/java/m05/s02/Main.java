package m05.s02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // no dog created here
        Dog[] dogs = new Dog[2];
        System.out.println(Arrays.toString(dogs));

        Dog tom = new Dog();
        dogs[0] = tom;
        dogs[1] = new Dog();
        dogs[0].bark();
        dogs[1].bark();
        tom.bark();
    }
}
