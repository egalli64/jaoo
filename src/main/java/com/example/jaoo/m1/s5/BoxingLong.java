/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing long
 */
public class BoxingLong {
    /**
     * Create long integer objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive long integer
        long li = 42_000_000_000L;

        // the static factory method valueOf() is the preferred way for boxing
        Long boxed = Long.valueOf(li);
        Long boxed2 = Long.valueOf("-200000000000");
        try {
            Long.valueOf("mistake");
        } catch (NumberFormatException ex) {
            System.out.println("Can't box, " + ex);
        }

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Long boxed3 = new Long(Long.MAX_VALUE);

        System.out.printf("A few of boxed long integers: %d, %d, %d\n", boxed, boxed2, boxed3);
    }
}
