/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s11;

/**
 * Counting methods
 */
public class Counter {
    /**
     * Count even values in the passed array
     * 
     * @param values an array
     * @return the number of even elements in the array
     */
    public static int countEven(int[] values) {
        int result = 0;

        for (int value : values) {
            if (value % 2 == 0) {
                result += 1;
            }
        }
        return result;
    }

    /**
     * Count positive values in the passed array
     * 
     * @param values an array
     * @return the number of positive elements in the array
     */
    public static int countPositive(int[] values) {
        int result = 0;

        for (int value : values) {
            if (value > 0) {
                result += 1;
            }
        }

        return result;
    }

    /**
     * Smoke test for the methods above
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int[] data = { 42, 12, 0, -21, 99, 5, 1 };

        int even = countEven(data);
        System.out.printf("There are %d even values in the array%n", even);

        int positive = countPositive(data);
        System.out.printf("There are %d positive values in the array%n", positive);
    }
}
