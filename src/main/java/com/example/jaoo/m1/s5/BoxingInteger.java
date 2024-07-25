/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing int
 */
public class BoxingInteger {
    /**
     * Create integer objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive integer
        int i = 42_000_000;

        // the static factory method valueOf() is the preferred way for boxing
        Integer boxed = Integer.valueOf(i);
        Integer boxed2 = Integer.valueOf("-2000000000");
        try {
            Integer.valueOf("mistake");
        } catch (NumberFormatException ex) {
            System.out.println("Can't box, " + ex);
        }

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Integer boxed3 = new Integer(Integer.MAX_VALUE);

        System.out.printf("A few of boxed integers: %d, %d, %d\n", boxed, boxed2, boxed3);
    }
}
