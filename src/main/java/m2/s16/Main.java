package m2.s16;

public class Main {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[2];
        mammals[0] = new Dog(63, 40);
        mammals[1] = new Cat(63, 20);

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }
    }
}
