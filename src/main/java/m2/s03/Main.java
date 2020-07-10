package m2.s03;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[6];

        dogs[0] = new Dog("Bob");
        for (int i = 1; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }

        dogs[0].bark();
        dogs[dogs.length - 1].bark();
    }
}
