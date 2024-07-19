/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s7;

/**
 * Dog is a Pet
 */
public class Dog extends Pet {
    /**
     * Canonical constructor
     * 
     * @param name dog name
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Dog noise
     */
    public void bark() {
        System.out.println("bark!");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
