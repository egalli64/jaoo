package com.example.jse.m02.s12;

public class Forever {
    public static void main(String[] args) {
        boolean hasArguments = args.length != 0;

        // same as: while (true)
        for (;;) {
            System.out.println("Pass an argument to loop forever");

            if (!hasArguments) {
                break;
            }
        }

        System.out.println("bye");
    }
}
