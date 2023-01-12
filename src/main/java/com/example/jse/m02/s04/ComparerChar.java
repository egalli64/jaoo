/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s04;

/**
 * Comparison operators on char
 */
public class ComparerChar {
    /**
     * Some details on comparing characters
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // letters are coded in the expected order
        System.out.print("Yes, 'c' < 'k': ");
        System.out.println('c' < 'k');

        // all uppercase letters are before all lowercase letters
        System.out.print("Yse, 'Z' < 'a': ");
        System.out.println('Z' < 'a');

        // ciphers are coded in the expected order
        System.out.print("Yes, '0' < '9': ");
        System.out.println('0' < '9');

        // beware of characters that look similar!
        System.out.print("No, 'ì' == 'i': ");
        System.out.println('ì' == 'i');
    }
}
