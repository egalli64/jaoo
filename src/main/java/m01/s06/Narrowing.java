package m01.s06;

public class Narrowing {
    public static void main(String[] args) {
        double aDouble = 42;
        float aFloat = (float) aDouble;
        long aLong = (long) aFloat;
        // [00000000][00000000][00000000][00101010]
        int anInt = (int) aLong;
        short aShort = (short) anInt;
        // [00101010]
        byte aByte = (byte) aShort;

        System.out.println(aByte);

        char aChar = (char) anInt;
        short anotherShort = (short) aChar;
        System.out.println(aChar + " " + anotherShort);

        // [11111111] -> -1
        byte minusOne8Bit = -1;
        // [11111111][11111111][11111111][11111111] -> -1
        int minusOne32Bit = minusOne8Bit;

        // [00000000][00000000][00000000][11111111] -> 255
        System.out.println(minusOne8Bit + ", " + minusOne32Bit);

        // beware of narrowing
        // [00000000][00001111][01000010][01000000]
        int aMillion = 1_000_000;
        // [1000000] -> 64
        byte maxInByte = (byte) aMillion;
        System.out.println("A million (int) casted to a byte gives byte max value " + maxInByte);

        // floating point -> integer
        double aLargeValue = 3_000_000_000.0;
        // [01111111][11111111][11111111][11111111]
        int maxInInt = (int) aLargeValue;
        System.out.println("Three billions (double) casted to int gives int max value  " + maxInInt);
    }
}