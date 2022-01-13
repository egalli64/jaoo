package com.example.jse.m14.s02.dip;

import java.util.function.ToDoubleBiFunction;

public class FunCalculator {
    private ToDoubleBiFunction<Double, Double> operation;

    public FunCalculator(ToDoubleBiFunction<Double, Double> operation) {
        this.operation = operation;
    }

    public double calculate(double left, double right) {
        return operation.applyAsDouble(left, right);
    }
}
