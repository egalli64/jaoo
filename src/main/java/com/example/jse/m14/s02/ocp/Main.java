package com.example.jse.m14.s02.ocp;

public class Main {
    public static void main(String[] args) {
        double x = 42.13;
        double y = 12.32;

        System.out.println("Original calculator");
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(x, y));

        System.out.println("\nImproved calculator");
        Calculator2 calc2 = new Calculator2();
        System.out.println("Add: " + calc2.add(x, y));
        System.out.println("Mult: " + calc2.mult(x, y));
    }
}
