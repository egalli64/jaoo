package com.example.jse.m02.s05;

public class ComparerChar {
    public static void main(String[] args) {
        // letters are coded in the expected order
        System.out.print("'c' < 'k'? ");
        System.out.println('c' < 'k');

        // all uppercase letters are before all lowercase letters
        System.out.print("'Z' < 'a'? ");
        System.out.println('Z' < 'a');

        // ciphers are coded in the expected order
        System.out.print("'0' < '9'? ");
        System.out.println('0' < '9');

        // beware of characters that look similar!
        System.out.print("'ì' == 'i'? ");
        System.out.println('ì' == 'i');
    }
}
