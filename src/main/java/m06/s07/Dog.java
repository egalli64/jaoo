package m06.s07;

public class Dog {
    private static final String DEFAULT_NAME = "Unknown";
    private static final int DEFAULT_AGE = 0;
    private static final double DEFAULT_WEIGHT = 0.8;

    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, double weight) {
        this.name = name;
        this.age = DEFAULT_AGE;
        this.weight = weight;
    }

    public Dog() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
        this.weight = DEFAULT_WEIGHT;
    }

    // Cannot reduce visibility
//    @Override
//    protected String toString() {
//        return "A dog";
//    }

    // covariant return type
    @Override
    protected Dog clone() {
        return new Dog();
    }

    // Cannot override final
//    public void notify() {
//    }

    // this is an overload
    public String toString(boolean flag) {
        return "A dog, flagged as " + flag;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}
