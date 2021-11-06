package com.example.jse.m13.s05;

import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> doubler = x -> x * 2;
        Function<Integer, Integer> squarer = x -> x * x;

        Function<Integer, Integer> doubledAndSquarer = doubler.andThen(squarer);
        System.out.println("3 doubled and then squared: " + doubledAndSquarer.apply(3));

        Function<Integer, Integer> doubledComposedSquare = doubler.compose(squarer);
        System.out.println("3 composed by doubler and then squarer: " + doubledComposedSquare.apply(3));
    }
}
