package s028;

public class Narrowing {
    public static void main(String[] args) {
        double d = 42;
        float f = (float)d;
        long l = (long)f;
        int i = (int)l;
        short s = (short)i;
        byte b = (byte)s;
        
        System.out.println(b);

        char c = (char) i;
        short s2 = (short)c;
        System.out.println(c + " " + s2);
    }
}
