/*
 * A simple Java source file
 */
package m01.s04;

/**
 * A "hello" class
 * 
 * @author Emanuele Galli
 */
public class Simple {
    public static void main(String[] args) {
        // output a string to console
        System.out.print("Hello, ");

        // if the caller passes exactly one parameter, output it
        if (args.length == 1) {
            System.out.println(args[0]);
        } else {
            // otherwise output something generic
            System.out.println("stranger");
        }
    }
}
