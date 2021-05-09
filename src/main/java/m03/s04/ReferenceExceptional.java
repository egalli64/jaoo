package m03.s04;

import java.util.Objects;

public class ReferenceExceptional {
    public static void main(String[] args) {
        try {
            // Passing null as argument
            Double argument = null;
            double radix = mySqrt(argument);
            System.out.println(String.format("Square root of %f is %f", argument, radix));
        } catch (NullPointerException npe) {
            System.out.println("Can't calculate the square root: " + npe.getMessage());
        }

        try {
            // Passing bad as argument
            Double argument = -1.0;
            double radix = mySqrt(argument);
            System.out.println(String.format("Square root of %f is %f", argument, radix));
        } catch (NullPointerException | IllegalArgumentException ex) {
            System.out.println("Can't calculate the square root: " + ex.getMessage());
        }

        // If the coder does not catch the exception, the program ends!
        Double argument = -1.0;
        double radix = mySqrt(argument);
        System.out.println(String.format("Square root of %f is %f", argument, radix));
    }

    public static double mySqrt(Double value) {
        Objects.requireNonNull(value);

        if (value < 0 || Double.isNaN(value)) {
            throw new IllegalArgumentException(String.valueOf(value));
        }

        return Math.sqrt(value);
    }
}
