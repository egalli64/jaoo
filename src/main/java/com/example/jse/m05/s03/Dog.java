/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s03;

import java.util.logging.Logger;

/**
 * A sample class. Each object has two fields, three constructors, one method.
 * At class level it is defined a field, the logger.
 * <p>
 * Notice the bad use of "magic" values as default values for name and breed.
 */
public class Dog {
    private static final Logger log = Logger.getGlobal();

    private String name;
    private String breed;

    /**
     * "No-arg" constructor. The fields are initialized with default values.
     */
    public Dog() {
        // Assign to "this" field the string to the right of the assignment operator
        this.name = "No name"; // BAD! We'll use class constant soon instead
        this.breed = "Mixed"; // BAD! We'll use class constant soon instead
        log.info("A new anonymous dog has been created");
    }

    /**
     * Constructor, the breed, unspecified, is set with a default value
     * 
     * @param name the dog name.
     */
    public Dog(String name) {
        // "this" name is initialized with the parameter name
        this.name = name;
        this.breed = "Mixed"; // BAD! We'll use class constant soon instead
        log.info("A new dog named " + name + " has been created");
    }

    /**
     * Canonical constructor, all fields are initialized by the caller.
     * 
     * @param name  the dog name
     * @param breed the dog breed
     */
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        log.info(String.format("A new dog named %s and breed %s has been created", name, breed));
    }

    /**
     * Let each dog bark in its own way
     */
    public void bark() {
        System.out.println(breed + " " + name + ": woof");
    }
}
