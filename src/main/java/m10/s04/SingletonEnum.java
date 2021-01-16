package m10.s04;

public enum SingletonEnum {
    INSTANCE;

    private int life = 42;

    public int fight(int points) {
        life -= points;
        return life;
    }
}
