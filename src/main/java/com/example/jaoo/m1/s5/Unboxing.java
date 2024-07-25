/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing and unboxing primitives
 */
public class Unboxing {
    /**
     * play around with Integer wrapper
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // explicit boxing of an integer
        Integer i = Integer.valueOf(2);
        // implicit boxing of an integer - it looks harmless but it is not
        Integer j = 1;

        System.out.printf("Two boxed integers: %d and %d\n", i, j);
        System.out.printf("Adding boxed integers: %d + %d = %d\n", i, j, i + j);

        // explicit unboxing
        int k = j.intValue();
        System.out.println("Primitive k is " + k);

        f(i);

        // implicit unboxing - nothing to worry about it
        int n = j;
        System.out.println("Primitive n is " + n);

        // n is implicitly boxed
        f(n);
    }

    /**
     * Any wrapper is a reference
     * 
     * @param obj the argument could actually be of any type!
     */
    private static void f(Object obj) {
        System.out.println("An object: " + obj);
    }
}
