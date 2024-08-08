/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s4.other;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fix-a-bug exercise
 */
public class Mistake {
    private static final Logger log = Logger.getGlobal();

    /**
     * A Math.incrementExact() bugged alternative
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        System.out.println("Value is " + value);

        try {
            value = Math.incrementExact(value);
        } catch (ArithmeticException ae) {
            System.out.println("Can't increment " + value);
            log.log(Level.SEVERE, "Cannot increase " + value, ae);
        }

        System.out.println("Value is " + value);

        // TODO: the user is not happy for the following code
        long result = incrementToLong(value);
        System.out.println("Incremented value is " + result);
    }

    /**
     * Fix this bugged method
     * 
     * @param x an integer
     * @return the increased value as long
     */
    static long incrementToLong(int x) {
        return x + 1;
    }
}
