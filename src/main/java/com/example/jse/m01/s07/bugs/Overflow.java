/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s07.bugs;

/**
 * Can't put in a value more than its max
 */
public class Overflow {
    /**
     * Adding positive integers, we could get a negative result!
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int bob = 1_000_000_001;
        int tom = 1_000_000_002;
        int kim = 1_000_000_003;
        int jon = 1_000_000_004;

        int wrong = bob + tom + kim + jon;
        System.out.printf("%d + %d + %d + %d = %d%n", bob, tom, kim, jon, wrong);

        // at least one operand should be a long to kick in the long addition operator
        long correct = (long) bob + tom + kim + jon;
        System.out.printf("%d + %d + %d + %d = %d%n", bob, tom, kim, jon, correct);
    }
}
