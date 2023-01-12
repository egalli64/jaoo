/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s06;

/**
 * Control flow - Decision: if else
 */
public class IfElse {
    /**
     * A block is executed if a condition is true, otherwise another block is
     * executed
     * 
     * @param args different print, accordingly to args length
     */
    public static void main(String[] args) {
        // condition is true when no argument is passed
        if (args.length == 0) {
            // executed only if condition is true
            System.out.println("You didn't pass me any argument!");
        } else {
            // executed only if condition is false
            System.out.println("You passed me at least an argument");
        }

        // always executed
        System.out.println("Bye");
    }
}
