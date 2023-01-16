/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s14;

/**
 * this and super
 * <p>
 * Smoke test
 */
public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");

        String name = tom.getName();
        double speed = tom.getSpeed();

        // immutable, we can't change it, a new object is generated instead
        name = "Bob";

        // it is just a copy, the change here has no effect on original value
        speed += 3;

        System.out.println("Local name and speed: " + name + ", " + speed);
        System.out.println(tom);

        Dog dog = new Dog();
        System.out.println(dog);
    }
}
