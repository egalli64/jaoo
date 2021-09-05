package m13.s05;

public class SingletonLazy {
    private static SingletonLazy instance = null;

    private int life;

    private SingletonLazy() {
        this.life = 42;
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public int fight(int points) {
        life -= points;
        return life;
    }
}
