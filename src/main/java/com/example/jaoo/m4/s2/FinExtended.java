/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s2;

// Cannot override the final method from Sample
/**
 * A subclass
 */
public class FinExtended extends Final {

    // Won't compile: Cannot override the final method from Final
//    public final void f() {
//    }

    // Won't compile: Cannot override the final method from Final
    // Actually, the message is not correct, static method can't be overridden
//    public static final void g() {
//    }
}
