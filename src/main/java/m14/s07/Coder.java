package m14.s07;

import java.time.LocalDate;

public class Coder {
    private String name;
    private LocalDate hireDate;
    private double salary;

    public Coder(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public static Coder createHiredToday(String name, double salary) {
        if (name == null || name.isBlank() || salary <= 0.0) {
            throw new IllegalArgumentException(String.format("Bad input data: %s, %f", name, salary));
        }
        return new Coder(name, LocalDate.now(), salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Coder [name=" + name + ", hireDate=" + hireDate + ", salary=" + salary + "]";
    }
}
