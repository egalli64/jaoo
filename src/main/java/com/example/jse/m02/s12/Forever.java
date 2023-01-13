/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12;

/**
 * Control flow - Infinite Loop (for)
 * 
 * @see Neverending same, but using while instead
 */
public class Forever {
    /**
     * Print a dot, sleep for a second, repeat forever (or until someone kill the
     * process).
     * 
     * @param args not used
     * @throws InterruptedException when the OS kills the process
     */
    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            System.out.print('.');
            Thread.sleep(1_000);
        }
    }
}
