/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s08;

/**
 * A modern interface
 */
interface Modern {
    /**
     * A static methods
     */
    public static void f() {
        System.out.println("Static method in interface is a Java 8 feature");
    }

    /**
     * A concrete method
     * 
     * @param message a message
     */
    public default void c(String message) {
        System.out.println("Default body for interface method is a Java 8 feature");
        d(message);
    }

    /**
     * A private method
     * 
     * @param message a message
     */
    private void d(String message) {
        System.out.println("Private interface method is a Java 9 feature: " + message);
    }
}
