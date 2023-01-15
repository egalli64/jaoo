/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s02;

import java.util.Arrays;

/**
 * Show class, instance, reference at work
 */
public class Main {
    /**
     * Class, instance, and reference
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // An array of references, no dog created here: [null, null]
        Dog[] dogs = new Dog[2];
        System.out.println(Arrays.toString(dogs));

        // A dog is created, its reference is put in tom
        Dog tom = new Dog();
        // The tom reference is copied in the element 0 of dogs
        dogs[0] = tom;
        // A dog is created, its reference is put in the element 1 of dogs
        dogs[1] = new Dog();

        // use references to access objects and invoke bark() on them
        dogs[0].bark();
        dogs[1].bark();
        tom.bark();
    }
}
