package com.example.jse.m11.s04.caster;

public class Main {
    private static final int NR = 3;

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
