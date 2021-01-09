package m01.s06;

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
        System.out.println(aChar + " " + anotherShort);

        // beware of narrowing
        // [0000 0000][0000 1111][0100 0010][0100 0000] -> 1_000_000
        // [0100 0000] -> 64
        int aMillion = 1_000_000;
        byte maxInByte = (byte) aMillion;
        System.out.println("A million (int) casted to a byte keeps just the least significant byte " + maxInByte);

        // floating point -> integer
        double aLargeValue = 3_000_000_000.0;
        // [0111 1111][1111 1111][1111 1111][1111 1111]
        int maxInInt = (int) aLargeValue;
        System.out.println("Three billions (double) casted to int gives int max value  " + maxInInt);
    }
}