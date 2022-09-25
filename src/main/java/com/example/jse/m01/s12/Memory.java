package com.example.jse.m01.s12;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(x);

        int values[] = { 7, x };
        System.out.println(Arrays.toString(values));

        String s = "Tom";
        System.out.println(s);

        int data[] = new int[3];
        System.out.println(Arrays.toString(data));

        String[] names = { "Bo", s };
        System.out.println(Arrays.toString(names));
    }
}
