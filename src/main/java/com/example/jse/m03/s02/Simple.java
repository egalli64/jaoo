/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s02;

/**
 * Defining methods
 * 
 * @see Main a class that invokes methods of this class
 */
public class Simple {
    /**
     * A static method
     * 
     * @return a string
     */
    static String aStaticMethod() {
        return "Hi";
    }

    /**
     * An instance method having as parameters two integers and returning an integer
     * 
     * @param a a value
     * @param b another value
     * @return the product of the two input values
     */
    int anInstanceMethod(int a, int b) {
        return a * b;
    }

    /**
     * A void instance method having as parameter a boolean
     * 
     * @param flag a value
     */
    void anotherInstanceMethod(boolean flag) {
        if (flag) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
    }
}