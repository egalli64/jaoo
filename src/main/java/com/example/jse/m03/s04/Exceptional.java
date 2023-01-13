/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s04;

/**
 * Bad arguments - signaled by exception
 * <p>
 * When the parameter is a primitive, should be checked for having a good value.
 */
public class Exceptional {
    /**
     * When calling Exceptional::mySqrt we should remember to try-catch the call.
     * Otherwise we could have an unexpected program termination.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Bad argument
        double argument = -1.0;

        try {
            double radix = mySqrt(argument);
            System.out.println("Square root is " + radix);
        } catch (IllegalArgumentException ex) {
            System.out.println("Can't calculate the square root of " + argument);
        }

        // If an exception is not caught, the program ends!
        double radix = mySqrt(argument);
        System.out.println("Square root is " + radix);
    }

    /**
     * A this wrapper around Math::sqrt(). If the parameter is "not good" an
     * exception is thrown.
     * 
     * @param value it should be a non-negative valid number
     * @return the square root
     * @throws IllegalArgumentException for negative values and NaN
     */
    public static double mySqrt(double value) {
        if (value < 0 || Double.isNaN(value)) {
            throw new IllegalArgumentException("Bad input: " + value);
        }

        return Math.sqrt(value);
    }
}
