package com.example.jse.m02.s12;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            System.out.println("The argument " + i + " is " + args[i]);

            // same as above, more verbosely, see also StringBuilder
            String s = "The argument ";
            s = s + i;
            s = s + " is ";
            s = s + args[i];
            System.out.println(s);

            i += 1;

            // other ways to increase a number (no side effect here!)
            // i++;
            // ++i;
            // i = i + 1;
        }

        System.out.println("done!");
    }
}