package m10.s04;

public class Main {
    public static void main(String[] args) {
        Dog tomBob = new Dog("tom", "bob");
        Dog tomCarl = new Dog("tom", "carl");
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        }
    }
}
