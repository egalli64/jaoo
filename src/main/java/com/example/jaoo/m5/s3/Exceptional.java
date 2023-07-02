/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s3;

/**
 * A class representing a resource with methods that throw exceptions
 */
public class Exceptional implements AutoCloseable {
    /**
     * Simulating a resource setup
     */
    public Exceptional() {
        System.out.println("Object setup");
    }

    @Override
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
