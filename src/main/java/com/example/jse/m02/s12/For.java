/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12;

/**
 * Control flow - Loop: for (classic)
 */
public class For {
    /**
     * Show for (classic) usage on an interval of values. Traditionally, right-open
     * intervals are preferred.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        final int left = 0;
        final int right = 10;

        System.out.println("Print even values in the right-open interval " + left + " ... " + right);
        for (int cur = left; cur < right; cur++) {
            if (cur % 2 == 0) {
                System.out.println(cur);
            }
        }

        System.out.println("Print values skipping any second one in the right-open interval " + left + " ... " + right);
        for (int cur = left; cur < right; cur += 2) {
            System.out.println(cur);
        }

        System.out.println("done!");
    }
}
