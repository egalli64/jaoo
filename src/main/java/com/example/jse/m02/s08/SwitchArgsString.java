package com.example.jse.m02.s08;

public class SwitchArgsString {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, pass me a string!");
            return;
        }

        switch (args[0]) {
        case "ciao":
            System.out.println("Hello to you!");
            break;
        case "Tom":
            System.out.println("Welcome back, Tom!");
            break;
        default:
            System.out.println("I don't understand");
            break;
        }

        System.out.println("Bye");
    }
}
