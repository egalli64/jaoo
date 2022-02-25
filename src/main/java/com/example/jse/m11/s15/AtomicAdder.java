package com.example.jse.m11.s15;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.LongStream;

public class AtomicAdder {
    private static final int SIZE = 200_000_000;
    private static final int NR = 10;

    public static void main(String[] args) {
        TreeSet<Long> results = new TreeSet<>();
        List<Long> times = new ArrayList<>();
        long[] data = LongStream.rangeClosed(1, SIZE).toArray();
        System.out.println("Values in data: " + data[0] + " ... " + data[data.length - 1]);

        for (int j = 0; j < NR; j++) {
            long start = System.currentTimeMillis();
            results.add(adder(data));
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

    private static long partialAdder(long[] data, int begin, int end) {
        long result = 0;
        for (int i = begin; i < end; i++) {
            result += data[i];
        }
        return result;
    }

    private static long adder(long[] data) {
        AtomicLong result = new AtomicLong(0);

        Thread[] threads = { //
                new Thread(() -> result.addAndGet(partialAdder(data, 0, data.length / 4))),
                new Thread(() -> result.addAndGet(partialAdder(data, data.length / 4, data.length / 2))),
                new Thread(() -> result.addAndGet(partialAdder(data, data.length / 2, data.length / 4 * 3))),
                new Thread(() -> result.addAndGet(partialAdder(data, data.length / 4 * 3, data.length))) //
        };

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
        return result.get();
    }
}
