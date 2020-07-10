package m5.s09;

public class Lazy {
    private static Lazy instance = null;

    private Lazy() {
    }

    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }

    public int solution() {
        return 42;
    }
}
