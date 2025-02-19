/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s4;

import java.util.TreeSet;

/**
 * Trees of objects
 */
public class TreeExample {
    public static void main(String[] args) {
        // TreeSet doesn't know where to place a non-comparable object in the collection
        TreeSet<Cat> cats = new TreeSet<>();
        try {
            cats.add(new Cat(11));
        } catch (ClassCastException ex) {
            System.out.println("Cats can't be added to a sorted collection!");
        }

        TreeSet<Dog> dogs = new TreeSet<>();
        dogs.add(new Dog("Tom", "Carl", 4));
        dogs.add(new Dog("Tom", "Bob", 3));
        System.out.println("A sorted collection of dogs: " + dogs);
    }
}
