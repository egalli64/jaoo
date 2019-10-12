package s073ex;

public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", toString()=" + super.toString() + "]";
    }
}
