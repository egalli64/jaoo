package m2.s10;

public class Main {
    public static void main(String[] args) {
        Access access = new Access();

        System.out.println("h() -> " + access.h());
        System.out.println("c -> " + Access.c);
        System.out.println("b -> " + access.b);
    }
}
