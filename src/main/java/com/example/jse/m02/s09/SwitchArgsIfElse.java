package com.example.jse.m02.s09;

public class SwitchArgsIfElse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No argument passed in");
        } else if (args.length == 1) {
            System.out.println("The only argument passed is: " + args[0]);
        } else if (args.length == 2) {
            System.out.println("The second and last argument passed is: " + args[1]);
        } else {
            System.out.println("The last argument passed is: " + args[args.length - 1]);
        }

        System.out.println("-- done --");
    }
}
