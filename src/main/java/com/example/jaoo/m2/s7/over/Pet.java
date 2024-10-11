/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7.over;

/**
 * Base class
 */
public class Pet {
    /**
     * A polymorphic method
     */
    public void eat() {
        System.out.println("Pet is eating");
    }

    @Override
    public String toString() {
        return "A pet";
    }
}
