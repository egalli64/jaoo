package com.example.jse.m03.s04;

import java.util.Objects;

public class ReferenceExceptional {
    public static void main(String[] args) {
        try {
            // Passing null as argument
            double radix = mySqrt(null);
            System.out.println("Square root is " + radix);
        } catch (NullPointerException npe) {
            System.out.println("Can't calculate the square root: " + npe.getMessage());
        }

        try {
            // Passing a bad argument
            double radix = mySqrt(-1.0);
            System.out.println("Square root is " + radix);
        } catch (NullPointerException | IllegalArgumentException ex) {
            System.out.println("Can't calculate the square root: " + ex.getMessage());
        }

        // If the coder does not catch the exception, the program ends!
        double radix = mySqrt(-1.0);
        System.out.println("Square root is " + radix);
    }

    public static double mySqrt(Double value) {
        Objects.requireNonNull(value);

        if (value < 0 || Double.isNaN(value)) {
            throw new IllegalArgumentException(String.valueOf(value));
        }

        return Math.sqrt(value);
    }
}
