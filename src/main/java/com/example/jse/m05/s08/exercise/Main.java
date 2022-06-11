package com.example.jse.m05.s08.exercise;

public class Main {
    // TODO: let this code work correctly
    public static void main(String[] args) {
        Square square = new Square(3.0);

        System.out.println("Area is: " + square.area());
        System.out.println("Perimeter is: " + square.perimeter());

        Circle circle = new Circle(4.0);
        System.out.println("Area is: " + circle.area());
        System.out.println("Perimeter is: " + circle.perimeter());
    }
}
