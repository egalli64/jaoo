/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */

package com.example.jaoo.m2.s4.protect;

/**
 * A class meant to be extended
 */
public class Pet {
    /** do you really want to make a field protected? */
    protected double weight;

    /**
     * Canonical constructor
     * 
     * @param weight the pet weight
     */
    public Pet(double weight) {
        this.weight = weight;
    }

    /**
     * A mutator
     */
    public void eat() {
        weight += 0.1;
    }

    @Override
    public String toString() {
        return "Pet [weight=" + weight + "]";
    }
}
