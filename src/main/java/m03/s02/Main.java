package m03.s02;

public class Main {
    public static void main(String[] args) {
        // calling a static method
        double root = Math.sqrt(121);

        // calling an instance method
        System.out.println(root);

        String aString = Simple.aStaticMethod();
        System.out.println(aString);

        Simple reference = new Simple();

        int result = reference.anInstanceMethod(7, 6);
        System.out.println(result);

        reference.anotherInstanceMethod(true);
        reference.anotherInstanceMethod(false);
    }
}
