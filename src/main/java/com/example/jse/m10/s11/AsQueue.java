package com.example.jse.m10.s11;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AsQueue {
    public static void main(String[] args) {
        // The concrete class should implement the Queue interface
        Queue<Integer> q = create(false);
        System.out.println("An empty queue: " + q);

        try {
            System.out.println("This won't work: " + q.remove());
        } catch (NoSuchElementException e) {
            System.out.println(e.getClass().getName() + " trying to remove an item from an empty queue");
        }

        System.out.println("Poll on an empty queue: " + q.poll());

        if (q.offer(18)) {
            System.out.println("Offer a value: " + q);
        }

        System.out.println("First element in queue (or throws): " + q.element());
        System.out.println("First element (or null): " + q.peek());

        System.out.println("Remove first element in queue (or throws): " + q.remove());
    }

    public static Queue<Integer> create(boolean flag) {
        return flag ? new LinkedList<>() : new ArrayDeque<>();
    }
}
