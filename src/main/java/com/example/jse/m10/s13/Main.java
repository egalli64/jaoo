/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s13;

import java.util.ArrayList;
import java.util.List;

/**
 * Example on generic classes
 * 
 * @see Animal an interface
 * @see Dog a class implementing Animal
 */
public class Main {
    /**
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(4);

        noGenericTypeCheck(li);
        noGenericDowncast();
        noGenericUpcast();
        noGenericArray();
    }

    /**
     * Cannot perform instanceof check against parameterized type, only against
     * unbounded one
     * 
     * @param obj
     */
    private static void noGenericTypeCheck(Object obj) {
        // Won't compile: Type Object cannot be safely cast to List<Integer>
//        if (obj instanceof List<Integer>) {
//            System.out.println("As expected");
//        }

        if (obj instanceof List) {
            List<?> li = (List<?>) obj;
            System.out.print("The passed object is a List (of what?)");
            System.out.println(" sized " + li.size());
        }
    }

    /**
     * Cast of a parametric type only to unbounded type
     */
    private static void noGenericDowncast() {
        List<Animal> la = new ArrayList<>();
        la.add(new Dog());

        // Won't compile: Cannot cast from List<Animal> to ArrayList<Dog>
//        ArrayList<Dog> ald = (ArrayList<Dog>) la;

        ArrayList<?> alo = (ArrayList<?>) la;
        System.out.println("MyArray contains " + alo.size() + " object(s)");
    }

    /**
     * Cast of a parametric type only to unbounded type
     */
    private static void noGenericUpcast() {
        List<Dog> ld = new ArrayList<>();
        ld.add(new Dog());

        // Won't compile: Cannot cast from List<Dog> to ArrayList<Animal>
//        ArrayList<Animal> ala = (ArrayList<Animal>) ld;

        ArrayList<?> alo = (ArrayList<?>) ld;
        System.out.println("MyArray contains " + alo.size() + " object(s)");
    }

    /**
     * Cannot create an array of generics
     */
    private static void noGenericArray() {
        // Won't compile: Cannot create a generic array of ArrayList<Dog>
//        List<Dog>[] ld = new ArrayList<Dog>[10];

        // If you really need it
        List<?>[] alo = new ArrayList<?>[10];
        System.out.println("Length of alo is " + alo.length);
        alo[0] = new ArrayList<Dog>();
        alo[1] = new ArrayList<Integer>();

        // Still, using an unbound generic is a pain
        @SuppressWarnings("unchecked")
        ArrayList<Dog> ald = (ArrayList<Dog>) alo[0];
        ald.add(new Dog());
        System.out.println("Size of ald is " + ald.size());
    }
}
