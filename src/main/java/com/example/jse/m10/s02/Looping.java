/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s02;

import java.util.List;

/**
 * Iterable - Iterator
 */
public class Looping {
    /**
     * Hiding the iterator, using for-each statement or forEach() method
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Iterable<Integer> iterable = List.of(1, 3, 4, 2, 42);
        System.out.println("Iterable: " + iterable);

        System.out.print("for-each loop: ");
        for (Integer value : iterable) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Java 8 forEach(): ");
        iterable.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
