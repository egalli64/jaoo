/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s13;

/**
 * Control flow - Loop: continue
 */
public class Countinuer {
    /**
     * Pass to the next iteration in a loop
     * 
     * @param args all the arguments are printed, but the third one
     */
    public static void main(String[] args) {
        System.out.println("Please, pass a few args");
        for (int i = 0; i < args.length; i++) {
            System.out.print("The argument " + i);

            if (i == 2) {
                System.out.println(" is skipped");
                continue;
            }

            System.out.println(" is " + args[i]);
        }

        System.out.println("done!");
    }
}
