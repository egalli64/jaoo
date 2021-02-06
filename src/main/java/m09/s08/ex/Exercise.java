package m09.s08.ex;

import java.util.Random;

/**
 * TODO: Implement an single linked list of integers, MyIntList, based on Node (nested class)
 * 
 * <ul>
 * Each Node should keep
 * <li>the current value (an int)
 * <li>the reference to the next element in the list (if any)
 * </ul>
 * 
 * minimal set of required methods (unchecked exception in case of error):
 * <li>add(value) - value is inserted in the list as the new tail
 * <li>get(pos) - return a copy of the value in the passed position
 * <li>toString()
 */
public class Exercise {
    public static void main(String[] args) {
        MyIntList mil = new MyIntList();

        System.out.println("The empty list: " + mil.toString());

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int value = random.nextInt();
            mil.add(value);
        }

        System.out.println("The list with five elements in it: " + mil.toString());

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(String.format("Element in position %d is %d", i, mil.get(i)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
