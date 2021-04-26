package m01.s08;

public class ArrayShortcut {
    public static void main(String[] args) {
        int[] data = { 1, 4, 13 };

        // change the last element of the array
//        data[data.length] = 21; // WRONG! exception!
        data[data.length - 1] = 21; // correct
        System.out.println(data[data.length - 1]);

        // the length of this array is 3
        System.out.println(data.length);
    }
}
