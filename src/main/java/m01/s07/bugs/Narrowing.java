package m01.s07.bugs;

public class Narrowing {
    public static void main(String[] args) {
        // [0000 0000][0000 1111][0100 0010][0100 0000]
        int value = 1_000_000;
        System.out.println(value);

        byte x = (byte) value;
        System.out.println(x);
    }
}
