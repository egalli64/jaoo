/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s03;

/**
 * Passing parameters to method
 * 
 * @see ParameterPassing the referenced class
 */
public class Main {
    /**
     * Invoke methods having primitives, immutable and mutable references as
     * parameters
     * 
     * @param args not used
     * @see ParameterPassing a class with methods invoked here
     */
    public static void main(String[] args) {
        ParameterPassing pp = new ParameterPassing();

        // primitive variable, can't be changed by called method
        int aPrimitiveValue = 12;
        System.out.println("A primitive value has been initialized to " + aPrimitiveValue);
        pp.primitive(aPrimitiveValue);
        System.out.println("Primitive value is still " + aPrimitiveValue);

        // immutable reference, can't be changed by called method
        String aString = "Hi";
        System.out.println("A string (immutable reference) has been initialized to " + aString);
        pp.immutableReference(aString);
        System.out.println("String is still " + aString);

        // mutable reference, its content can be changed by called method
        StringBuilder aReferenceValue = new StringBuilder("Hi");
        System.out.println("A reference value has been initialized to " + aReferenceValue);
        pp.reference(aReferenceValue);
        System.out.println("referenceValue now is " + aReferenceValue);

        // array is a mutable reference
        int[] anArray = { 42 };
        System.out.println("An array contains " + anArray[0]);
        pp.reference(anArray);
        System.out.println("Now the array contains " + anArray[0]);

        // to change a primitive we have to do it in the scope of the variable
        int other = 12;
        System.out.print("Another primitive was " + other);
        other = pp.increase(other);
        System.out.println(" now it is " + other);

        // to change a immutable reference we have to do it in the scope of the variable
        String anotherString = "Hello";
        System.out.print("Another string was " + anotherString);
        anotherString = pp.append(anotherString);
        System.out.println(" now it is " + anotherString);
    }
}
