package com.example.jse.m10.s02;

import java.util.Collection;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        Collection<Integer> iterable = List.of(1, 3, 4, 2, 42);
        System.out.println("Collection: " + iterable);

        System.out.print("for-each loop: ");
        for (Integer value : iterable) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Java 8 forEach(): ");
        iterable.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
