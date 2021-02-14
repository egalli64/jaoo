package m06.s14;

public class Pet {
    private String name;

    public Pet(String name) {
        // super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + "]";
    }
}