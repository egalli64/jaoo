package m06.s04;

public class Pet {
    private String name;
    protected double weight;
    static int count;
    // public long doNotDoThis;

    static {
        count = 12;
    }

    public Pet() {
        this.name = "Waffle";
        this.weight = 2.18;
    }

    private void increaseWeight() {
        weight += weight / 50;
    }

    void eat() {
        increaseWeight();
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
