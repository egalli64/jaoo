package com.example.jse.m06.s10;

public class Man {
    private String name;

    public Man() {
        this.name = "Unknown";
    }

    public Man(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    @Override
    public String toString() {
        return "A Man named " + name;
    }
}
