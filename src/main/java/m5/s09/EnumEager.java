package m5.s09;

public enum EnumEager {
    INSTANCE;

    public int solution() {
        return 42;
    }
}

class X2 {
    public static void main(String[] args) {
        EnumEager ee = EnumEager.INSTANCE;

        System.err.println(ee.solution());

        EnumEager.INSTANCE.solution();
    }
}
