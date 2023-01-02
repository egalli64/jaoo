/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s08;

/**
 * Swapping primitive values
 */
public class Primitives {
    public static void main(String[] args) {
        // Any primitive type would lead to the same result
        int a = 1;
        int b = 2;
        printCurrentStatus("Original status", a, b);

        buggySwap(a, b);
        printCurrentStatus("After call to (buggy) swap method", a, b);

        // Workaround: swap primitives where it is needed
        int temp = a;
        a = b;
        b = temp;
        printCurrentStatus("After local swap", a, b);
    }

    /**
     * Primitives swap: not possible in Java
     * 
     * @param left  expected to be swapped with right
     * @param right expected to be swapped with left
     */
    private static void buggySwap(int left, int right) {
        int temp = left;
        left = right;
        right = temp;

        printCurrentStatus("Inside (buggy) swap method", left, right);
    }

    /**
     * Utility method to print some information
     * 
     * @param message a message
     * @param first   a value
     * @param second  another value
     */
    private static void printCurrentStatus(String message, int first, int second) {
        System.out.println(String.format("%s: first is %d, second is %d", message, first, second));
    }
}
