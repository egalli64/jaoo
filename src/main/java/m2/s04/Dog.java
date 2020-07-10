package m2.s04;

public class Dog {
    String name;

    // not a good parameter name, see "this"
    private Dog(String nm) {
        name = nm;
    }

    public static Dog createWithNoName() {
        return new Dog("No name");
    }

    public static Dog createWithName(String name) {
        return new Dog(name);
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
