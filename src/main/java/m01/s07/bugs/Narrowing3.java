package m01.s07.bugs;

public class Narrowing3 {
    public static void main(String[] args) {
        // floating point -> integer
        double aLargeValue = 3_000_000_000.0;

        // [0111 1111][1111 1111][1111 1111][1111 1111]
        int maxInInt = (int) aLargeValue;
        System.out.println("Three billions (double) casted to int gives int max value");
        System.out.println(maxInInt);
    }
}
