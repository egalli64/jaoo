package m05.s04;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        
        String boolAsStringClassic = "" + flag;
        System.out.println("A boolean converted to string: " + boolAsStringClassic);

        String boolAsStringModern = String.valueOf(flag);
        System.out.println("Another boolean converted to string: " + boolAsStringModern);

        Dog[] dogs = new Dog[3];

        dogs[0] = Dog.createWithName("Bob");
        dogs[1] = Dog.createWithNoName();
        dogs[2] = Dog.createWithBreedButNoName("Bobtail");

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
