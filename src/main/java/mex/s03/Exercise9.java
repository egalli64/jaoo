package mex.s03;

public class Exercise9 {
    /**
     * Prime number checker
     * 
     * @param value
     * @return true if positive > 1 and prime
     */
    public static boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }

        int limit = (int) Math.sqrt(value);
        for (int i = 2; i <= limit; i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
