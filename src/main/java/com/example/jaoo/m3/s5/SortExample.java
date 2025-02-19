/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5;

import java.util.Arrays;

/**
 * Sorting array of objects
 */
public class SortExample {
    public static void main(String[] args) {
        // ComparableDogs can be sorted
        Dog[] dogs = { new Dog("Git", "Carl", 4), new Dog("Git", "Bob", 5), new Dog("Zip", "Kim", 5) };
        System.out.println("Original order dogs: " + Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println("Natural sorted dogs: " + Arrays.toString(dogs));
        Arrays.sort(dogs, new CustomDogComparator());
        System.out.println("Custom sorted dogs: " + Arrays.toString(dogs));
    }
}
