/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s2;

/**
 * An immutable class
 */
public final class Dog {
    /** A class constant */
    public static final int HOUSING_COST = 10;

    /** Once initialized, it won't change anymore */
    private final String name;

    /**
     * Canonical constructor
     * 
     * @param name dog name
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * A plain method
     */
    public void bark() {
        System.out.println(name + ": bark!");
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
}
