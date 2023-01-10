/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s07.bugs;

/**
 * A possible narrowing bug
 */
public class Narrowing {
    /**
     * When narrowing from an int to a byte, the three most significant bytes are cut out
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // [0000 0000][0000 1111][0100 0010][0100 0000]
        int value = 1_000_000;
        System.out.println(value);

        // [0100 0000]
        byte x = (byte) value;
        System.out.println(x);
    }
}
