/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s07;

/**
 * Widening primitives - more details
 */
public class WideningExtra {
    /**
     * Widening a negative integer / converting to floating point large integers
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        /*-
         * Widening a negative value works as expected
         * [11111111] -> -1
         * [11111111][11111111][11111111][11111111] -> -1
         * this would be a mistake: [00000000][00000000][00000000][11111111] -> 255
         */
        byte minusOne8Bit = -1;
        int minusOne32Bit = minusOne8Bit;
        System.out.print(minusOne8Bit);
        System.out.print(" [byte -> int] ");
        System.out.println(minusOne32Bit);

        // For extreme values, float is not good enough, use double instead
        long aBigLongValue = 1_000_000_000_000_000_000L;
        float aFloatApproximation = aBigLongValue;
        double aDoubleConversion = aBigLongValue;
        System.out.print(aBigLongValue);
        System.out.print(" [long -> float] ");
        System.out.print(aFloatApproximation);
        System.out.print(" [long -> double] ");
        System.out.println(aDoubleConversion);

        System.out.println(String.format("Float: %.0f, double: %.0f", aFloatApproximation, aDoubleConversion));
    }
}
