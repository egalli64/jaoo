/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s02;

/**
 * Assignment and compound assignment operators
 */
public class Assignment {
    /**
     * Basic operations with assignment
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int alpha = 2;
        System.out.print("alpha = ");
        System.out.println(alpha);

        // same as: alpha = alpha + 8;
        alpha += 8; // 10
        System.out.print("alpha += 8 leads to alpha = ");
        System.out.println(alpha);

        // same as: alpha = alpha - 3;
        alpha -= 3; // 7
        System.out.print("alpha -= 3 leads to alpha = ");
        System.out.println(alpha);

        // same as: alpha = alpha * 2;
        alpha *= 2; // 14
        System.out.print("alpha *= 2 leads to alpha = ");
        System.out.println(alpha);

        // same as: alpha = alpha / 2;
        alpha /= 2; // 7
        System.out.print("alpha /= 2 leads to alpha = ");
        System.out.println(alpha);

        // same as: alpha = alpha % 5;
        alpha %= 5; // 2
        System.out.print("alpha %= 5 leads to alpha = ");
        System.out.println(alpha);

        // risky! implicit narrowing!
        // same as: alpha = (int) (alpha + 3_000_000_000L);
        alpha += 3_000_000_000L; // -1_294_967_294
        System.out.print("Be careful! alpha += 3_000_000_000L leads to alpha = ");
        System.out.println(alpha);

        // the plain "add to" idiom is safer, requiring an explicit cast
        // alpha = alpha + 3_000_000_000L;

        // Compile time error
        // Type mismatch: cannot convert from long to int
        // alpha = alpha + 3_000_000_000L;
    }
}
