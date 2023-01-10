/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s07.bugs;

/**
 * A possible narrowing bug
 */
public class Narrowing2 {
    /**
     * When narrowing, a positive number could become negative
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // [000 0000] [0010 1101] [1100 0110] [1100 0000]
        int value = 3_000_000;
        System.out.println(value);

        // [1100 0000]
        byte x = (byte) value;
        System.out.println(x);
    }
}
