package m3.s05;

public class Access {
    private int a;
    static double c;

    static private double f() {
        return c;
    }

    void g() {
        f();
    }

    public int h() {
        return a / 2;
    }
}
