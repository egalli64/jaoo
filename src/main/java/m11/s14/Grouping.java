package m11.s14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Grouping {
    private static final Function<Dog, Weight> dogWeight = dog -> {
        double current = dog.getWeight();
        if (current < 3) {
            return Weight.LIGHT;
        } else if (current < 10) {
            return Weight.MEDIUM;
        } else {
            return Weight.HEAVY;
        }
    };

    private static final Predicate<Dog> isYoung = dog -> dog.getAge() < 5;

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Bob", "Tom Hanks", 7, 12.5),
                new Dog("Tom", "Bob Marley", 5, 4.3),
                new Dog("Kim", "Wim Wenders", 4, 8.1),
                new Dog("Kim", "Tom Hanks", 3, 2.5)
        };
        System.out.println("Dogs: " + Arrays.toString(dogs));

        // plain grouping
        Map<String, List<Dog>> dogsByOwner = Arrays.stream(dogs).collect(Collectors.groupingBy(Dog::getOwner));
        System.out.println("Dogs grouped by owner: " + dogsByOwner);

        // plain grouping by external function
        System.out.println("Dogs grouped by weight: " +
                Arrays.stream(dogs).collect(Collectors.groupingBy(dogWeight)));

        // filter then grouping
        Map<String, List<Dog>> youngDogsByOwner = Arrays.stream(dogs).filter(isYoung)
                .collect(Collectors.groupingBy(Dog::getOwner));
        System.out.println("Young dogs by owner: " + youngDogsByOwner);

        // grouping then filtering
        Map<String, List<Dog>> youngDogsByAllOwner = Arrays.stream(dogs).collect(Collectors.groupingBy(
                Dog::getOwner, Collectors.filtering(isYoung, Collectors.toList())));
        System.out.println("Young dogs by all owners: " + youngDogsByAllOwner);

        // grouping and counting
        Map<String, Long> countDogsByOwner = Arrays.stream(dogs).collect(Collectors.groupingBy(
                Dog::getOwner, Collectors.counting()));
        System.out.println("Counting dogs by owner: " + countDogsByOwner);

        // grouping then grouping
        Map<String, Map<Weight, List<Dog>>> dogsByOwnerAndWeight = Arrays.stream(dogs).collect(
                Collectors.groupingBy(Dog::getOwner, Collectors.groupingBy(dogWeight)));
        System.out.println("Dogs by owner and weight: " + dogsByOwnerAndWeight);

        // partitioning
        Map<Boolean, List<Dog>> dogsByAge = Arrays.stream(dogs)
                .collect(Collectors.partitioningBy(isYoung));
        System.out.println("Dogs partitioned by age: " + dogsByAge);

        // just filtering
        System.out.println("Only young dogs: " +
                Arrays.stream(dogs).filter(isYoung).collect(Collectors.toList()));

        // partitioning then grouping
        Map<Boolean, Map<Weight, List<Dog>>> dogsByKimNameAndOwner = Arrays.stream(dogs)
                .collect(Collectors.partitioningBy(isYoung, Collectors.groupingBy(dogWeight)));
        System.out.println("Dogs partitioned by age and weight: " + dogsByKimNameAndOwner);
    }
}
