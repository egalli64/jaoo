package m01.s06;

public class Widening {
    public static void main(String[] args) {
        byte aByte = 42;
        short aShort = aByte;
        int anInt = aShort;
        long aLong = anInt;
        float aFloat = aLong;
        double aDouble = aFloat;

        System.out.println(aDouble);

        char aChar = (char) aShort;
        int anotherInt = aChar;
        System.out.println(aChar + " " + anotherInt);

        char asterisk = '*';
        int asterAsInt = asterisk;
        System.out.println(asterisk + ", " + asterAsInt);

        long aBigLongValue = 1_000_000_000_000_000_000L;
        float aFloatApproximation = aBigLongValue;
        double aDoubleConversion = aBigLongValue;
        System.out.println(aBigLongValue + ", " + aFloatApproximation + ", " + aDoubleConversion);
        System.out.println(String.format("%.0f, %.0f", aFloatApproximation, aDoubleConversion));
    }
}
