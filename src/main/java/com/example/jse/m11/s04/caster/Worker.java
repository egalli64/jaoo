package com.example.jse.m11.s04.caster;

public class Worker extends Thread {
    private static final int MAX_VALUE = 6;
    private int result = 0;

    @Override
    public void run() {
        int die = (int) Math.ceil(Math.random() * MAX_VALUE);
        if (die > MAX_VALUE / 2) {
            System.out.println("Value is too high (" + die + ")");
        } else {
            result = die;
            // a bit of pathos
            try {
                Thread.sleep((long) result * 1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getResult() {
        return result;
    }
}
