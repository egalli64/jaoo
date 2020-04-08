package m1.s36;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[10];

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }

        dogs[5].bark();
    }
}
