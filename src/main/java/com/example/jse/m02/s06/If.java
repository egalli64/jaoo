/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s06;

/**
 * Control flow - Decision: if
 */
public class If {
    /**
     * A block executed only if a condition is true
     * 
     * @param args if no arg is passed, the if-block is executed
     */
    public static void main(String[] args) {
        // condition is true when no argument is passed
        if (args.length == 0) {
            System.out.println("You didn't pass me any argument!");
        }

        // always executed
        System.out.println("Bye");
    }
}
