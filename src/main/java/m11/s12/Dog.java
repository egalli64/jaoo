package m11.s12;

public class Dog {
    private String name;
    private String owner;
    private int age;

    public Dog(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + ", owner='" + owner + ", age=" + age + '}';
    }
}
