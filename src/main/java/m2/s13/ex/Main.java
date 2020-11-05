package m2.s13.ex;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bus(), new MotorBike() };

        boolean rightDirection = true;
        for (Vehicle vehicle : vehicles) {
            vehicle.steer(rightDirection);
            rightDirection = !rightDirection;
        }

        Conditioning[] conditionings = { new Bus(), new Car(), new Flat() };

        int temperature = 20;
        for (Conditioning conditioning : conditionings) {
            conditioning.setTemperature(temperature);
            temperature += 1;
        }
    }
}
