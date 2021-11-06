package com.example.jse.m13.s06;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromElsewhere {
    public static void main(String[] args) {
        Integer[] values = { 12, 34, 2, 11, 5, 7 };
        System.out.println("Starting from this array:" + Arrays.toString(values));

        System.out.println("Even numbers from Arrays.stream()");
        Arrays.stream(values).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Odd numbers from Stream.of()");
        Stream.of(12, 34, 2, 11, 5, 7).filter(x -> x % 2 == 1).forEach(System.out::println);

        System.out.println("Small numbers from Stream.builder()");
        Stream.<Integer>builder().add(42).add(2).build().filter(x -> x < 10).forEach(System.out::println);

        int[] data = { 12, 34, 2, 11, 5, 7 };
        System.out.println("Starting from this array:" + Arrays.toString(data));

        System.out.print("Max value (classic) is ");
        try {
            System.out.println(max(data));
        } catch (IllegalArgumentException iae) {
            System.out.println("not present");
        }

        System.out.print("Max value (stream) is ");
        Arrays.stream(data).max().ifPresentOrElse(System.out::println, () -> System.out.println("not present"));
    }

    private static int max(int[] values) {
        if(values == null || values.length == 0) {
            throw new IllegalArgumentException("Please, provide at least a value in the input array");
        }

        int result = Integer.MIN_VALUE;
        for(int value: values) {
            if(value > result) {
                result = value;
            }
        }

        return result;
    }
}
