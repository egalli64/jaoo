package com.example.jse.m10x.s11;

import java.util.List;

public class Exercise {
    /**
     * Extract non-duplicated values in input and return them in a list, for example:
     * <li>in {2, 3, 4, 4, 4, 5, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     * <li>in {4, 5, 4, 2, 5, 3, 6, 7} -> out {2, 3, 6, 7}
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     */
    public List<Integer> singles(int[] data) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void main(String[] args) {
        List<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
        System.out.println(result);
    }
}
