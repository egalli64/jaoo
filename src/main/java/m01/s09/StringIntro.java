package m01.s09;

public class StringIntro {
    public static void main(String[] args) {
        char c = 'x';
        System.out.println(c);

        String s = new String("hello"); // explicit, but _not_ a good idea
        System.out.println(s);

        String t = "hello";
        System.out.println(t);

        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
    }
}
