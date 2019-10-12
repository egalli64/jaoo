package s125;

public class Coder {
    private String firstName;
    private String lastName;
    private int salary;

    public Coder() {
    }

    public Coder(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "[firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
    }
}