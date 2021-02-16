package m11.s06;

public class StaticFactoryMethodMain {
    public static void main(String[] args) {
        Coder coder = Coder.createHiredToday("Tom", 4200);
        System.out.println("Coder created: " + coder);
    }
}
