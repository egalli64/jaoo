package com.example.jse.m02.s12;

public class While {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("The argument " + i + " is " + args[i]);
        }

        int i = 0;
        while (i < args.length) {
            System.out.println("The argument " + i + " is " + args[i]);
            i++;
        }

        System.out.println("done, looped " + i + " times");
    }
}