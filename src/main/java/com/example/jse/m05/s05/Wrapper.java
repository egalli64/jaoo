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
    public static void main(String[] args) {
        Object[] wrappers = { Boolean.class, Character.class, Short.class, Integer.class, Float.class, Double.class };
        System.out.println("Wrapper classes: " + Arrays.toString(wrappers));

        // deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Integer i = new Integer(1);

        Integer j = Integer.valueOf(2);
        System.out.printf("%d plus %d is %d%n", i, j, i + j);

        int k = j.intValue();
        System.out.println("k is " + k);

        Integer m = 3;
        f(m);

        int n = j;
        System.out.println("n is " + n);
    }

    private static void f(Object obj) {
        System.out.println("An object: " + obj);
    }
}
