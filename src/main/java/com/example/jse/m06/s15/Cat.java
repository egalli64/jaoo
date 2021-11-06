package com.example.jse.m06.s15;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("meow!");
    }

    @Override
    public void saySomething() {
        meow();
    }
}