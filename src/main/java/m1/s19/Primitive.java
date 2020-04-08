package m1.s19;

public class Primitive {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);

        char c = 's';
        System.out.println(c);

        byte y = 42;
        System.out.println(y);

        short x = 12_000;
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        long z = 1_000_000_000_000_000L;
        System.out.println(z);

        float f = 3.12e20F;
        System.out.println(f);

        double d = 3.12e200;
        System.out.println(d);
        
        double nan = Double.NaN;
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        
        if(!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");
        }
    }
}
