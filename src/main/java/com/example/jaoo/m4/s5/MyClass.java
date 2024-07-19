/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * An embarrassing class. A method with exactly the same signature is present in
 * both the interfaces implemented.
 */
public class MyClass implements InterfaceOne, InterfaceTwo {
    /**
     * MyClass MUST override this method. The choice is between which super run or,
     * if both should be executed, in which order should run.
     */
    @Override
    public void aMethod() {
        InterfaceOne.super.aMethod();
        InterfaceTwo.super.aMethod();
    }

    /**
     * Smoke test for aMethod()
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.aMethod();
    }
}
