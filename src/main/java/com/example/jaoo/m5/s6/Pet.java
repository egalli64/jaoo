/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s6;

/**
 * An abstract sealed class
 */
public abstract sealed class Pet permits Dog, Cat {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void feeding();

    @Override
    public String toString() {
        return "Pet [name=" + name + "]";
    }
}
