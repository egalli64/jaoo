/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s16;

/**
 * An immutable class
 */
public final class Dog {
    public static final int HOUSING_COST = 10;

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + ": bark!");
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + "]";
    }
}
