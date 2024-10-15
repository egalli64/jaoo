/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s4;

/**
 * A non-comparable cat
 */
public class Cat {
    private int id;

    public Cat() {
        this.id = -1;
    }

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat " + id;
    }
}
