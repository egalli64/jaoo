package m3.s11ex;

public class Car extends Vehicle implements Conditioning {
    @Override
    public void setTemperature(int newTemp) {
        System.out.println("Car temperature now is " + newTemp);
    }
}
