/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s03;

/**
 * A class with methods that throw exceptions
 */
public class Exceptional {
    /**
     * Simulating a resource setup
     */
    public Exceptional() {
        System.out.println("Object setup");
    }

    /**
     * Simulating a resource shutdown
     */
    public void close() {
        System.out.println("Object cleanup");
    }

    /**
     * A checked exception thrower
     * 
     * @throws Exception
     */
    public void aCheckedThrower() throws Exception {
        // ...
        if (somethingUnexpected()) {
            throw new Exception();
        }
    }

    /**
     * If the exception thrown is unchecked, no "throws" required
     * 
     * @throws IllegalStateException
     */
    public void anUncheckedThrower() {
        // ...
        if (somethingUnexpected()) {
            throw new IllegalStateException();
        }
    }

    /**
     * An unchecked exception thrower with specified "throws"
     * 
     * @throws IllegalStateException
     */
    public void anotherUncheckedThrower() throws IllegalStateException {
        // ...
        if (somethingUnexpected()) {
            throw new IllegalStateException();
        }
    }

    /**
     * Just an example
     * 
     * @return true when something goes wrong
     */
    private boolean somethingUnexpected() {
        return true;
    }
}
