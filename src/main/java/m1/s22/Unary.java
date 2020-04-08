package m1.s22;

public class Unary {
    public static void main(String[] args) {
        int value = 1;

        System.out.println(value); // 1

        System.out.println(++value); // 2
        System.out.println(--value); // 1

        System.out.println(value++); // 1
        System.out.println(value); // 2
        System.out.println(value--); // 2
        System.out.println(value); // 1

        System.out.println(+value); // 1
        System.out.println(-value); // -1
    }
}
