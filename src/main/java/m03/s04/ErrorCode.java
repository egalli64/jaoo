package m03.s04;

public class ErrorCode {
    public static void main(String[] args) {
        // Bad argument
        double argument = -1.0;
        double radix = Math.sqrt(argument);

        // Here the coder does not check the return value before using it!
        System.out.println(String.format("Square root of %f is %f", argument, radix));

        // Check the return value before using it!
        if (Double.isNaN(radix)) {
            System.out.println("Can't calculate the square root of " + argument);
        } else {
            System.out.println(String.format("Square root of %f is %f", argument, radix));
        }
    }
}
