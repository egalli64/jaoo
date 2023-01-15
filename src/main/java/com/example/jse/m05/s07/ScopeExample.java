/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m05.s07;

import static java.lang.Math.abs;
import static java.lang.Math.cos;

/**
 * Show how variables live differently in different scopes
 */
public class ScopeExample {
    /** relative to the class */
    private static int aStaticMember = 5;
    /** each object has its own copy */
    private long anInstanceMember;

    /**
     * Constructor, initialize the member variable(s)
     */
    public ScopeExample() {
        this.anInstanceMember = 5;
    }

    /**
     * An instance method
     */
    public void f() {
        // allocates on the stack here, removed at the end of the method
        int aLocalVariable = 7;
        if (aStaticMember == 2) {
            // Compile error: Duplicate local variable aLocalVariable
            // float aLocalVariable = 0.0F;

            // allocates on the stack here, removed at the end of if-block
            short inner = 12;
            aStaticMember = 1 + inner;
            anInstanceMember = 3 + aLocalVariable;
        }

        // Compile error: inner cannot be resolved to a variable
        // System.out.println(inner);

        // a control for-loop variable lives in the for-loop block
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // Compile error: i cannot be resolved to a variable
        // System.out.println(i);
    }

    /**
     * Any instance method could access instance fields
     */
    public void g() {
        System.out.println(anInstanceMember);
    }

    /**
     * A static method could access only class fields
     */
    public static void k() {
        System.out.println(aStaticMember);
    }

    /**
     * Just to see the code running
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        double local = 5.0;
        System.out.println(local);
        ScopeExample.aStaticMember = 12;

        ScopeExample.k();

        ScopeExample scope = new ScopeExample();
        scope.f();
        scope.g();

        // access to static method of other class, statically imported
        abs(aStaticMember);
        cos(12);
    }
}
