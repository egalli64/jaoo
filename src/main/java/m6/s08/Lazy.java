package m6.s08;

public class Lazy {
    private static Lazy instance;

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
