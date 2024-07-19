/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s4;

/**
 * A sample class
 */
public class Man {
    private static final String DEFAULT_NAME = "Unknown";
    private String name;

    /**
     * No-arg constructor
     */
    public Man() {
        this.name = DEFAULT_NAME;
    }

    /**
     * Canonical constructor
     * 
     * @param name man name
     */
    public Man(String name) {
        this.name = name;
    }

    /**
     * A simple method
     */
    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    @Override
    public String toString() {
        return "A Man named " + name;
    }
}
