/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s02;

/**
 * Arithmetic operands on variables expect only int, long, float, and double
 * operands
 */
public class ArithmeticImplicitWidening {
    /**
     * Example of implicit widening using an arithmetic operand
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // implicit widening -> explicit narrowing
        System.out.println("--- adding bytes we get an int! ---");
        byte aByte = 6;
        byte anotherByte = 42;
        byte resultingByte = (byte) (aByte + anotherByte);
        System.out.println(resultingByte);

        System.out.println("--- ... unless their are constants ---");
        final byte constantByte = 6;
        final byte anotherConstantByte = 22;
        resultingByte = constantByte + anotherConstantByte;
        System.out.println(resultingByte);
    }
}
