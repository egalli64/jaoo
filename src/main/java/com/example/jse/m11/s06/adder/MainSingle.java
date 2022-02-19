package com.example.jse.m11.s06.adder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.LongStream;

public class MainSingle {
    private static final int SIZE = 200_000_000;
    private static final int NR = 10;

    public static void main(String[] args) {
        TreeSet<Long> results = new TreeSet<>();
        List<Long> times = new ArrayList<>();
        long[] data = LongStream.rangeClosed(1, SIZE).toArray();
        System.out.println("Values in data: " + data[0] + " ... " + data[data.length - 1]);

        for (int j = 0; j < NR; j++) {
            long start = System.currentTimeMillis();
            results.add(plainAdder(data));
            times.add(System.currentTimeMillis() - start);
        }

        if (results.size() != 1) {
            System.out.println("Unexpected number of results!");
        } else {
            System.out.println("Result is " + results.first());
        }

        if (results.isEmpty()) {
            System.out.println("No times!");
        } else {
            System.out.println("Time is in " + times);
        }
    }

    private static long plainAdder(long[] data) {
        long result = 0;
        for (long value : data) {
            result += value;
        }
        return result;
    }
}
