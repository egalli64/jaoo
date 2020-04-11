package m2.s08;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] array2d = new int[4][5];

        int value = array2d[2][3];

        System.out.println(array2d[2][3] + ", " + value);
        System.out.println(array2d[3][4]);
        
        System.out.println(Arrays.toString(array2d));
        System.out.println(Arrays.deepToString(array2d));
    }
}
