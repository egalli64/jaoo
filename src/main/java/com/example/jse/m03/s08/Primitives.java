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
        int x = 1;
        int y = 2;
        printCurrentStatus("Original status", x, y);

        buggySwap(x, y);
        printCurrentStatus("After call to (buggy) swap method", x, y);

        // Workaround: swap primitives where it is needed
        int temp = x;
        x = y;
        y = temp;
        printCurrentStatus("After local swap", x, y);
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
