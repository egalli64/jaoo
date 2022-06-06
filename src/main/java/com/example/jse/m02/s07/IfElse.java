package com.example.jse.m02.s07;

public class IfElse {
    public static void main(String[] args) {
        // condition is true when no argument is passed
        if (args.length == 0) {
            // executed only if condition is true
            System.out.println("You didn't pass me any argument!");
        } else {
            // executed only if condition is false
            System.out.println("You passed me at least an argument");
        }

        // always executed
        System.out.println("Bye");
    }
}
