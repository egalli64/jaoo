/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07;

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
