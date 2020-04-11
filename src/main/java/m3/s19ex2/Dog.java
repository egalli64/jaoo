package m3.s19ex2;

public class Dog extends Pet {
    public static final int DAILY_HOUSING_PRICE = 10;

    public Dog(int days) {
        super(days);
    }

    @Override
    public int housing() {
//        return DAILY_HOUSING_PRICE * getDays();
//        return calculateDaily(DAILY_HOUSING_PRICE);
        return DAILY_HOUSING_PRICE * days;
    }
}
