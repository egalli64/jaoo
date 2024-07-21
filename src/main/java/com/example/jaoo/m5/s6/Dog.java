/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s6;

/**
 * A final class extending a sealed class and implementing a sealed interface
 */
public final class Dog extends Pet implements Brushable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void brush() {
        System.out.println("Brushing dog " + getName());
    }

    @Override
    public void feeding() {
        System.out.println("Feeding dog " + getName());
    }
}
