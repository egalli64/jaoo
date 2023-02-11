/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s11;

/**
 * Adder method
 */
public class Adder {
    /**
     * Add all the values in the input array
     * 
     * (the sum here is assumed being relatively small)
     * 
     * @param values an array
     * @return the total sum of elements
     */
    public static int sum(int[] values) {
        int result = 0;

        for (int value : values) {
            result += value;
        }

        return result;
    }

    /**
     * Smoke test for the method above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 42, 12, 0, -21, 99, 5, 1 };

        int result = sum(data);
        System.out.println("The result of adding all the elements in the arrays is " + result);
    }
}
