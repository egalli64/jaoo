package m01.s07;

public class Narrowing {
    public static void main(String[] args) {
        double aDouble = 42;
        float aFloat = (float) aDouble;
        long aLong = (long) aFloat;
        // [0000 0000][0000 0000][0000 0000][0010 1010]
        int anInt = (int) aLong;
        short aShort = (short) anInt;
        // [00101010]
        byte aByte = (byte) aShort;

        System.out.println(aByte);

        char aChar = (char) anInt;
        short anotherShort = (short) aChar;

        // notice the difference between print() and println()
        System.out.print(aChar);
        System.out.print(" <-> ");
        System.out.println(anotherShort);
    }
}