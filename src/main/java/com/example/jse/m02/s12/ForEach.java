/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s12;

import java.util.Arrays;

/**
 * Control flow - Loop: for-each
 */
public class ForEach {
    /**
     * Show for-each usage on array, and comparison with classic for loop. The loop
     * variable is a copy of the current value in the array.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three", "four", "five" };

        // for-each helps readability
        System.out.println("Print each array element");
        for (String number : numbers) {
            System.out.println(number);
        }

        // we really don't care about "i" here
        System.out.println("Print the elements in the array, from the first to the last");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // beware of how for-each works on primitives
        System.out.println("The loop variable in a for-each is just a copy of the element in the array");
        int[] ai = { 1, 2, 3, 4, 5 };
        for (int cur : ai) {
            cur += 1;
            System.out.println(cur);
        }
        System.out.println("No change in the array: " + Arrays.toString(ai));

        // beware of how for-each works on immutable references
        System.out.println("In a for-each reference to immutable can't be used to change an element!");
        for (String number : numbers) {
            number += "!";
            System.out.println(number);
        }
        System.out.println("No change in the array: " + Arrays.toString(numbers));

        // classic for is what we need in this case
        System.out.println("Classic for gives us full control on the array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += "!";
            System.out.println(numbers[i]);
        }
        System.out.println("The array has changed: " + Arrays.toString(numbers));
    }
}
