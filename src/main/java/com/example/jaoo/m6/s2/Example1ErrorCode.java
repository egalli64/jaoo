/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Introduction to exception - alternative approach, error code
 */
public class Example1ErrorCode {
    private static final Logger log = Logger.getGlobal();

    /**
     * Calling a method that could return an error code
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // simulate a value from somewhere else
        double input = -15.3;
        System.out.println("The input is " + input);

        // The error code idiom
        // 1. call the method that could fail
        double result = by2(input);
        // 2. check the result
        if (Double.isNaN(result)) {
            // 2a. Error code detected, signal the problem
            log.log(Level.SEVERE, "Can't double the passed value " + input);
            System.out.println("Bad input");
        } else {
            // 2b. No error code, result is good, use it
            System.out.println("The result is " + result);
        }
        System.out.println();

        // Bad: not checking the return code when required!

        // Unlucky
        result = by2(input);
        System.out.println("The result is " + result);
        System.out.println();

        // Lucky
        input *= -1;
        System.out.println("The input is " + input);

        result = by2(15.3);
        System.out.println("The result is " + result);
    }

    /**
     * Double the passed value, if not negative
     * <p>
     * Unacceptable input values would cause a Double.NaN return code
     * 
     * @param value a non-negative value
     * @return the doubled input value, or NaN in case of negative input
     */
    public static double by2(double value) {
        if (value < 0) {
            return Double.NaN;
        }

        return value * 2;
    }
}
