package m5.s09;

public class LazyDoubleCheck {
    private static volatile LazyDoubleCheck instance;

    private LazyDoubleCheck() {
    }

    public static LazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheck.class) {
                if(instance == null) {
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }

    public int solution() {
        return 42;
    }
}
