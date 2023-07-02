/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7.ex;

/**
 * Override exercise
 * 
 * Complete the classes Cat, Dog, Mouse with a toString() override
 * 
 * Put instances of those classes in an array, and print them as strings
 */
public class Main {
    public static void main(String[] args) {
        Object tom = new Cat();
        System.out.println(tom.toString());
        System.out.println("***");

        // TODO: put a cat, a dog, and a mouse in the array
        Object[] objects = new Object[0];

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i].toString());
        }
    }
}
