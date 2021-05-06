package m03.s02;

public class Simple {
    static String aStaticMethod() {
        return "Hi";
    }

    int anInstanceMethod(int a) {
        return -a;
    }

    int anInstanceMethod(int a, int b) {
        return a * b;
    }

    void anotherInstanceMethod(boolean flag) {
        if (flag) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
            return;
        }

        System.out.println("!");
    }
}