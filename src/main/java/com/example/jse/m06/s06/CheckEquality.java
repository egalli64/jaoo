package com.example.jse.m06.s06;

public class CheckEquality {

    public static void main(String[] args) {
        reflexivity();
        symmetry();
        transitivity();
        consistency();
        nullBehavior();
    }

    private static void reflexivity() {
        Object o = new Object();
        if (o.equals(o)) {
            System.out.println("Reflexivity: x equals x");
        } else {
            System.out.println("This must not happen");
        }
    }

    private static void symmetry() {
        Object o = new Object();
        Object[] others = { o, new Object() };
        for (Object other : others) {
            if (o.equals(other)) {
                if (other.equals(o)) {
                    System.out.println("Symmetry: x equals y -> y equals x");
                } else {
                    System.out.println("This must not happen");
                }
            } else {
                if (other.equals(o)) {
                    System.out.println("This must not happen");
                } else {
                    System.out.println("Symmetry: x not equals y -> y not equals x");
                }
            }
        }
    }

    private static void transitivity() {
        Object o = new Object();
        Object[] obj2s = { o, new Object() };
        Object[] obj3s = { new Object(), o };

        for (Object o2 : obj2s) {
            for (Object o3 : obj3s) {
                if (o.equals(o2) && o.equals(o3)) {
                    System.out.print("Transitivity: x equals y and x equals z: ");
                    if (o.equals(o3)) {
                        System.out.println("x must equals z");
                    } else {
                        System.out.println("this must not happen");
                    }
                }
            }
        }
    }

    private static void consistency() {
        Object o = new Object();
        Object[] others = { o, new Object() };
        for (Object other : others) {
            if (o.equals(other)) {
                if (o.equals(other)) {
                    System.out.println("Consistency: if x equals y once, x always equals y");
                } else {
                    System.out.println("This must not happen");
                }
            } else {
                if (o.equals(other)) {
                    System.out.println("This must not happen");
                } else {
                    System.out.println("Consistency: if x not equals y once, x never equals y");
                }
            }
        }
    }

    private static void nullBehavior() {
        Object o = new Object();
        if (o.equals(null)) {
            System.out.println("This must not happen");
        } else {
            System.out.println("x equals null must always return false");
        }
    }
}
