package m03.s08;

import java.util.Arrays;

public class Finder {
    public static void main(String[] args) {
        int[] data = { 42, 12, 1, 21, 99, 5 };
        System.out.println(Arrays.toString(data));

        Finder finder = new Finder();

        int value = 21;
        int index = finder.getPosition(data, value);
        System.out.println(value + " is in position " + index);

        int indexSmallest = finder.getSmallestPosition(data);
        System.out.println("The smallest element is in position " + indexSmallest + ": " + data[indexSmallest]);
    }

    /**
     * Get the position of an element in the passed array - it should not be null!
     * 
     * @param data   an array
     * @param target the element of which we want the position
     * @return its position, or -1 if not found
     */
    public int getPosition(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }

        // not found
        return -1;
    }

    /**
     * Get the position of the smallest element in the array
     * <p>
     * The array should not be empty!
     * 
     * @param data an array
     * @return the position of the (first) smallest element
     */
    public int getSmallestPosition(int[] data) {
        int position = 0;

        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[position]) {
                position = i;
            }
        }

        return position;
    }
}
