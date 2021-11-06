package com.example.jse.m07.s06;

public class Other {

    public static void main(String[] args) {
        Simple simple = new Simple();

        try {
            int value = args.length == 0 ? Integer.MIN_VALUE : Integer.parseInt(args[0]);
            System.out.println("Negate " + value);
            int x = simple.negate(value);
            System.out.println("My value negated is: " + x);
        } catch (Exception ex) {
            System.out.println("Bad input value");
        }
//        catch (NumberFormatException e) {
//            System.out.println("Pass me an integer!");
//        } catch(IllegalArgumentException iae) {
//            System.out.println("Bad input value");
//        }

        System.out.println("Bye");
    }
}
