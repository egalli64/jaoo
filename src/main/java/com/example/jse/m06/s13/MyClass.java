package com.example.jse.m06.s13;

public class MyClass implements InterfaceOne, InterfaceTwo {
    @Override
    public void aMethod() {
        InterfaceOne.super.aMethod();
        InterfaceTwo.super.aMethod();
    }
}
