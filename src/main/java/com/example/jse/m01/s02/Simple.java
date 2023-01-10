/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s02;

// java.lang import is not required, implicitly imported!
// import java.lang.System;

/**
 * A Java "Hello world"
 * 
 * @author Emanuele Galli
 */
public class Simple {
    /**
     * Just to say hello
     * 
     * @param args when passed, the first argument is printed
     */
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Hello ");

        // output is based on input arguments
        if (args.length == 1) {
            System.out.println(args[0]);
        }
    }
}
