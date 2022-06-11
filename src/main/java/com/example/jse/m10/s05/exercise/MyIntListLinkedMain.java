package com.example.jse.m10.s05.exercise;

/**
 * TODO: Implement and use a single linked list of integers
 */
public class MyIntListLinkedMain {
    public static void main(String[] args) {
        MyIntListLinked mil = new MyIntListLinked();

        if (!mil.isEmpty()) {
            System.out.println("Unexpected!");
        }

        mil.add(42);
        System.out.println(mil.toString());
    }
}
