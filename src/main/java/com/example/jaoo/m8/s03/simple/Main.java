/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s03.simple;

/**
 * Smoke test for MyIntArray. See JUnit test for more details
 */
public class Main {
    /**
     * Create a MyIntArray and do some basic use of it
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        MyIntArray mia = new MyIntArray(1);

        System.out.println(mia);

        for (int i = 0; i < 10; i++) {
            mia.add(i * 2);
            System.out.println(mia);
        }
        System.out.println();

        for (int i = 0; i < mia.size(); i++) {
            System.out.println(i + ": " + mia.get(i) + " ");
        }
        System.out.println();

        int removed = mia.remove(4);
        System.out.println("Removed " + removed);
        System.out.println("Now the array is " + mia);

        try {
            mia.remove(42);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage() + ": can't remove");
            ex.printStackTrace();
        }

        System.out.println("Done");
    }
}
