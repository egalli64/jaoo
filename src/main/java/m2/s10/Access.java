package m2.s10;

public class Access {
    private int a;
    protected short b;
    static double c;
    // public long d;

    static {
        c = 18;
    }

    public Access() {
        a = 42;
        b = 23;
    }

    public int h() {
        return a / 2;
    }
}
