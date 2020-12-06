package m03.s02;

public class Main {
    public static void main(String[] args) {
        String aString = Simple.h();
        System.out.println(aString);

        Simple reference = new Simple();

        int result = reference.f(7, 6);
        System.out.println(result);

        reference.g(true);
        reference.g(false);
    }
}
