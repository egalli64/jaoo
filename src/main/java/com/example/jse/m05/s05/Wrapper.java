/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s05;

import java.util.Arrays;

/**
 * Wrapper classes to primitives
 */
public class Wrapper {
    /**
     * List the available primitive wrapper types, then play around with Integer
     * wrapper
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Object[] wrappers = { Boolean.class, Character.class, Short.class, Integer.class, Float.class, Double.class };
        System.out.println("Wrapper classes: " + Arrays.toString(wrappers));

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Integer i = new Integer(1);

        // static factory method is preferred
        Integer j = Integer.valueOf(2);
        System.out.printf("%d plus %d is %d%n", i, j, i + j);

        // explicit unboxing
        int k = j.intValue();
        System.out.println("k is " + k);

        // implicit boxing (remember that here an object is created)
        Integer m = 3;
        f(m);

        // implicit unboxing - commonly used
        int n = j;
        System.out.println("n is " + n);

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
