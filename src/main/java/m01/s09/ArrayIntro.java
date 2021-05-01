package m01.s09;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] anArray = new int[12];
        anArray[0] = 7;

        System.out.println(anArray[0]);
        System.out.println(anArray[11]);

        int value = anArray[5];
        System.out.println(value);

//        value = anArray[12]; // exception

        System.out.println("Done");
    }
}
