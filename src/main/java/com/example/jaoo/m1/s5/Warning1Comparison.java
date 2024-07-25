/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Some cases requiring attention when using boxed primitives
 * <p>
 * 1. Do not compare boxed primitives by == or !=
 */
public class Warning1Comparison {
    public static void main(String[] args) {
        System.out.println("Comparing boxed primitives with == or != could be surprising");

        // For better performance, Integer in range [-128 .. 127] are cached
        // The upper bound could be extended by setting a system property
        final int expectedMaxCachedInteger = 127;

        for (int i = 0; i < 2; i++) {
            Integer boxed = expectedMaxCachedInteger + i;
            Integer boxed2 = expectedMaxCachedInteger + i;

            // boxed integers are object, == do not check the actual integer value!
            if (boxed == boxed2) {
                System.out.printf("Integer %d == Integer %d\n", boxed, boxed2);
            } else {
                System.out.printf("Integer %d != Integer %d\n", boxed, boxed2);
            }

            // to check for equality, use equals()
            if (boxed.equals(boxed2)) {
                System.out.printf("Integer %d equals Integer %d\n", boxed, boxed2);
            } else {
                System.out.println("Unexpected!");
            }
        }
    }
}
