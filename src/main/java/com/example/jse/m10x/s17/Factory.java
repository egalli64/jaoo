package com.example.jse.m10x.s17;

import java.util.Arrays;
import java.util.List;

public class Factory {
    public static void main(String[] args) {
        arraysAsList();
        listOf();
    }

    private static void arraysAsList() {
        List<Integer> values = Arrays.asList(1, 2, 3);
        System.out.println("Using Arrays.asList() to create a mutable, fix sized list of integers: " + values);

        try {
            values.add(42);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't call  add(), it throws a " + ex);
        }

        values.set(0, 42);
        System.out.println("First element changed: " + values);
        System.out.println("***");
    }

    private static void listOf() {
        try {
            List.of(1, 2, 3, null);
        } catch(NullPointerException ex) {
            System.out.println("Can't pass a null to List.of(): " + ex);
        }

        List<Integer> values = List.of(1, 2, 3);
        System.out.println("Using List.of() to create an immutable list of integers: " + values);

        try {
            values.add(42);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't call add(), it throws a " + ex);
        }

        try {
            values.set(0, 42);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Can't call set(), it throws a " + ex);
        }
        System.out.println("***");
    }
}
