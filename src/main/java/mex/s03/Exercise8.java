package mex.s03;

public class Exercise8 {
    /**
     * Sort the input parameters
     * 
     * @param a
     * @param b
     * @param c
     * @return the input values, sorted, in an array
     */
    public static int[] sort(int a, int b, int c) {
        int[] result = new int[3];
        
        result[0] = Math.min(Math.min(a, b), c);
        result[2] = Math.max(Math.max(a, b), c);
        result[1] = a + b + c - result[0] - result[2];

        return result;
    }
}
