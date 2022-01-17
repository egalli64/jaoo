package com.example.jse.m02.s09;

public class SwitchArgs {
    public static void main(String[] args) {
        switch (args.length) {
        case 0:
            System.out.println("No argument passed in");
            break;
        case 1:
            System.out.println("The only argument passed is: " + args[0]);
            break;
        case 2:
            System.out.println("The second and last argument passed is: " + args[1]);
            break;
        default:
            System.out.println("The last argument passed is: " + args[args.length - 1]);
            break;
        }

        System.out.println("-- done --");
    }
}
