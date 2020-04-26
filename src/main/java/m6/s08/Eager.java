package m6.s08;

public class Eager {
    private static final Eager INSTANCE = new Eager();

    private Eager() {
    }

    public static Eager getInstance() {
        return INSTANCE;
    }

    public int solution() {
        return 42;
    }
}
