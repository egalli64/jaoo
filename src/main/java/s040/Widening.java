package s040;

public class Widening {
    public static void main(String[] args) {
        byte b = 42;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(d);

        char c = (char) s;
        int i2 = c;
        System.out.println(c + " " + i2);
    }
}
