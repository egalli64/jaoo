package m12.s10;

import java.util.List;

public class MatcherFindExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(4, 2, 5, 23, 54, 11, 67, 100, 15, 83, 45);
        System.out.println(data);

        matchers(data);
        finders(data);
    }

    private static void matchers(List<Integer> data) {
        if (data.stream().allMatch(x -> x > 0)) {
            System.out.println("All the elements are positive");
        }

        if (data.stream().anyMatch(x -> x % 2 == 0)) {
            System.out.println("There is at least an even element");
        }

        if (data.stream().noneMatch(x -> x > 100)) {
            System.out.println("No element is biggger than 100");
        }

        if (data.stream().filter(x -> x > 100).allMatch(x -> x < 0)) {
            System.out.println("No element is bigger than 100 - or any of such elements are negative (?!)");
        }
    }

    private static void finders(List<Integer> data) {
        data.stream().filter(x -> x % 2 == 0).findAny() //
                .ifPresent(x -> System.out.println("There is at least an even element: " + x));

        data.stream().filter(x -> x % 2 == 0).findFirst() //
                .ifPresent(x -> System.out.println("The first even element is: " + x));
    }
}
