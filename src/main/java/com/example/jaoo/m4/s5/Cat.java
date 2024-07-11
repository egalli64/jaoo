/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * Cat is a Pet
 */
public class Cat extends Pet {
    /**
     * Canonical constructor
     * 
     * @param name the cat name
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Cat noise
     */
    public void meow() {
        System.out.println("meow!");
    }

    @Override
    public void makeNoise() {
        meow();
    }
}
