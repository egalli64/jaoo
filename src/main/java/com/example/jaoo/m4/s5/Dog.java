/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

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
