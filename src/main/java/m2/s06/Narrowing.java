package m2.s06;

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
        
        byte neg = -1;
        int neg2 = neg;
        
        System.out.println(neg + ", " + neg2);
    }
}

/*

int x = 65; ->  [00000000][00000000][00000000][01000001]
byte y = (byte)x; ->  [01000001]

 */