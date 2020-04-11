package m3.s19ex2;

public abstract class Pet {
//    private int days;
    protected int days;
    int x;
    
    public Pet(int days) {
        this.days = days;
    }

    public abstract int housing();

    public int getDays() {
        return days;
    }
    
    public int calculateDaily(int dailyPrice) {
        return dailyPrice * days;
    }
}
