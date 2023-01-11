/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s10;

import java.util.Arrays;

/**
 * Defining and using a two-dimensional array
 */
public class Matrix {
    public static void main(String[] args) {
        // four rows, five columns
//        int[][] matrix = new int[4][5];
        int[][] matrix = { //
                { 1, 2, 3, 4, 5 }, //
                { 6, 7, 8, 9, 10 }, //
                { 11, 12, 13, 14, 15 }, //
                { 16, 17, 18, 19, 20 } //
        };

        // reading a value from a matrix
        int value = matrix[2][3];

        // changing a value in a matrix
        matrix[2][3] = 93;

        System.out.print("Value extracted from matrix: ");
        System.out.println(value);

        // very disappointing
        System.out.print("Matrix to string: ");
        System.out.println(matrix.toString());
        // disappointing
        System.out.print("Arrays::toString() is not enough for multidimensional arrays: ");
        System.out.println(Arrays.toString(matrix));
        // this is what we need here
        System.out.print("Arrays::deepToString() is what we need here: ");
        System.out.println(Arrays.deepToString(matrix));
    }
}
