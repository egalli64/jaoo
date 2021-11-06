package com.example.jse.m03.s03;

public class Main {

    public static void main(String[] args) {
        ParameterPassing pp = new ParameterPassing();

        int aPrimitiveValue = 12;
        System.out.println("A primitive value has been initialized to " + aPrimitiveValue);
        pp.primitive(aPrimitiveValue);
        System.out.println("Primitive value is still " + aPrimitiveValue);

        String aString = "Hi";
        System.out.println("A string (immutable reference) has been initialized to " + aString);
        pp.immutableReference(aString);
        System.out.println("String is still " + aString);

        StringBuilder aReferenceValue = new StringBuilder("Hi");
        System.out.println("A reference value has been initialized to " + aReferenceValue);
        pp.reference(aReferenceValue);
        System.out.println("referenceValue now is " + aReferenceValue);

        int[] anArray = { 42 };
        System.out.println("An array contains " + anArray[0]);
        pp.reference(anArray);
        System.out.println("Now the array contains " + anArray[0]);

        int other = 12;
        System.out.print("Another primitive was " + other);
        other = pp.increase(other);
        System.out.println(" now it is " + other);
    }
}
