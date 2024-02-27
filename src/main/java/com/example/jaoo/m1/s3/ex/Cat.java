/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s3.ex;

/**
 * A sample class. Each object has:
 * <ul>
 * <li>two fields
 * <li>two constructors (overload)
 * <li>a method
 * </ul>
 */
public class Cat {
    // TODO: Each cat should have a name and a color

    /**
     * Canonical constructor for a cat with a given name and color
     * 
     * @param name  the cat name
     * @param color the cat color
     */
    public Cat(String name, String color) {
        // TODO: initialize the object
    }

    /**
     * Constructor for a cat with a given color but with no name
     * 
     * @param color the cat color
     */
    public Cat(String color) {
        // TODO: initialize the object
    }

    /**
     * The current cat meow on the console
     */
    public void meow() {
        // TODO: Print name and color to System.out
    }
}
