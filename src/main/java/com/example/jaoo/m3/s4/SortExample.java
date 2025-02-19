/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s4;

import java.util.Arrays;

/**
 * Sorting array of objects
 */
public class SortExample {
    public static void main(String[] args) {
        // Arrays.sort() doesn't know how to sort non-comparable objects
        Cat[] cats = { new Cat(11), new Cat(2), new Cat(8), new Cat(2) };
        System.out.println("Original order cats: " + Arrays.toString(cats));
        try {
            Arrays.sort(cats);
        } catch (ClassCastException ex) {
            System.out.println("Can't sort cats!");
        }

        // ComparableDogs can be sorted
        Dog[] dogs = { new Dog("Tom", "Carl", 4), new Dog("Tom", "Bob", 3) };
        System.out.println("Original order dogs: " + Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println("Sorted dogs: " + Arrays.toString(dogs));
    }
}
