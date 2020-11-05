package m2.s17.ex3;

public class Employee extends Person {
    private double monthlySalary;

    public Employee(String first, String last, double monthlySalary) {
        super(first, last);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double pay() {
        // TODO Auto-generated method stub
        return 0;
    }

}
