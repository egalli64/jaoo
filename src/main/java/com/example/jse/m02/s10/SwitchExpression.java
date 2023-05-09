/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s10;

/**
 * Control flow - Decision: switch expression
 */
public class SwitchExpression {
    /**
     * Show use of expression switch and yield
     * 
     * @param args its length is used to set a size by expression switch
     */
    public static void main(String[] args) {
        // initialize with expression switch
        Size size = switch (args.length) {
        case 0, 1 -> Size.S;
        case 2 -> Size.M;
        case 3, 4 -> Size.L;
        default -> Size.XL;
        };

        // yield with classic case
        int itSize = switch (size) {
        case S:
            System.out.print("Small");
            yield 42;
        case M:
            System.out.print("Medium");
            yield 44;
        case L:
            System.out.print("Large");
            yield 46;
        case XL:
            System.out.print("Extra Large");
            yield 48;
        };

        System.out.printf(" is %d (IT)%n", itSize);

        // yield with arrow case
        int deSize = switch (size) {
        case S -> {
            System.out.print("Small");
            yield 34;
        }
        case M -> {
            System.out.print("Medium");
            yield 38;
        }
        case L -> {
            System.out.print("Large");
            yield 42;
        }
        case XL -> {
            System.out.print("Extra Large");
            yield 46;
        }
        };
        System.out.printf(" is %d (DE)%n", deSize);
    }
}
