package m01.s07;

public class Simple {
    public static void main(String[] args) {
        int value = 42;
        String name = "Bob";

        System.out.println(value);
        System.out.println(Integer.toHexString(System.identityHashCode(name)) + " -> " + name);
    }
}
