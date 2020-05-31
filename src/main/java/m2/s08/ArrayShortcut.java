package m2.s08;

public class ArrayShortcut {
    public static void main(String[] args) {
        int[] array = { 1, 4, 13 };

        // array[array.length] = 21; // exception
        System.out.println(array[array.length - 1]);

        System.out.println(array.length); // 3
    }
}
