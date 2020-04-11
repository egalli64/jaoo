package m3.s03;

public class Dog {
    String name;

    public Dog() {
        name = "No name";
        System.out.println("A new anonymous dog has been created");
    }

    // not a good parameter name, see "this"
    public Dog(String nm) {
        name = nm;
        System.out.println("A new dog named " + name + " has been created");
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
