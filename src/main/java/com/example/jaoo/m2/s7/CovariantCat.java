/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7;

/**
 * A sample class to see (covariant) override at work
 */
public class CovariantCat {
    /**
     * An instance factory method
     * 
     * @return a new CovariantCat
     */
    protected CovariantCat createSon() {
        return new CovariantCat();
    }

    @Override
    public String toString() {
        return "A covariant cat";
    }
}
