package m01.s08;

public class ArrayShortcut {
    public static void main(String[] args) {
        int[] anArray = { 1, 4, 13 };

        // array[array.length] = 21; // exception
        System.out.println(anArray[anArray.length - 1]);

        // the length of this array is 3
        System.out.println(anArray.length);
    }
}
