/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s07;

/**
 * Widening primitives - explicit cast is _not_ required
 */
public class Widening {
    /**
     * Widening from a byte up to a double (and char examples)
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        byte aByte = 70;
        short aShort = aByte;
        int anInt = aShort;
        long aLong = anInt;
        float aFloat = aLong;
        double aDouble = aFloat;

        System.out.println(aDouble);

        // the character 'F' is coded as 70
        char aChar = (char) aShort;
        int anotherInt = aChar;

        // notice the difference between print() and println()
        System.out.print(aChar);
        System.out.print(" <-> ");
        System.out.println(anotherInt);

        // the character '*' is coded as 42
        char asterisk = '*';
        int asterAsInt = asterisk;
        System.out.print(asterisk);
        System.out.print(" <-> ");
        System.out.println(asterAsInt);
    }
}
