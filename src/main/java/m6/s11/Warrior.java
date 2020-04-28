package m6.s11;

public class Warrior implements Fighter {
    private int power = 10;

    @Override
    public int fight() {
        return power;
    }
}
