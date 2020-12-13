package m09.s12.ex;

/**
 * TODO:
 *
 * Implement MyIntStack, an int stack as a list of nodes, supporting pop() and
 * push()
 */
/**
 * TODO:
 *
 * Implement an int stack, MyIntStack, as a list of Node (nested class)
 * 
 * minimal set of methods: push(), pop() and toString()
 * 
 * let it throw an unchecked exception in case of errors
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
