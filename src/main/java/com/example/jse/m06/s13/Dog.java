/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s13;

/**
 * A sample class
 */
public class Dog {
    private String name;

    /**
     * Canonical constructor
     * 
     * @param name dog name
     */
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
}
