package m11.s13.dog;

public class PlushDog extends Dog {
    public PlushDog() {
        super(() -> System.out.println("I won't bark"));
    }
}
