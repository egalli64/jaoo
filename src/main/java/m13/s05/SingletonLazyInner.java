package m13.s05;

public class SingletonLazyInner {
    private int life;

    private SingletonLazyInner() {
        this.life = 42;
    }

    private static class Helper {
        private static final SingletonLazyInner instance = new SingletonLazyInner();
    }

    public static SingletonLazyInner getInstance() {
        return Helper.instance;
    }

    public int fight(int points) {
        life -= points;
        return life;
    }
}
