package com.example.jse.m06.s08;

public class Main {
    public static void main(String[] args) {
        System.out.println(Explicit.XYZ);
        System.out.println(WeekDay.TUESDAY);
        Modern.f();

        Modern m = new Modern() {
        };

        m.c("hello");

        ModernFunctional mf = () -> System.out.println("Hello Functional Programming in Java");
        mf.example();
    }
}
