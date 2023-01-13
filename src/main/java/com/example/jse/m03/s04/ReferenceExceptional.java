/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s04;

import java.util.Objects;

/**
 * Bad arguments - signaled by exception
 * <p>
 * When the parameter is a reference, should be checked also for not being null.
 */
public class ReferenceExceptional {
    /**
     * When calling Exceptional::mySqrt we should remember to try-catch the call.
     * Otherwise we could have an unexpected program termination.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try {
            // Passing null as argument
            double radix = mySqrt(null);
            System.out.println("Square root is " + radix);
        } catch (NullPointerException ex) {
            System.out.println("Can't calculate the square root: " + ex.getMessage());
        }

        try {
            // Passing a bad argument
            double radix = mySqrt(-1.0);
            System.out.println("Square root is " + radix);
        } catch (NullPointerException | IllegalArgumentException ex) {
            System.out.println("Can't calculate the square root: " + ex.getMessage());
        }

        // Uncaught exception leads to program termination
        double radix = mySqrt(-1.0);
        System.out.println("Square root is " + radix);
    }

    /**
     * Being the parameter a reference, it is checked also against null
     * 
     * @param value it should be not null, and a non-negative valid number
     * @return the square root
     * @throws IllegalArgumentException for negative values and NaN
     * @throws NullPointerException     when value is null
     */
    public static double mySqrt(Double value) {
        Objects.requireNonNull(value, "value must not be null");
        if (value < 0 || Double.isNaN(value)) {
            throw new IllegalArgumentException(String.valueOf(value));
        }

        return Math.sqrt(value);
    }
}
