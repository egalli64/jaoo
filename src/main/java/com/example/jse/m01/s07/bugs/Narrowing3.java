/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s07.bugs;

/**
 * A possible narrowing bug
 */
public class Narrowing3 {
    /**
     * When narrowing from floating point to integer, values bigger than int max
     * value are truncated to that limit
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // floating point -> integer
        double aLargeValue = 3_000_000_000.0;

        // [0111 1111][1111 1111][1111 1111][1111 1111]
        int maxInInt = (int) aLargeValue;
        System.out.println("Three billions (double) casted to int gives int max value");
        System.out.println(maxInInt);

        aLargeValue *= 2;
        maxInInt = (int) aLargeValue;
        System.out.println("Six billions (double) casted to int gives still int max value!");
        System.out.println(maxInInt);
    }
}
