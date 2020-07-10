package m4.s10;

/**
 * TODO:
 *
 * Implement an int queue as a list of nodes supporting add(), remove() and toString()
 * 
 * the main for Exercise is a smoke test for the mentioned functionality
 * use it as a reference for a more complete JUnit test case
 */
public class Exercise {
    public static void main(String[] args) {
        MyIntQueue miq = new MyIntQueue();
        System.out.println("[] -> " + miq.toString());

        miq.add(42);
        System.out.println("[42] -> " + miq.toString());

        miq.add(2);
        System.out.println("[42, 2] -> " + miq.toString());

        miq.add(23);
        System.out.println("[42, 2, 23] -> " + miq.toString());

        int value = 0;
        try {
            value = miq.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("42 -> " + value);
        System.out.println("[2, 23] -> " + miq.toString());

        try {
            value = miq.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("2 -> " + value);
        System.out.println("[23] -> " + miq.toString());

        try {
            value = miq.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("23 -> " + value);
        System.out.println("[] -> " + miq.toString());

        try {
            miq.remove();
        } catch (Exception e) {
            System.out.println("as expected: " + e);
        }
    }
}

class MyIntQueueException extends Exception {
    private static final long serialVersionUID = 1L;

    public MyIntQueueException(String message) {
        super(message);
    }
}

class MyIntQueue {
    // TODO instance variables?

    public MyIntQueue() {
        // TODO
    }

    public void add(int value) {
        // TODO
    }

    public int remove() throws MyIntQueueException {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String toString() {
        // TODO
        return super.toString();
    }
}

/**
 * JavaBean
 */
class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]";
    }
}