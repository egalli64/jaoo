package m01.s08;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] anArray = new int[12];
        anArray[0] = 7;

        System.out.println(anArray[0] + ", " + anArray[11]);

        int aValue = anArray[5];
        System.out.println(aValue);

//        value = array[12]; // exception

        System.out.println("Done");
    }
}
