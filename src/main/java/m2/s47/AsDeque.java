package m2.s47;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class AsDeque {
    public static void main(String[] args) {
        Deque<Integer> deq = aDeque();
        System.out.println(deq);

        deq.addFirst(7);
        System.out.println("Add 7 as first: " + deq);

        deq.addLast(72);
        System.out.println("Add 72 as last: " + deq);

        System.out.println("First (throws) is: " + deq.getFirst());
        System.out.println("Last (throws) is: " + deq.getLast());

        if (deq.offerFirst(12) && deq.offerLast(12)) {
            System.out.println("12 added both as first and last");
        }

        System.out.println("First element (or null): " + deq.peekFirst());
        System.out.println("Last element (or null): " + deq.peekLast());

        System.out.println("Poll first element (or null): " + deq.pollFirst());
        System.out.println("Poll last element (or null): " + deq.pollLast());

        System.out.println("Pop (first) (or null): " + deq.pop());
        deq.push(-33);
        System.out.println("After pushing (first) -33 (when no excepion): " + deq);

        System.out.println("Remove first element (or exc): " + deq.removeFirst());
        System.out.println("Remove last element (or exc): " + deq.removeLast());
    }

    private static Deque<Integer> aDeque() {
        return new ArrayDeque<Integer>(Arrays.asList(-3, -1, 12, 27, 5));
    }
}
