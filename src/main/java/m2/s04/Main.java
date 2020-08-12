package m2.s04;

public class Main {
    public static void main(String[] args) {
        String boolAsStringClassic = "" + true;
        System.out.println("A boolean converted to string: " + boolAsStringClassic);

        String boolAsStringModern = String.valueOf(true);
        System.out.println("Another boolean converted to string: " + boolAsStringModern);

        Dog[] dogs = new Dog[2];

        dogs[0] = Dog.createWithName("Bob");
        dogs[1] = Dog.createWithNoName();

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
