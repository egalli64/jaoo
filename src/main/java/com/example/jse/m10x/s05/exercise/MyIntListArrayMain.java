package com.example.jse.m10x.s05.exercise;

/**
 * TODO: Implement and use a statically sized array based list of integers
 */
public class MyIntListArrayMain {
    public static void main(String[] args) {
        MyIntList mil = new MyIntListArray();

        if (!mil.isEmpty()) {
            System.out.println("Unexpected!");
        }

        mil.add(42);
        System.out.println(mil.toString());
    }
}
