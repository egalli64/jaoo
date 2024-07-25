/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing short
 */
public class BoxingShort {
    /**
     * Create short objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive short
        short si = 42;

        // the static factory method valueOf() is the preferred way for boxing
        Short boxed = Short.valueOf(si);
        Short boxed2 = Short.valueOf("-27");
        try {
            Short.valueOf("mistake");
        } catch (NumberFormatException ex) {
            System.out.println("Can't box, " + ex);
        }

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Short boxed3 = new Short((short) 99);

        System.out.printf("A few of boxed shorts: %d, %d, %d\n", boxed, boxed2, boxed3);
    }
}
