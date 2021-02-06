package m11.s09;

import java.util.List;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog("Red", "Robert Redford"), new Dog("Zip", "Val Kilmer"),
                new Dog("Fido", "Andrew Scott"));
        System.out.println("Dogs are: " + dogs);

        List<String> owners = dogs.stream().map(Dog::getOwner).collect(toList());
        System.out.println("Owners are: " + owners);

        List<Integer> lengths = owners.stream().map(String::length).sorted().collect(toList());
        System.out.println("Sorted owner name lengths: " + lengths);

        owners.stream().map(s -> s.split("")).flatMap(Arrays::stream).map(String::toLowerCase)
                .distinct().forEach(System.out::print);
    }
}
