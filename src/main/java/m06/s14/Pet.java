package m06.s14;

public class Pet {
    protected String name;

    public Pet() {
        // implicit call to super ctor
//      super();
        this.name = "Unknown";
    }

    public Pet(String name) {
        // useless explicit call to super ctor
        super();
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