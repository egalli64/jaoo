/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.mex.s04;

/**
 * Loop - Exercise 4
 * <p>
 * Calculate square root using Newton's method
 * 
 * <li>Initialize previous as value / 2
 * <li>Iteratively let the result be (previous + value / previous) / 2
 * <li>Return the result if its distance from previous is less than epsilon
 * <li>Otherwise assign result to previous and go for another iteration
 */
public class Exercise4 {
    /**
     * Square root by Newton method
     * 
     * Epsilon should be set to 0.001
     * 
     * @param value base value
     * @return calculated square root
     */
    public static double sqrt(double value) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Square root using Newton method
     * 
     * @param value
     * @param epsilon stop iterating when gain is less than this value
     * @return calculated square root
     */
    public static double sqrt(double value, double epsilon) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
