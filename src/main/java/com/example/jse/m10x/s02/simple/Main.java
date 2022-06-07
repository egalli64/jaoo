package com.example.jse.m10x.s02.simple;

public class Main {
    public static void main(String[] args) {
        MyIntArray mia = new MyIntArray(1);

        System.out.println(mia);

        for (int i = 0; i < 10; i++) {
            mia.add(i * 2);
            System.out.println(mia);
        }

        System.out.print("The resulting array: [ ");
        for (int i = 0; i < mia.size(); i++) {
            System.out.print(mia.get(i) + " ");
        }
        System.out.println("]");
    }
}
