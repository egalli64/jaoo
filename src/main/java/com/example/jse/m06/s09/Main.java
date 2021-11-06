package com.example.jse.m06.s09;

public class Main {
    public static void main(String[] args) {
        Mammal[] mammals = { new Dog(63), new Cat(63, 20) };

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }

        Barker barker = new Dog(62, 42);
        barker.bark();

        Dog dog = new Dog(12, 12);
        System.out.println(dog.toString());
        dog.eat();
    }
}
