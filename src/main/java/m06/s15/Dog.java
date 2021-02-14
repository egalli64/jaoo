package m06.s15;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("bark!");
    }

    @Override
    public void saySomething() {
        bark();
    }
}