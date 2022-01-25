package com.example.jse.m14.s05;

public class UsingRuntimeSingleton {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        System.out.println("Free memory in the JVM: " + rt.freeMemory());
    }
}
