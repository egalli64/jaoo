/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s4;

/**
 * An immutable class
 */
public final class ImmutableDog {
    // See String as a more interesting example of immutable class
    private final String name;

    /**
     * Initialize the state of the object, no changes in future
     * 
     * @param name the dog name
     */
    public ImmutableDog(String name) {
        this.name = name;
    }

    /**
     * Being name in immutable, it is safe to pass it around
     * 
     * @return the dog name
     */
    public String getName() {
        return name;
    }

    /**
     * A plain method
     */
    public void bark() {
        System.out.println(name + ": bark!");
    }

    @Override
    public String toString() {
        return "ImmutableDog [name=" + name + "]";
    }
}
