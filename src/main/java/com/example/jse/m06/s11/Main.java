/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s11;

import java.util.Arrays;

/**
 * Interface vs class example
 */
public class Main {
    /**
     * Using interfaces and classes
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Can't instantiate an interface
//        Barker barker = new Barker();

        // Can instantiate an array of reference to an interface
        Barking[] barkings = { new Fox(), new Dog(), new Robot(), new Poodle() };

        // toString() on an array is Object::toString()
        System.out.println(barkings);

        // this one is better
        System.out.println(Arrays.toString(barkings));

        // Each barking barks in its own way
        for (Barking aBarker : barkings) {
            System.out.println(aBarker.bark());
        }

        // A dog is a WaggingBarking
        WaggingBarking baw = new Dog();
        System.out.println(baw.wag());

        // A dog is a Dog
        Dog dog = new Dog();
        System.out.println(dog.bark(3));

        // A dog is a Barking
        interact(dog);

        // A dog is an Object
        Object obj = new Dog();

        // The right method is called on object
        System.out.println(obj.toString());
    }

    /**
     * Parameter example
     * 
     * @param barking a barking
     */
    static void interact(Barking barking) {
        System.out.println(barking.bark());
    }
}
