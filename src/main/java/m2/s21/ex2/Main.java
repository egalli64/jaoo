package m2.s21.ex2;

/**
 * Create a hierarchy of classes based on Person
 * <p>
 * Consultant: daily fee
 * <p>
 * Employee: monthly salary
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of persons
 * <p>
 * Print name and daily / salary accordingly to their actual type
 */

public class Main {
    public static void main(String[] args) {
        Person[] persons = { /* ... */ };

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
