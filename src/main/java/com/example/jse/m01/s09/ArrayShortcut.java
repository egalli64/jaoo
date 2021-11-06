package com.example.jse.m01.s09;

import java.util.Arrays;

public class ArrayShortcut {
    public static void main(String[] args) {
        int[] data = { 1, 4, 13 };

        // convert the array to a string and then print it
        System.out.println(Arrays.toString(data));

        // change the last element of the array
//        data[data.length] = 21; // WRONG! exception!
        data[data.length - 1] = 21; // correct
        System.out.println(Arrays.toString(data));

        System.out.print("The last element is ");
        System.out.println(data[data.length - 1]);

        System.out.print("The length is ");
        System.out.println(data.length);
    }
}
