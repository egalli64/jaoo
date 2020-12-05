package m01.s08;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] a2DArray = new int[4][5];

        int aValue = a2DArray[2][3];

        System.out.println(a2DArray[2][3] + ", " + aValue);
        System.out.println(a2DArray[3][4]);

        System.out.println(a2DArray);
        System.out.println(Arrays.toString(a2DArray));
        System.out.println(Arrays.deepToString(a2DArray));
    }
}
