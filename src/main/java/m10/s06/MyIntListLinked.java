package m10.s06;

/**
 * TODO: A single linked list of integers
 * 
 * @see MyIntList
 */
public class MyIntListLinked implements MyIntList {
    /**
     * TODO: list implementation detail
     * 
     * <ul>
     * Each node should keep
     * <li>the current value (an int)
     * <li>the reference to the next element in the list (if any)
     * </ul>
     */
    private static class IntNode {
    }

    private IntNode head;

    public MyIntListLinked() {
        this.head = null;
    }

    @Override
    public void add(int value) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int get(int pos) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
