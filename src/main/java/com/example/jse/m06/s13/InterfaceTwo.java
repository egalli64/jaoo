/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s13;

/**
 * A modern interface
 */
public interface InterfaceTwo {
    /** A method with a default implementation */
    default void aMethod() {
        System.out.println("Goodbye");
    }
}
