package s061ex;

public class Consultant extends Person {
    private int daily;

    public Consultant(String firstName, String lastName, int daily) {
        super(firstName, lastName);
        this.daily = daily;
    }

    public int getDaily() {
        return daily;
    }
    
    @Override
    public String toString() {
        return "Consultant " + super.toString() + ": daily bill is " + daily;
    }
}
