package m2.s07;

public class Dog {
    private static int counter;

    public Dog() {
        counter += 1;
    }

    public static void main(String[] args) {
        System.out.println("Current number of dogs: " + Dog.counter);

        Dog[] dogs = new Dog[10];
        System.out.println("Current number of dogs is still: " + Dog.counter);

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
        System.out.println("Current number of dogs: " + Dog.counter);
    }
}
