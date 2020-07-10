package m2.s13ex;

public class Bus extends Vehicle implements Conditioning {
    @Override
    public void setTemperature(int newTemp) {
        System.out.println("Bus temperature now is " + newTemp);
    }
}
