package m3.s07;

public class Final {
    public static void main(String[] args) {
        final int SIZE = 12;
        final Integer MAX = 12;
        final StringBuilder sb = new StringBuilder("hello");

        System.out.println(SIZE + 1);
        System.out.println(MAX + 1);

        sb.append('!');
        System.out.println(sb);

        // The final local variable ... cannot be assigned.
//        SIZE += 1; 
//        MAX += 1;
//        sb = new StringBuilder("Goodbye");

    }

    public final void f() {
    }

    public static final void g() {
    }
}
