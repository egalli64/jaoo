/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Introduction to unchecked exception
 */
public class Example2Unchecked {
    private static final Logger log = Logger.getGlobal();

    /**
     * Calling a method that could throw an unchecked exception
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // simulate a value coming from somewhere else
        double input = -15.3;
        System.out.println("The input is " + input);

        // The try-catch construct
        try {
            // in the try block the code that could throw an exception
            double result = by2ExUnchecked(-15.3);
            System.out.println("The result is " + result);
        } catch (Exception ex) {
            // when an exception is thrown in the try block
            // the stack unwinding let the execution control go here

            // maybe a message to the user
            System.out.printf("Can't work with %.1f - no negative values, please!\n", input);
            // a log message is strongly suggested to help debugging
            log.log(Level.SEVERE, "Can't double the passed value", ex);
        }

        // Unchecked exception: the try-catch is not mandatory
        input *= -1;
        System.out.println("The input is " + input);
        double result = by2ExUnchecked(input);
        // In case of exception the next statement is not executed
        System.out.println("The result is " + result);
    }

    /**
     * Double the passed value, if not negative
     * 
     * @param value a non-negative value
     * @return the doubled input value
     * @throws IllegalArgumentException when negative input passed
     */
    public static double by2ExUnchecked(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value should not be negative: " + value);
        }

        return value * 2;
    }
}
