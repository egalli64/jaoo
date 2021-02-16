package m11.s04;

public class SingletonLazyDoubleCheck {
    private static volatile SingletonLazyDoubleCheck instance;

    private int life;

    private SingletonLazyDoubleCheck() {
        this.life = 42;
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }

    public int fight(int points) {
        life -= points;
        return life;
    }
}
