package com.example.jse.m05.s07;

import static java.lang.Math.abs;
import static java.lang.Math.cos;

public class ScopeExample {
    private static int aStaticMember = 5;
    private long anInstanceMember;

    public ScopeExample() {
        this.anInstanceMember = 5;
    }

    public void f() {
        int aLocalVariable = 7;
        if (aStaticMember == 2) {
            // Compile error: Duplicate local variable aLocalVariable
            // float aLocalVariable = 0.0F;
            short inner = 12;
            aStaticMember = 1 + inner;
            anInstanceMember = 3 + aLocalVariable;
        }

        // Compile error: inner cannot be resolved to a variable
        // System.out.println(inner);

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // Compile error: i cannot be resolved to a variable
        // System.out.println(i);
    }

    public void g() {
        System.out.println(anInstanceMember);
    }

    public static void k() {
        System.out.println(aStaticMember);
    }

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
