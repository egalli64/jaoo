package m3.s04;

public class Access {
    private int a;
    protected short b;
    static double c;
    // public long d;

    static {
        c = 18;
    }

    public Access() {
        this.a = 42;
        this.b = 23;
    }

    public int h() {
        return a / 2;
    }
}
