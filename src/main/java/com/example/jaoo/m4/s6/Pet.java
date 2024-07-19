/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s6;

/**
 * this and super
 * <p>
 * Base class
 */
public class Pet {
    private static final String DEFAULT_NAME = "Unknown";

    /** Pet name, visible to derived classes */
    protected String name;

    /**
     * No-arg constructor
     */
    public Pet() {
        // call the canonical constructor
        this(DEFAULT_NAME);
    }

    /**
     * Canonical constructor
     * 
     * @param name pet name
     */
    public Pet(String name) {
        // implicit call to super ctor
        // super();

        // Java idiom, use "this." for the field
        this.name = name;
    }

    /**
     * Getter
     * 
     * @return the pet name
     */
    public String getName() {
        // someone likes using "this" also in getter, for symmetry
        return this.name;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + "]";
    }
}
