package m10.s06;

/**
 * TODO: Implement and use a single linked list of integers
 */
public class MyIntListLinkedMain {
    public static void main(String[] args) {
        MyIntListLinked mil = new MyIntListLinked();

        if (!mil.isEmpty()) {
            System.out.println("Unexpected!");
        }

        mil.add(42);
        System.out.println(mil.toString());
    }
}
