package com.example.jse.m10x.s04.exercise;

/**
 * TODO:
 *
 * Implement an int list, MyIntList, as a list of Node
 * 
 * minimal set of methods: add(), remove() and toString()
 * 
 * let it throw MyIntListException (checked) in case of errors
 */
public class Main {
    public static void main(String[] args) {
        MyIntList mil = new MyIntList();
        System.out.println("[] -> " + mil.toString());

        mil.add(42);
        System.out.println("[42] -> " + mil.toString());

        mil.add(2);
        System.out.println("[42, 2] -> " + mil.toString());

        mil.add(23);
        System.out.println("[42, 2, 23] -> " + mil.toString());

        try {
            int value = mil.remove();
            System.out.println("42 -> " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("[2, 23] -> " + mil.toString());

        try {
            int value = mil.remove();
            System.out.println("2 -> " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("[23] -> " + mil.toString());

        try {
            int value = mil.remove();
            System.out.println("23 -> " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("[] -> " + mil.toString());

        try {
            mil.remove();
            System.out.println("You are not expected to see this");
        } catch (Exception e) {
            System.out.println("as expected: " + e);
        }
    }
}