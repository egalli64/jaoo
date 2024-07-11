/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Introduction to exception
 */
public class Example {
    private static final Logger log = Logger.getGlobal();

    /**
     * Comparing the use of error code and exception
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        withoutException();

        // The try-catch construct
        try {
            // in the try block the code that could throw an exception
            double result = by2ExUnchecked(-15.3);
            System.out.println(result);
        } catch (Exception ex) {
            // when an exception is thrown in the try block
            // the stack unwinding let the execution control go here

            // maybe a message to the user
            System.out.println("Bad input, no neg please!");
            // a log message is strongly suggested to help debugging
            log.log(Level.SEVERE, "Can' double the passed value", ex);
        }

        // Unchecked exception: the try-catch is not mandatory
        double result = by2ExUnchecked(15.3);
        // In case of exception the next statement is not executed
        System.out.println(result);

        try {
            result = by2ExChecked(-15.3);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Bad input, no neg please!");
            log.log(Level.SEVERE, "Can' double the passed value", ex);

            // when is required to stop the method execution
            // return;

            // alternatively, re-throw
            // throw ex;
        }

        // Checked exception: try-catch (or throws) is mandatory
        // result = by2ExChecked(-15.3);
        // System.out.println(result);

        System.out.println("Done");
    }

    /**
     * Error handling by error code
     */
    private static void withoutException() {
        // The error code idiom
        // 1. call the method that could fail
        double result = by2(-15.3);
        // 2. check the result
        if (Double.isNaN(result)) {
            // 2a. Error code detected, signal the problem
            System.out.println("Bad input");
        } else {
            // 2b. No error code, result is good, use it
            System.out.println(result);
        }

        // Bad but lucky
        result = by2(15.3);
        System.out.println(result);

        // Bad and unlucky: not checking the return code when required!
        result = by2(-15.3);
        System.out.println(result);
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
