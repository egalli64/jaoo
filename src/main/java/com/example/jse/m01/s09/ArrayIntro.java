package com.example.jse.m01.s09;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] values = new int[12];

        values[0] = 7;
        values[1] = 5;
        // ...
        values[11] = 345;

        System.out.print("First element is ");
        System.out.println(values[0]);

        System.out.print("Last element is ");
        System.out.println(values[values.length - 1]);

        int value = values[5];
        System.out.print("Value is ");
        System.out.println(value);

        // !!! be careful with indices !!!
//        value = values[12]; // exception

        // unfortunately this does not work as one would expect
        // see Arrays (next slide) for solution
        System.out.print("The array is ");
        System.out.println(values);

        System.out.println("Done");
    }
}
