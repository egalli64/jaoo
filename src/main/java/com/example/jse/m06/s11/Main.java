package com.example.jse.m06.s11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Can't instantiate an interface
//        Barker barker = new Barker();

        // Can instantiate an array of reference to an interface
        Barker[] barkers = { new Fox(), new Dog(), new Robot(), new Poodle() };

        // toString() on an array is Object.toString()
        System.out.println(barkers);

        // this one is better
        System.out.println(Arrays.toString(barkers));

        // Each Barker barks in its own way
        for (Barker aBarker : barkers) {
            System.out.println(aBarker.bark());
        }

        // A dog is a WaggingBarker
        WaggingBarker baw = new Dog();
        System.out.println(baw.wag());

        // A dog is a Dog
        Dog dog = new Dog();
        System.out.println(dog.bark(3));

        // A dog is a Barker
        interact(dog);

        // A dog is an Object
        Object obj = new Dog();

        // The right method is called on obj
        System.out.println(obj.toString());
    }

    static void interact(Barker barker) {
        System.out.println(barker.bark());
    }
}
