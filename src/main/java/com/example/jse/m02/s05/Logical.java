/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s05;

/**
 * Logical operators
 */
public class Logical {
    /**
     * Short circuit logical operators
     * <li>&& AND
     * <li>|| OR
     * <p>
     * The unary NOT logical operator: !
     * <p>
     * Other logical operators
     * <li>& AND
     * <li>| OR
     * <li>^ XOR
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        boolean alpha = true;
        boolean beta = false;
        System.out.println("alpha is " + alpha);
        System.out.println("beta is " + beta);

        boolean result = beta && alpha; // false
        System.out.println("beta && alpha? " + result);

        result = alpha || beta; // true
        System.out.println("alpha || beta? " + result);

        result = !alpha; // false
        System.out.println("!alpha? " + result);

        result = beta & alpha; // false
        System.out.println("beta & alpha? " + result);

        result = alpha | beta; // true
        System.out.println("alpha | beta? " + result);

        result = alpha ^ beta;
        System.out.println("alpha ^ beta? " + result);

        result = alpha ^ alpha;
        System.out.println("alpha ^ alpha? " + result);

        System.out.println("Shortcut logical operator at work");
        result = f() || g();
        System.out.println("f() || g()? " + result);

        System.out.println("Avoid using non-shortcut logical operator (when not strictly necessary)");
        result = f() | g();
        System.out.println("f() | g()? " + result);
    }

    static boolean f() {
        System.out.println("evaluating f()");
        return true;
    }

    static boolean g() {
        System.out.println("evaluating g()");
        return false;
    }
}
