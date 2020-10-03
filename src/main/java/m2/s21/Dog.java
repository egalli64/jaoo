package m2.s21;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println("bark!");
    }
}