package com.example.jse.m10x.s05.exercise;

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
public class MyIntStackLinkedMain {
    public static void main(String[] args) {
        MyIntStackLinked mis = new MyIntStackLinked();

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
