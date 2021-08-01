package m03.s08;

import java.util.Arrays;

public class Swapper {
    public static void main(String[] args) {
        basicSwap();

        int[] data = { 42, 12, 18, 21, 99, 5 };
        System.out.println(Arrays.toString(data));

        Swapper swapper = new Swapper();
        swapper.swap(data, 1, 3);
        System.out.println(Arrays.toString(data));
    }

    /**
     * Swap two elements in the passed array
     * <p>
     * Array should not be null, indices should be in bound!
     * 
     * @param data the array
     * @param i    a position
     * @param j    another position
     */
    public void swap(int[] data, int i, int j) {
        int buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }

    public static void basicSwap() {
        int a = 42;
        int b = 51;

        System.out.println(a + ", " + b);

        // swap!
        int buffer = a;
        a = b;
        b = buffer;

        System.out.println(a + ", " + b);
    }
}
