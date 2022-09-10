package com.example.jse.m01.s07;

public class Narrowing {
    public static void main(String[] args) {
        double aDouble = 42.0;
        float aFloat = (float) aDouble;

        // [0000 0000][0000 0000][0000 0000][0000 0000][0000 0000][0000 0000][0000 0000][0010 1010]
        long aLong = (long) aFloat;

        // [0000 0000][0000 0000][0000 0000][0010 1010]
        int anInt = (int) aLong;

        // [0000 0000][0010 1010]
        short aShort = (short) anInt;

        // [00101010]
        byte aByte = (byte) aShort;

        System.out.println(aByte);

        // [0000 0000][0010 1010]
        char aChar = (char) anInt;

        short anotherShort = (short) aChar;

        // notice the difference between print() and println()
        System.out.print(aChar);
        System.out.print(" <-> ");
        System.out.println(anotherShort);
    }
}