package com.example.jse.m01.s07.bugs;

public class Narrowing2 {
    public static void main(String[] args) {
        // [000 0000] [0010 1101] [1100 0110] [1100 0000]
        int value = 3_000_000;
        System.out.println(value);

        byte x = (byte) value;
        System.out.println(x);
    }
}
