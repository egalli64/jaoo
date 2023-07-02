/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s7;

/**
 * Override and Overload
 */
public class Main {
    public static void main(String[] args) {
        Dog bob = new Dog("Bob", 2, 4.0);
        System.out.println("Bob: " + bob);

        // overloading on constructor could be confusing
        Dog tom = new Dog("Tom", 2);
        System.out.println("Tom: " + tom);

        Dog tom2 = tom.clone();
        // calling the standard Dog toString() override
        System.out.println("Tom clone: " + tom2.toString());
        // calling a specific Dog toString() overload
        System.out.println(tom2.toString(false));

        TabbyCat tim = new TabbyCat();
        TabbyCat timmy = tim.createSon();
        System.out.println(timmy);
    }
}
