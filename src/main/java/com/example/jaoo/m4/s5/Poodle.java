/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * A class extending Dog. Show the use of "super()" in constructor and "super."
 * in toString()
 */
public class Poodle extends Dog {
    private static final String DEFAULT_DOG_NAME = "Fuffy";
    private String owner;

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param owner dog owner
     */
    public Poodle(String name, String owner) {
        super(name);

        this.owner = owner;
    }

    /**
     * Constructor using default dog name for this poodle
     * 
     * @param owner dog owner
     */
    public Poodle(String owner) {
        this(DEFAULT_DOG_NAME, owner);

        // alternative: constructor code duplication
//        super(DEFAULT_DOG_NAME);
//
//        this.owner = owner;
    }

    @Override
    public void bark() {
        System.out.println("Grr ... ");
        super.bark();
        System.out.println("... Grr");
    }

    @Override
    public String toString() {
        return "Poodle [owner=" + owner + ", " + super.toString() + "]";
    }
}
