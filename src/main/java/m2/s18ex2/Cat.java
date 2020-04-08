package m2.s18ex2;

public class Cat extends Pet {
    public static final int DAILY_HOUSING_PRICE = 6;
    
    public Cat(int days) {
        super(days);
    }

    @Override
    public int housing() {
        return DAILY_HOUSING_PRICE * getDays();
    }
}
