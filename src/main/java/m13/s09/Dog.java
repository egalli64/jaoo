package m13.s09;

public class Dog {
    private String name;
    private String owner;

    public Dog() {
    }

    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", owner=" + owner + "]";
    }
}
