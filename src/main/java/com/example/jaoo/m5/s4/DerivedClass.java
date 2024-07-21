/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m5.s4;

/**
 * A subclass with a super with final methods
 */
public class DerivedClass extends BaseClass {
    // Won't compile: Cannot override the final method from BaseClass
//    public final void f() {
//    }

    // Won't compile: Cannot override the final method from BaseClass
    // Actually, the message is not correct, static method can't be overridden
//    public static final void g() {
//    }
}
