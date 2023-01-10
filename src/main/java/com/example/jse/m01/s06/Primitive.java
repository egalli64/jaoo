/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s06;

/**
 * Primitive types
 */
public class Primitive {
    /**
     * Define and print a variable for each primitive type
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);

        char c = 's';
        System.out.println(c);

        byte y = 42;
        System.out.println(y);

        short x = 12_000;
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        long n = 9_000_000_000_000_000_000L;
        System.out.println(n);

        float f = 3.4e38F;
        System.out.println(f);

        double d = 1.7e308;
        System.out.println(d);
    }
}
