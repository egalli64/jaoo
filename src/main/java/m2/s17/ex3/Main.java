package m2.s17.ex3;

public class Main {
    public static void main(String[] args) {

        // trainee, employee, consultant
        Person[] persons = { //
                new Trainee("Tom", "Smith", 20.0, 20), //
                new Employee("", "", 2000.0), //
                new Consultant("", "", 300, 3) };

        for (Person person : persons) {
            person.pay();
        }
    }
}
