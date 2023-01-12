/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s09;

/**
 * Control flow - Decision: switch (modern)
 */
public class SwitchArgsArrow {
    /**
     * Accordingly to the number of arguments, a different case in the switch is
     * executed.
     * 
     * @param args determine the switch execution
     * @see SwitchArgs there using the classic switch, here the modern one
     */
    public static void main(String[] args) {
        switch (args.length) {
        case 0 -> System.out.println("No argument passed in");
        case 1 -> System.out.println("The only argument passed is: " + args[0]);
        case 2 -> System.out.println("The second and last argument passed is: " + args[1]);
        default -> System.out.println("The last argument passed is: " + args[args.length - 1]);
        }

        System.out.println("-- done --");
    }
}
