package com.example.jse.m10.s15.simple;

public class Main {
    public static void main(String[] args) {
        MyIntArray mia = new MyIntArray(1);

        System.out.println(mia);

        for (int i = 0; i < 10; i++) {
            mia.add(i);
            System.out.println(mia);
        }

    }
}
