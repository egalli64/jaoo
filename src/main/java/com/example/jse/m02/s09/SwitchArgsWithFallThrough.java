package com.example.jse.m02.s09;

public class SwitchArgsWithFallThrough {
    public static void main(String[] args) {
        switch (args.length) {
        case 0:
            System.out.println("No argument passed");
            break;
        default:
            System.out.println("More than three arguments passed");
            // FALL THROUGH
        case 3:
            System.out.println("Third argument is: " + args[2]);
            // FALL THROUGH
        case 2:
            System.out.println("Second argument is: " + args[1]);
            // FALL THROUGH
        case 1:
            System.out.println("First argument is: " + args[0]);
            break;
        }

        System.out.println("-- done --");
    }
}
