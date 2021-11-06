package com.example.jse.m13.s04;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntConsumer;

public class FunctionalPrimitiveExample {
    public static void main(String[] args) {
        // double -> boolean
        DoublePredicate isPositive = x -> x > 0;
        double aValue = Math.PI;
        if (isPositive.test(aValue)) {
            System.out.println("Test passed on the DoublePredicate isPositive for " + aValue);
        }

        // int -> void
        IntConsumer consume = i -> System.out.printf("Consuming %d on a IntConsumer%n", i);
        consume.accept(42);

        // double -> int
        DoubleToIntFunction intFloor = value -> (int) Math.floor(value);
        System.out.println("The (int) floor of the passed number is " + intFloor.applyAsInt(Math.E));
    }
}
