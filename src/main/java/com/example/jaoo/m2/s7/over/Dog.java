/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7.over;

/**
 * A derived class
 */
public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    /**
     * An overloaded method
     * 
     * @param times how many times
     */
    public void eat(int times) {
        for (int i = 0; i < times; i++) {
            eat();
        }
    }

    @Override
    public String toString() {
        return "A dog";
    }
}
