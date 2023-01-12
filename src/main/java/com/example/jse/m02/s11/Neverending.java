/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s11;

/**
 * Control flow - Infinite Loop (while)
 */
public class Neverending {
    /**
     * Print a dot, sleep for a second, repeat forever (or until someone kill the
     * process).
     * 
     * @param args not used
     * @throws InterruptedException when the OS kills the process
     */
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print('.');
            Thread.sleep(1_000);
        }
    }
}
