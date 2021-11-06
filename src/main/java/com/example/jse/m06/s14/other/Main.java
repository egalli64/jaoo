package com.example.jse.m06.s14.other;

public class Main {
    public static void main(String[] args) {
        Dog jim = new Poodle("Jim");
        Dog p2 = new Poodle();

        System.out.println(p2.getName());

        System.out.println(jim);
        System.out.println(p2);

        Dog tom = new Labrador("Tom");
        System.out.println(tom.getName());
    }
}
