/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s05;

/**
 * Variable, constant, data type
 */
public class Variable {
    /**
     * Define a few variables and constants, primitive and reference, and print them
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // variables
        int aPrimitiveVariable = 42;
        String aReferenceVariable = "42";

        System.out.println(aReferenceVariable);
        System.out.println(aPrimitiveVariable);

        // Dangerous! Beware of null!
        String noReference = null;
        System.out.println(noReference);

        // Java 10 inferred type
        var anotherPrimitiveVariable = 12;
        var anotherReferenceVariable = "Tom";

        System.out.println(anotherReferenceVariable);
        System.out.println(anotherPrimitiveVariable);

        // a constant
        final var anotherConstant = 21;
        System.out.println(A_CONSTANT + anotherConstant);

        // constants (i.e. final variables) can't change!
//        A_CONSTANT = 42;
//        anotherConstant = 18;
    }

    /** class constant */
    static final int A_CONSTANT = 12;
}
