/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s06;

/**
 * Common way of managing exceptions
 */
public class CommonWay {
    /**
     * Try to negate the input, signal problem when an exception is thrown
     * 
     * @param args use the first argument, when provided, as input
     */
    public static void main(String[] args) {
        Simple simple = new Simple();

        try {
            int value = args.length == 0 ? Integer.MIN_VALUE : Integer.parseInt(args[0]);
            System.out.println("Negate " + value);
            int x = simple.negate(value);
            System.out.println("My value negated is: " + x);
        } catch (Exception ex) {
            System.out.println("Bad input value");
        }

        System.out.println("Bye");
    }
}
