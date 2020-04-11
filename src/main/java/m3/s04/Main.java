package m3.s04;

public class Main {
    public static void main(String[] args) {
        String name1 = String.valueOf(true);
        String name2 = "" + true;
        System.out.println(name1 + ", " + name2);

        Dog[] dogs = new Dog[2];

        dogs[0] = Dog.withName("Bob");
        dogs[1] = Dog.withNoName();

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
