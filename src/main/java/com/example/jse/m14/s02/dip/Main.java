package com.example.jse.m14.s02.dip;

public class Main {
    public static void main(String[] args) {
        double x = 42.3;
        double y = 12.5;

        System.out.println("Plain calculator");

        Calculator adder = new CalculatorAdd();
        System.out.println("Adder: " + adder.calculate(x, y));

        Calculator multiplier = new CalculatorMult();
        System.out.println("Multiplier: " + multiplier.calculate(x, y));

        System.out.println("\nDIP calculator");

        DipCalculator dipAdder = new DipCalculator(new OperationAdd());
        System.out.println("DIP Adder: " + dipAdder.calculate(x, y));

        DipCalculator dipMultiplier = new DipCalculator(new OperationMult());
        System.out.println("DIP Multiplier: " + dipMultiplier.calculate(x, y));

        System.out.println("\nDIP functional calculator");

        FunCalculator funAdder = new FunCalculator(Double::sum);
        System.out.println("DIP Adder: " + funAdder.calculate(x, y));

        FunCalculator funMultiplier = new FunCalculator((a, b) -> a * b);
        System.out.println("DIP Multiplier: " + funMultiplier.calculate(x, y));
    }
}
