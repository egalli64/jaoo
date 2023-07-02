/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s5;

/**
 * How to use catch clause to give more information to the user
 */
public class ExtraInfo {
    /**
     * Try to negate the input, detailed information when an exception is thrown
     * 
     * @param args use the first argument, when provided, as input
     */
    public static void main(String[] args) {
        Simple simple = new Simple();

        try {
            int value = args.length == 0 ? Integer.MIN_VALUE : Integer.parseInt(args[0]);
            System.out.println("Negate " + value);
            int x = simple.negateFallback(value);
            System.out.println("My value negated is: " + x);
        } catch (NumberFormatException e) {
            System.out.println("Pass me an integer!");
        } catch (MyNegateException mne) {
            System.out.println("My value negated is close to: " + mne.getAlternativeValue());
        }

        System.out.println("Bye");
    }
}
