package m06.s09;

public class Main {
    public static void main(String[] args) {
        Mammal[] mammals = { new Dog(63, 40), new Cat(63, 20) };

        for (Mammal mammal : mammals) {
            System.out.println(mammal);
        }

        Barker barker = new Dog(62, 42);
        barker.bark();
    }
}
