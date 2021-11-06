package com.example.jse.m13.s09;

import java.util.List;

import java.util.Comparator;

public class StreamIntermediateExample {
    public static void main(String[] args) {
        List<Integer> values = List.of(1, 3, 2, 1, 5, 2);
        System.out.println("Original data: " + values);

        // filter
        System.out.println("Count odd ones: " + values.stream().filter(x -> x % 2 == 1).count());

        // sorted and limit
        System.out.println("Top three values");
        values.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        // distinct, sorted, limit
        System.out.println("Bottom three sorted values (no duplicates)");
        values.stream().distinct().sorted().limit(3).forEach(System.out::println);

        // distinct, sorted, skip
        System.out.println("Values after first three ones (no duplicates)");
        values.stream().distinct().sorted().skip(3).forEach(System.out::println);

        // take while
        System.out.println("Printing values while odd");
        values.stream().takeWhile(x -> x % 2 == 1).forEach(System.out::println);

        // drop while
        System.out.println("Discard the initial odd values, then print");
        values.stream().dropWhile(x -> x % 2 == 1).forEach(System.out::println);
    }
}
