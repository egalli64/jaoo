/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s15.ex3;

/**
 * Exercise: create a hierarchy of classes based on Pet. Each Pet subclass has
 * an housing cost. Each pet instance has its own number of days booking,
 * specified by constructor.
 * <p>
 * Dog (more expensive), Cat
 */
public class Main {
    /**
     * Create a bunch of pets, each with its own associated number of days.
     * <p>
     * For each pet print the total housing cost. Then print the total housing cost.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Pet[] guests = {};

        int total = 0;
        for (Pet guest : guests) {
            total += guest.housing();
        }

        System.out.println("Total bill for guests: " + total);
    }
}
