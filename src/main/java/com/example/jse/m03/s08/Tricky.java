/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s08;

import java.util.Arrays;

/**
 * Swapping primitives in tricky ways.
 * 
 * (don't do that in production code!)
 */
public class Tricky {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.printf("x=%d, y=%d%n", x, y);

        // no temporary variable through addition
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.printf("x=%d, y=%d%n", x, y);

        // no temporary variable through exclusive or (xor)
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.printf("x=%d, y=%d%n", x, y);

        // big values could lead to undefined behavior (though usually looks all right)
        x = 2_000_000_000;
        y = 1_000_000_000;
        System.out.printf("x=%d, y=%d%n", x, y);

        x = x + y; // overflow
        System.out.println("Overflow in x: " + x);
        y = x - y; // underflow
        x = x - y; // underflow
        System.out.printf("x=%d, y=%d%n", x, y);

        // swapping an element with itself by exclusive or usually leads to error
        int[] values = { 1, 2, 3 };
        System.out.println("The array: " + Arrays.toString(values));

        // this works correctly
        int i = 0;
        int j = 2;

        values[i] = values[i] ^ values[j];
        values[j] = values[i] ^ values[j];
        values[i] = values[i] ^ values[j];
        System.out.println("The array after swap: " + Arrays.toString(values));

        // this _does not work_ correctly
        i = 1;
        j = 1;

        values[i] = values[i] ^ values[j];
        values[j] = values[i] ^ values[j];
        values[i] = values[i] ^ values[j];
        System.out.println("The array after swap: " + Arrays.toString(values));
    }
}
