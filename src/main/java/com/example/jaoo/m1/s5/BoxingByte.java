/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing byte
 */
public class BoxingByte {
    /**
     * Create byte objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive byte
        byte bi = 42;

        // the static factory method valueOf() is the preferred way for boxing
        Byte boxed = Byte.valueOf(bi);
        Byte boxed2 = Byte.valueOf("-27");
        try {
            Byte.valueOf("mistake");
        } catch (NumberFormatException ex) {
            System.out.println("Can't box, " + ex);
        }

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Byte boxed3 = new Byte((byte) 99);

        System.out.printf("A few of boxed bytes: %d, %d, %d\n", boxed, boxed2, boxed3);
    }
}
