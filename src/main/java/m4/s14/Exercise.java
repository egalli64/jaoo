package m4.s14;

import java.util.List;

public class Exercise {
    /**
     * Extract from input the even values and return them in a List
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     *         example: in {2, 3, 4, 5} -> out {2, 4}
     */
    public List<Integer> evens(int[] data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int[] evensRaw(int[] data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Extract non-duplicated values in input and return them in a list
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     * 
     *         example: in {2, 3, 4, 4, 5, 6} -> out {2, 3}
     * 
     */
    public List<Integer> singles(int[] data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * As above, but with a linear time algorithm
     * 
     * @param data
     * @return
     */
    public List<Integer> singlesLinear(int[] data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void main(String[] args) {
        Exercise ex = new Exercise();
        System.out.println(ex.singlesLinear(new int[] { 2, 3, 4, 4, 5, 6 }));
    }
}
