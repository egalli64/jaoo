package m12.s14.dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        Dog plush = new PlushDog();
        plush.bark();

        dog.setBarkStrategy(() -> System.out.println("Growl ..."));

        System.out.println("Careful! The dog has changed its barking strategy!");
        dog.bark();
    }
}
