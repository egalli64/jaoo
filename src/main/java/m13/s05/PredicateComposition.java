package m13.s05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateComposition {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Bob", "Robert Mitchum", 11),
                new Dog("Rob", "Robert Redford", 4),
                new Dog("Bob", "Robert Redford", 11)
        );

        System.out.println("A dog list: " + dogs);

        Predicate<Dog> old = dog -> dog.getAge() > 10;
        System.out.println("Old dogs: " + dogs.stream().filter(old).collect(Collectors.toList()));
        System.out.println("Non-old dogs: " + dogs.stream().filter(old.negate()).collect(Collectors.toList()));

        Predicate<Dog> redfordOwned = dog -> dog.getOwner().endsWith("Redford");
        System.out.println("Old dogs owned by Redford: " + dogs.stream().filter(old.and(redfordOwned)).collect(Collectors.toList()));

        Predicate<Dog> namedRob = dog -> dog.getName().equals("Rob");
        System.out.println("Named Rob: " + dogs.stream().filter(namedRob).collect(Collectors.toList()));
        System.out.println("Named Rob or owned by Redford: " + dogs.stream().filter(namedRob.or(redfordOwned)).collect(Collectors.toList()));
        System.out.println("Not (named Rob or owned by Redford): " + dogs.stream().filter(namedRob.or(redfordOwned).negate()).collect(Collectors.toList()));
    }
}
