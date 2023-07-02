/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s03;

import java.util.List;

/**
 * Three exercises. Compare int[] and List&lt;Integer&gt; behavior
 */
public class Exercise {
    /**
     * Extract from input the even values and return them in an array
     * <p>
     * Examples:
     * <li>in {9, 2, 3, 4} -> out {2, 4}
     * <li>in {6, 2, 4, 2} -> out {2, 2, 4, 6}
     * <li>in {2, 3, 4, 6} -> out {2, 4, 6}
     * 
     * Do not use Collections in here!
     * 
     * @param data a bunch of integers
     * @return even values from input
     */
    public int[] evensRaw(int[] data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Extract from input the even values and return them
     * <p>
     * Example: in {2, 3, 4, 5} -> out {2, 4}
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     */
    public List<Integer> evens(List<Integer> data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Extract non-duplicated values in input and return them in a list.
     * <p>
     * Example: in {5, 4, 2, 3, 7, 4, 5, 6} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public List<Integer> singles(List<Integer> data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
