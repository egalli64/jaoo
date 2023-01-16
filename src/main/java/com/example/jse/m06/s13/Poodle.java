/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s13;

/**
 * A class extending Dog. Show the use of "super()" in constructor and "super."
 * in toString()
 */
public class Poodle extends Dog {
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

    @Override
    public String toString() {
        return "Poodle [owner=" + owner + ", " + super.toString() + "]";
    }
}
