package com.example.jse.m11.s07.caster;

public class Worker extends Thread {
    private static final int MAX_VALUE = 6;
    private int result = 0;

    @Override
    public void run() {
        int die = (int) Math.ceil(Math.random() * MAX_VALUE);
        if (die > MAX_VALUE / 2) {
            System.out.println("Too high (" + die + ")");
        } else {
            result = die;
        }
    }

    public int getResult() {
        return result;
    }
}
