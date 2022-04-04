package com.example.jse.m01.s07.bugs;

public class Overflow {
    public static void main(String[] args) {
        int bob = 1_000_000_001;
        int tom = 1_000_000_002;
        int kim = 1_000_000_003;
        int jon = 1_000_000_004;

        int wrong = bob + tom + kim + jon;
        System.out.printf("%d + %d + %d + %d = %d%n", bob, tom, kim, jon, wrong);

        long correct = (long) bob + tom + kim + jon;
        System.out.printf("%d + %d + %d + %d = %d%n", bob, tom, kim, jon, correct);
    }
}
