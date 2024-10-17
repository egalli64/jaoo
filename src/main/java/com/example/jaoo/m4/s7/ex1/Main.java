/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s7.ex1;

/**
 * Exercise: create a hierarchy of classes based on Person
 * <p>
 * Consultant: daily fee
 * <p>
 * Employee: monthly salary
 */
public class Main {
    /**
     * Create a bunch of persons
     * <p>
     * Print name and daily / salary accordingly to their actual type
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Person[] persons = { /* ... */ };

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
