/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * A sealed class extending another sealed class
 */
public sealed class Cat extends Pet permits Tabby {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void feeding() {
        System.out.println("Feeding cat " + getName());
    }
}
