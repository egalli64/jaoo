package m2.s03;

public class Dog {
    String name;
    static int counter = 0;

    public Dog() {
        name = "No name";
        counter += 1;
        //System.out.println("A new anonymous dog has been created");
    }

    // not a good parameter name, see "this"
    public Dog(String nm) {
        counter += 1;
        name = nm;
        //System.out.println("A new dog named " + name + " has been created");
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
