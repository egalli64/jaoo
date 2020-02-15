package s061ex;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Consultant("Tom", "Jones", 1000);
        persons[1] = new Employee("Jim", "Smith", 3000);
        persons[2] = new Consultant("Bob", "Korn", 800);

        for (Person person : persons) {
            System.out.println(person);
        }

        for (Person person : persons) {
            if(person instanceof Consultant) {
                Consultant c = (Consultant)person;
                System.out.println(c.getDaily());
            } else if(person instanceof Employee) {
                Employee e = (Employee)person;
                System.out.println(e.getSalary());
            }

        }
    }
}
