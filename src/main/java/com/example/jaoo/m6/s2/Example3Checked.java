/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Introduction to checked exception
 */
public class Example3Checked {
    private static final Logger log = Logger.getGlobal();

    /**
     * Calling a method that could throw a checked exception
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // simulate a value coming from somewhere else
        double input = -15.3;
        System.out.println("The input is " + input);

        try {
            double result = by2ExChecked(input);
            System.out.println("The result is " + result);
        } catch (Exception ex) {
            System.out.printf("Can't work with %.1f - no negative values, please!\n", input);
            log.log(Level.SEVERE, "Can't double the passed value", ex);

            // when is required to stop the method execution
            // return;

            // alternatively, re-throw
            // throw ex;
        }

        // For checked exception try-catch (or throws) is mandatory
//        double result = by2ExChecked(input);
//        System.out.println(result);
    }

    /**
     * Double the passed value, if not negative
     * 
     * @param value a non-negative value
     * @return the doubled input value
     * @throws Exception when negative input passed
     */
    public static double by2ExChecked(double value) throws Exception {
        if (value < 0) {
            throw new Exception("Value should not be negative: " + value);
        }

        return value * 2;
    }
}
