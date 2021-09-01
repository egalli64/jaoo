package m11.s12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DogReducing {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Bob", "Tom Hanks", 7, 12.5),
                new Dog("Tom", "Bob Marley", 5, 4.3),
                new Dog("Kim", "Wim Wenders", 4, 8.1)
        };

        System.out.println("Dogs: " + Arrays.toString(dogs));

        System.out.println("Total weight: " +
                Arrays.stream(dogs).collect(Collectors.summingDouble(Dog::getWeight)));
        System.out.println("Total weight by reducing: " +
                Arrays.stream(dogs).collect(Collectors.reducing(0.0, Dog::getWeight, Double::sum)));

        System.out.println("Average age: " +
                Arrays.stream(dogs).collect(Collectors.averagingInt(Dog::getAge)));

        System.out.println("All owners: " +
                Arrays.stream(dogs).map(Dog::getOwner).collect(Collectors.joining(", ")));
    }
}
