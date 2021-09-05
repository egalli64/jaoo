package m12.s05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorComposition {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Bob", "Robert Mitchum", 11),
                new Dog("Rob", "Robert Redford", 4),
                new Dog("Bob", "Robert Redford", 11)
        );

        System.out.println("A dog list: " + dogs);

        // the hard way
        Comparator<Dog> dogAgeComparator = (l, r) -> Integer.compare(l.getAge(), r.getAge());

        dogs.sort(dogAgeComparator);
        System.out.println("Sorted by age: " + dogs);

        dogs.sort(dogAgeComparator.reversed());
        System.out.println("Sorted by age, reversed: " + dogs);

        // simpler way
        Comparator<Dog> byName = Comparator.comparing(Dog::getName);
        dogs.sort(byName);
        System.out.println("Sorted by name: " + dogs);

        Comparator<Dog> byOwner = Comparator.comparing(Dog::getOwner);
        dogs.sort(byOwner);
        System.out.println("Sorted by owner: " + dogs);

        Comparator<Dog> byAge = Comparator.comparingInt(Dog::getAge);
        dogs.sort(byAge);
        System.out.println("Sorted by age: " + dogs);

        Comparator<Dog> byNameReversed = byName.reversed();
        dogs.sort(byNameReversed);
        System.out.println("Sorted by name, reversed: " + dogs);

        Comparator<Dog> byNameAndOwner = byName.thenComparing(byOwner);
        dogs.sort(byNameAndOwner);
        System.out.println("Sorted by name and then owner: " + dogs);

        Comparator<Dog> byOwnerAndAgeReversed = byOwner.thenComparing(byAge).reversed();
        dogs.sort(byOwnerAndAgeReversed);
        System.out.println("Sorted by owner and then age, reversed: " + dogs);
    }
}
