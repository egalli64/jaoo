package m09.s11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(5, -3, -1, 12, 27, 5));
        System.out.println(q);

        if (q.offer(18)) {
            System.out.println("18 has been added: " + q);
        }

        System.out.println("The first element in queue (or throws): " + q.element());
        System.out.println("Again, the first element (or null): " + q.peek());

        System.out.println("Remove (or throws): " + q.remove());
        System.out.println("Poll (or null): " + q.poll());
    }
}
