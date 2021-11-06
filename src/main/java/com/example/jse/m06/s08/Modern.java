package com.example.jse.m06.s08;

public abstract interface Modern {
    public static void f() {
        System.out.println("A Java 8 feature");
    }

    public default void c(String message) {
        System.out.println("Another Java 8 feature: " + message);
        d();
    }

    private void d() {
        System.out.println("A Java 9 feature");
    }
}
