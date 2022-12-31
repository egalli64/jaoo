/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s08.swap;

import java.util.Arrays;

/**
 * Swapping elements in array
 */
public class SwapInArray {
    public static void main(String[] args) {
        // an array: whichever base type will do
        int[] data = { 2, -9, 1, 3, 88, 5 };
        printCurrentStatus("Original status", data);

        swap(data, 1, 4);
        printCurrentStatus("After calling swap method", data);
    }

    /**
     * Swap two elements in the passed array
     * 
     * @param data the array
     * @param i    a position
     * @param j    another position
     * @exception NullPointerException           array is null
     * @exception ArrayIndexOutOfBoundsException indices not in bound
     */
    private static void swap(int[] data, int i, int j) {
        int buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }

    /**
     * Utility method to print some information
     * 
     * @param message a message
     * @param values  an array
     */
    private static void printCurrentStatus(String message, int[] values) {
        System.out.println(String.format("%s: %s", message, Arrays.toString(values)));
    }
}
