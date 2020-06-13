package m6.s09;

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

class X {
    public static void main(String[] args) {
        Eager eager = Eager.getInstance();
        System.out.println(eager.solution());
    }
}
