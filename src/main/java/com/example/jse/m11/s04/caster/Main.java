package com.example.jse.m11.s04.caster;

import java.util.Arrays;
import java.util.concurrent.FutureTask;
import java.util.stream.LongStream;

public class Main {
    private static final int NR = 3;
    private static final int MAX_VALUE = 6;

    public static void main(String[] args) {
        Worker[] workers = new Worker[NR];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        for (Worker worker : workers) {
            worker.start();
        }

        for (Worker worker : workers) {
            try {
                worker.join();
                int result = worker.getResult();
                if(result > 0) {
                    System.out.println(result);
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }
    }

}
