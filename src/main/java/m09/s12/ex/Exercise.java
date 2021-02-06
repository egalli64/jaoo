package m09.s12.ex;

/**
 * TODO: Implement an int stack, MyIntStack, based on Node (nested class)
 * 
 * <ul>
 * Each Node should keep
 * <li>the current value (an int)
 * <li>the reference to the previous element in the stack (if any)
 * </ul>
 * 
 * minimal set of required methods (unchecked exception in case of error):
 * <li>push()
 * <li>pop()
 * <li>toString()
 */
public class Exercise {
    public static void main(String[] args) {
        MyIntStack mis = new MyIntStack();

        System.out.println("The empty stack: " + mis.toString());

        for (int i = 0; i < 5; i++) {
            mis.push(i);
        }

        System.out.println("The stack with five elements in it: " + mis.toString());

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Popping an element: " + mis.pop());
                System.out.println("Now the stack is: " + mis.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
