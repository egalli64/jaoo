/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s10;

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
