/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15;

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