/*
 * Introduction to String, StringBuilder, text block
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s11;

public class StringIntro {
    public static void main(String[] args) {
        // a single character
        char c = 'x';
        System.out.println(c);

        // Create a String explicitly, !!! _not_ a good idea !!!
        String s = new String("Hello");
        System.out.println(s);

        // Implicit call to "new" for a String
        String t = "Hello";
        System.out.println(t);

        // Create a mutable string, and then change it
        StringBuilder sb = new StringBuilder("Hello");
        sb.deleteCharAt(4);
        sb.append(", Tom!");

        // Create a String from a StringBuilder
        String u = sb.toString();
        System.out.println(u);
        System.out.println("---");

        // Text block
        String modern = """
                Non impedir lo suo fatale andare:
                vuolsi così colà dove si puote
                ciò che si vuole, e più non dimandare""";

        // Classic string with newlines in it
        String classic = "Non impedir lo suo fatale andare:\n" + //
                "vuolsi così colà dove si puote\n" + //
                "ciò che si vuole, e più non dimandare";

        System.out.println(modern);
        System.out.println("---");
        System.out.println(classic);
    }
}
