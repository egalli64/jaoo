package com.example.jse.m02.s04;

public class Concatenation {
    public static void main(String[] args) {
        System.out.print("5 + 7: ");
        // adding integers 5 and 7 leads to 12
        System.out.println(5 + 7);

        System.out.print("5 + \"7\": ");
        // convert 5 to string and concatenate it to "7" leads to "57"
        System.out.println(5 + "7");

        System.out.print("5 + 7 + \"4\": ");
        // 5 + 7 is 12, concatenate to "4" to get "124"
        System.out.println(5 + 7 + "4"); // -> 124

        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + 42);
        System.out.println(true + " or " + false);

        System.out.print("Repeat \"Vogons\" three times: ");
        // from Java 11 we can "multiply" a string
        System.out.println("Vogons".repeat(3));

        String s = "Hello";
        // both t and s refer to the same object
        String t = s;

        // reference to a different object created by concatenation
        s += ", Tom";

        System.out.print("+= on a string generate a new object: ");
        System.out.println(s);

        System.out.print("We could still have access to the original string: ");
        System.out.println(t);

        // a string of 20 *, in a compact way
        System.out.println("*".repeat(20));

        // a string of 20 *, in a verbose way
        String star = "*";
        String star20 = star.repeat(20);
        System.out.println(star20);
    }
}
