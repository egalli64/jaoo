/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s02;

/**
 * Invoking methods
 * 
 * @see Simple the referenced class
 */
public class Main {
    /**
     * Invoke methods from the standard library or a custom class
     * 
     * @param args not used
     * @see Simple a class with methods invoked here
     */
    public static void main(String[] args) {
        // calling a static method
        double root = Math.sqrt(121.0);

        // calling an instance method
        System.out.println(root);

        // calling a static method on a custom class
        String aString = Simple.aStaticMethod();
        System.out.println(aString);

        // to call instance methods we need a reference to an object of that class
        Simple reference = new Simple();
        int result = reference.anInstanceMethod(7, 6);
        System.out.println(result);

        reference.anotherInstanceMethod(false);
    }
}
