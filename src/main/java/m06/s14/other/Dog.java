package m06.s14.other;

public class Dog {
    private static final String DEFAULT_NAME = "???";
    private static final int DEFAULT_WEIGHT = 7;

    private String name;
    private int weight;

    public Dog() {
        this(DEFAULT_NAME, DEFAULT_WEIGHT);
    }

    public Dog(String name) {
        this(name, DEFAULT_WEIGHT);
    }

    public Dog(int weight) {
        this(DEFAULT_NAME, weight);
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", weight=" + weight + "]";
    }
}
