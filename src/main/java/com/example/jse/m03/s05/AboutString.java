/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s05;

/**
 * A first look to methods in the class String
 */
public class AboutString {
    /**
     * Creating and using a few Strings
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";

        // here "+" means string concatenation
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        // "hello".charAt(1) is 'e'
        System.out.println("char at position 1 in s: " + s.charAt(1));

        // s is before t, so s.compareTo(t) is negative
        System.out.println("s < t: " + s.compareTo(t));
        // t is after s, so t.compareTo(s) is positive
        System.out.println("t > s: " + t.compareTo(s));

        // same as s + t
        System.out.println("concat s and t: " + s.concat(t));

        // "world".contains("or") is true
        System.out.println("t contains u? " + t.contains(u));

        // "world".substring(1, 3) is "or"
        String u2 = t.substring(1, 3);
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));

        // String::equals() compares the string contents - so it is true
        System.out.println("u equals u2? " + u.equals(u2));
        // == compares the references - so it false
        System.out.println("u == u2? " + (u == u2));

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());
        // String x = "";
        // x.isEmpty();

        System.out.println("s length: " + s.length());

        // replace() creates a new String
        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        // String::split() expect a string as argument, the delimiter
//        String[] splits = "one for me, one for you".split(" ");

        // commonly used to work with csv data
        String csv = "alpha,beta,gamma,delta";
        String[] splits = csv.split(",");
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }

        // String::join() is the other way round of split(), put together a new string
        String joined = String.join(" ", splits);
//        String joined = String.join(",", "a", "b", "c");
        System.out.println("Joining back [" + joined + "]");

        String myS = s.toUpperCase();
        System.out.println("upper: " + myS);
        System.out.println("lower: " + "Shut UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");

        int a = 42;
        String b = "hello";
        double c = 10 / 3.0;
        System.out.println("An integer " + a + ", a string " + b + ", and a floating point " + c);
        System.out.println(String.format("An integer %d, a string %s, and a floating point %.3f", a, b, c));
        System.out.printf("An integer %d, a string %s, and a floating point %.3f%n", a, b, c);

        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
    }
}
