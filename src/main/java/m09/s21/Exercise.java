package m09.s21;

import java.util.List;

public class Exercise {
    /**
     * Extract non-duplicated values in input and return them in a list
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     * 
     *         example: in {2, 3, 4, 4, 5, 5, 6, 7} -> out {2, 3, 6, 7}
     */
    public List<Integer> singles(int[] data) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void main(String[] args) {
        List<Integer> result = new Exercise().singles(new int[] { 2, 3, 4, 4, 5, 5, 6, 7 });
        System.out.println(result);
    }

}
