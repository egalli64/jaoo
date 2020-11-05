package m2.s17.ex3;

public class Trainee extends Person {
    private double remboursementPerDay;

    public Trainee(String first, String last, double remboursementPerDay, int days) {
        super(first, last);
        this.remboursementPerDay = remboursementPerDay;
    }

    @Override
    public double pay() {
        // TODO Auto-generated method stub
        return 0;
    }
}
