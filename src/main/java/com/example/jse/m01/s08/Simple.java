package com.example.jse.m01.s08;

public class Simple {
    public static void main(String[] args) {
        int value = 42;
        String name = "Bob";
        String other = null;

        System.out.println(value);
        System.out.print(Integer.toHexString(System.identityHashCode(name)));
        System.out.print(" [\"reference\" -> object] ");
        System.out.println(name);
        System.out.println(other);
    }
}
