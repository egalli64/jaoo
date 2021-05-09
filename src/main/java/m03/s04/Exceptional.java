package m03.s04;

public class Exceptional {
    public static void main(String[] args) {
        // Bad argument
        double argument = -1.0;

        try {
            double radix = mySqrt(argument);
            System.out.println("Square root is " + radix);
        } catch (IllegalArgumentException iae) {
            System.out.println("Can't calculate the square root of " + argument);
        }

        // If the coder does not catch the exception, the program ends!
        double radix = mySqrt(argument);
        System.out.println("Square root is " + radix);
    }

    public static double mySqrt(double value) {
        if (value < 0 || Double.isNaN(value)) {
            throw new IllegalArgumentException("Bad input: " + value);
        }

        return Math.sqrt(value);
    }
}
