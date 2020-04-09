package m2.s47;

/**
 * TODO:
 *
 * Implement an int stack as a list of nodes, supporting pop() and push()
 * 
 * the main for Exercise is a smoke test for the mentioned functionality use it
 * as a reference for a more complete JUnit test case
 */
public class Exercise {
    public static void main(String[] args) {
        MyIntStack mis = new MyIntStack();

        for (int i = 0; i < 5; i++) {
            mis.push(i);
        }

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(mis.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyIntStack {
    // TODO: instance variables

    void push(int value) {
        // TODO
    }

    int pop() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

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
