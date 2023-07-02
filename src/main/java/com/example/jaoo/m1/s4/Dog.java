/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s4;

import java.util.logging.Logger;

/**
 * A sample class with no public constructor
 */
public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;
    private String breed;

    /**
     * Being private it can be called only from code in this class
     * 
     * @param name  the dog name
     * @param breed the dog breed
     */
    private Dog(String name, String breed) {
        // using literals as magic values is NOT GOOD, we'll use class constants soon
        this.name = name == null ? "No Name" : name;
        this.breed = breed == null ? "Mixed" : breed;
    }

    /**
     * static factory method
     * 
     * @return a new dog with default name and breed
     */
    public static Dog createWithNoName() {
        /*
         * 1. fetch images for components a: nose b: tail c: ...
         * 
         * 2. goto database for info on dog breed ...
         * 
         * 3. ...
         */

        log.info("Creating a dog with no name");
        return new Dog(null, null);
    }

    /**
     * static factory method
     * 
     * @param name dog's name
     * @return a new dog with default breed
     */
    public static Dog createWithName(String name) {
        log.info(String.format("Creating a dog with name [%s]", name));
        return new Dog(name, null);
    }

    /**
     * static factory method
     * 
     * @param breed dog's breed
     * @return a new dog with default name
     */
    public static Dog createWithBreedButNoName(String breed) {
        log.info(String.format("Creating a dog with no name and breed [%s]", breed));
        return new Dog(null, breed);
    }

    /**
     * let the dog bark
     */
    public void bark() {
        System.out.printf("%s %s: woof%n", breed, name);
    }
}
