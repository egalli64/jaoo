package m06.s07;

public class Main {
    public static void main(String[] args) {
        Dog bob = new Dog("Bob", 2, 4.0);
        System.out.println(bob);

        // overloading could be confusing
        Dog tom = new Dog("Tom", 4);
        System.out.println(tom);
    }
}
