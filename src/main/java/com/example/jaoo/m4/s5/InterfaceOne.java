/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * A modern interface
 */
public interface InterfaceOne {
    /** A method with a default implementation */
    default void aMethod() {
        System.out.println("Hello");
    }
}
