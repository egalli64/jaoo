package s049;

public class Initialize {
    private int i; // 0
    private boolean flag; // false
    private String t; // null

    public void f() {
        int i = 42;
        int j;
        String s = new String("Hello");

        System.out.println(s + i);
        
        // System.out.println(j); // error: variable j might not have been initialized
        j = i / 2;
        System.out.println(j);
    }

    public void g() {
        System.out.println(t + ", " + i + ", " + flag);
    }
}
