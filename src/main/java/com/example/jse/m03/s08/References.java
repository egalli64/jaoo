/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s08;

/**
 * Swapping references (mutable and immutable)
 */
public class References {
    public static void main(String[] args) {
        // Mutable references
        StringBuilder a = new StringBuilder("Alpha");
        StringBuilder b = new StringBuilder("Beta");
        printCurrentStatus("Original status (mutable references)", a, b);

        swap(a, b);
        printCurrentStatus("After call to swap method", a, b);

        // Immutable references
        String s = "Sam";
        String t = "Tom";
        printCurrentStatus("Original status (immutable references)", s, t);

        buggySwap(s, t);
        printCurrentStatus("After call to (buggy) swap method", s, t);

        // Workaround: swap immutable references where it is needed
        String buffer = s;
        s = t;
        t = buffer;
        printCurrentStatus("After local swap", s, t);
    }

    /**
     * Swap the values of two mutable references
     * 
     * @param left  to be swapped with right
     * @param right to be swapped with left
     * @throws NullPointerException if left or right is null
     */
    private static void swap(StringBuilder left, StringBuilder right) {
        // save the content of left
        String temp = left.toString();

        // replace the content of left with right
        left.replace(0, left.length(), right.toString());

        // replace the content of right with the _original_ content of left
        right.replace(0, right.length(), temp);
    }

    /**
     * Immutable references swap: not possible in Java
     * 
     * @param left  expected to be swapped with right
     * @param right expected to be swapped with left
     */
    private static void buggySwap(String left, String right) {
        String temp = left;
        left = right;
        right = temp;
        printCurrentStatus("Inside (buggy) swap method", left, right);
    }

    /**
     * Utility method to print some information
     * 
     * @param message a message
     * @param first   a character sequence (String or StringBuilder)
     * @param second  another character sequence (String or StringBuilder)
     */
    private static void printCurrentStatus(String message, CharSequence first, CharSequence second) {
        System.out.printf("%s: first is %s, second is %s%n", message, first, second);
    }
}
