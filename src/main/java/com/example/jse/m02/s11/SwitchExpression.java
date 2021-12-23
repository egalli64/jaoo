package com.example.jse.m02.s11;

public class SwitchExpression {
    public static void main(String[] args) {
        // initialize with expression switch
        var size = switch (args.length) {
            case 0, 1 -> Size.S;
            case 2 -> Size.M;
            case 3, 4 -> Size.L;
            default -> Size.XL;
        };

        // yield with classic case
        var itSize = switch (size) {
            case S:
                System.out.println("Small size");
                yield 42;
            case M:
                System.out.println("Medium size");
                yield 44;
            case L:
                System.out.println("Large size");
                yield 46;
            case XL:
                System.out.println("Extra Large size");
                yield 48;
        };

        System.out.printf("Size is %d", itSize);

        // yield with arrow case
        System.out.println("Size is " + switch (size) {
            case S -> {
                System.out.print("(small) ");
                yield 42;
            }
            case M -> {
                System.out.println("(medium) ");
                yield 44;
            }
            case L -> {
                System.out.println("(large) ");
                yield 46;
            }
            case XL -> {
                System.out.println("(extra large) ");
                yield 48;
            }
        });
    }

    private enum Size {S, M, L, XL}
}
