package com.example.jse.m01.s09;

import java.util.Arrays;

public class ArrayTwoD {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];

        int value = matrix[2][3];

        System.out.println(matrix[2][3] + ", " + value);
        System.out.println(matrix[3][4]);

        // very disappointing
        System.out.println(matrix.toString());
        // disappointing
        System.out.println(Arrays.toString(matrix));
        // this is what we need here
        System.out.println(Arrays.deepToString(matrix));
    }
}
