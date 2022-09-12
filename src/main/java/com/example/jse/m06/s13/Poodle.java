package com.example.jse.m06.s13;

public class Poodle extends Dog {
    private String owner;

    public Poodle(String name, String owner) {
        super(name);

        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Poodle [owner=" + owner + ", " + super.toString() + "]";
    }
}
