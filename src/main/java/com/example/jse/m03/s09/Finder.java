/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s09;

import java.util.Arrays;

/**
 * Look for a value in an array
 */
public class Finder {
    /**
     * Get the index of the first occurrence in the array for a given value
     * 
     * @param data   an array
     * @param target the searched element
     * @return the first index in which the value is found, or -1
     * @throws NullPointerException if data is null
     */
    public static int indexOf(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check if a value is contained in the array
     * 
     * @param data   an array
     * @param target the element to be checked
     * @return true if the element is in the array
     * @throws NullPointerException if data is null
     */
    public static boolean contains(int[] data, int target) {
        for (int current : data) {
            if (current == target) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get the index of the last occurrence in the array for a given value
     * 
     * @param data   an array
     * @param target the searched element
     * @return the last index in which the value is found, or -1
     * @throws NullPointerException if data is null
     */
    public static int lastIndexOf(int[] data, int target) {
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Smoke test for the methods above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 42, 12, 1, 21, 99, 5 };
        System.out.println("The sample array: " + Arrays.toString(data));

        int value = 21;
        System.out.println("Looking for value " + value);

        // Example for indexOf()
        int index = indexOf(data, value);
        System.out.print(value + " is");
        if (index == -1) {
            System.out.println(" not found");
        } else {
            System.out.println(" in position " + index);
        }

        // Example for contains()
        System.out.print(value + " is");
        if (!contains(data, value)) {
            System.out.print(" not");
        }
        System.out.println(" found ");

        // Example for lastIndexOf()
        int lastIndex = lastIndexOf(data, value);
        System.out.print(value + " is");
        if (lastIndex == -1) {
            System.out.println(" not found");
        } else {
            System.out.println(" in position " + lastIndex);
        }
    }
}
