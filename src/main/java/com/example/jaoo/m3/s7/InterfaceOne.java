/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s7;

/**
 * A modern interface
 */
interface InterfaceOne {
    /** A method with a default implementation */
    default void aMethod() {
        System.out.println("Hello");
    }
}
