package com.example.jse.m13.s04;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalExample {
    public static void main(String[] args) {
        // void -> void
        Runnable execute = () -> System.out.println("Hello Runnable");
        System.out.print("Run a runnable: ");
        execute.run();

        // T -> boolean
        Predicate<String> isOddSized = s -> s.length() % 2 == 1;
        String pString = "Hello Predicate";
        if (isOddSized.test(pString)) {
            System.out.printf("The test on the Predicate for '%s' succeed%n", pString);
        }

        // T -> void
        Consumer<String> consume = System.out::println;
        consume.accept("Accepting a Consumer");

        // void -> T
        Supplier<String> greeter = () -> "Hi";
        System.out.println("Get on a Supplier: " + greeter.get());

        // T, R -> T
        Function<String, Integer> size = String::length;
        String fString = "Hello Function";
        System.out.printf("Applying the size Function on '%s': %d%n", fString, size.apply(fString));

        // T, U -> R
        BiFunction<String, Integer, String> multi = String::repeat;
        String bString = "Hello BiFunction!";
        int count = 2;
        System.out.printf("Applying the multi BiFunction on '%s' %d times: '%s'%n",
                bString, count, multi.apply(bString, 2));

        // T -> T
        UnaryOperator<Boolean> not = x -> !x;
        System.out.println("Applying UnaryOperator NOT on true: " + not.apply(true));

        // T, T -> T
        BinaryOperator<Boolean> and = Boolean::logicalAnd;
        System.out.println("Applying BinaryOperator AND on true and false: " + and.apply(true, false));
    }
}
