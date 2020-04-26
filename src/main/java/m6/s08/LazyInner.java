package m6.s08;

public class LazyInner {
    private LazyInner() {
    }

    private static class Helper {
        private static final LazyInner INSTANCE = new LazyInner();
    }

    public static LazyInner getInstance() {
        return Helper.INSTANCE;
    }

    public int solution() {
        return 42;
    }
}
