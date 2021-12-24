package com.example.jse.m11.s07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DiceCaster {
    private static final int NR = 3;
    private static final int MAX_VALUE = 6;

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        FutureTask<Integer>[] dice = new FutureTask[NR];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new FutureTask<>(() -> {
                int result = (int) Math.ceil(Math.random() * MAX_VALUE);
                if (result > MAX_VALUE / 2) {
                    throw new IllegalStateException("Value is too high (" + result + ")");
                } else {
                    // a bit of pathos
                    Thread.sleep((long) result * 1_000);
                }

                return result;
            });
        }

        for (var die : dice) {
            new Thread(die).start();
        }

        for (var die : dice) {
            try {
                System.out.println(die.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}