package m01.s08;

public class ArrayShortcut {
    public static void main(String[] args) {
        int[] data = { 1, 4, 13 };

        // data[data.length] = 21; // exception
        System.out.println(data[data.length - 1]);

        // the length of this array is 3
        System.out.println(data.length);
    }
}
