package com.example.jse.m06.s14;

public class Pet {
    protected String name;

    public Pet() {
        // passing no name is like passing "Unknown"
        this("Unknown");
    }

    public Pet(String name) {
        // implicit call to super ctor
        super();
        this.name = name;
    }

    public String getName() {
        // someone likes using "this" also in getter, for symmetry
        return this.name;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + "]";
    }
}