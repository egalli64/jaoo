package s049;

public class Initialize {
    private int i; // 0
    private boolean flag; // false
    private String t; // null

    public void f() {
        int i = 42;
        String s = new String("Hello");

        System.out.println(s + i);
    }

    public void g() {
        System.out.println(t + ", " + i + ", " + flag);
    }
}
