package mex.s03;

public class Exercise2 {
    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return true if odd
     */
    public static boolean isOdd(int value) {
        if (value == 0) {
            throw new IllegalArgumentException("Zero is not even nor odd!");
        }
        return value % 2 == 1;
    }
}
