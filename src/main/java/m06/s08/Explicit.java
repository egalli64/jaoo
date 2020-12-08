package m06.s08;

public abstract interface Explicit {
    public static final int X = 42;

    public void a();

    public static void f() {
        System.out.println("A Java 8 feature");
    }

    public default void c() {
        System.out.println("Another Java 8 feature");
    }
}
