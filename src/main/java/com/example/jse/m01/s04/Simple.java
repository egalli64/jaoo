/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s04;

/**
 * A "hello" program that uses the passed args, call it from CLI
 * 
 * @author Emanuele Galli
 */
public class Simple {
    /**
     * Print hello for the passed unique arg (or generic hello)
     * 
     * @param args the user passed args, expected just 0 or 1 of them
     */
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Hello, ");

        // if the caller passes exactly one parameter, output it
        if (args.length == 1) {
            System.out.println(args[0]);
        } else {
            // otherwise output something generic
            System.out.println("stranger");
        }
    }
}
