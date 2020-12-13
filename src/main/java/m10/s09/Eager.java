package m10.s09;

public class Eager {
    private static final Eager INSTANCE = new Eager();

    // when it is not so easy: static initializer
//    static {
//    	// ...
//    	
//    	INSTANCE = new Eager();
//    }

    private int life;

    private Eager() {
        this.life = 42;
    }

    public static Eager getInstance() {
        return INSTANCE;
    }

    public int fight(int points) {
        life -= points;
        return life;
    }
}
