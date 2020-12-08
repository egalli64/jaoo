package m06.s06;

public class DogEquality {

    public static void main(String[] args) {
        reflexivity();
        symmetry();
        transitivity();
        consistency();
        nullBehavior();
    }

    private static void reflexivity() {
        Dog bob = new Dog("Bob", "Robert Barkright");
        Dog bob2 = new Dog("Bob", "Robert Barkright");

        System.out.println("bob is " + bob + ", hash: " + bob.hashCode());
        System.out.println("bob2 is " + bob2 + ", hash: " + bob.hashCode());

        if (bob.equals(bob2)) {
            System.out.println("Reflexivity: x equals x");
        } else {
            System.out.println("This must not happen");
        }
    }

    private static void symmetry() {
        Dog bob = new Dog("Bob", "Robert Barkright");
        Dog[] others = { new Dog("Bob", "Robert Barkright"), new Dog("Bob", "William Barkright") };
        for (Dog other : others) {
            if (bob.equals(other)) {
                if (other.equals(bob)) {
                    System.out.println("Symmetry: x equals y -> y equals x");
                } else {
                    System.out.println("This must not happen");
                }
            } else {
                if (other.equals(bob)) {
                    System.out.println("This must not happen");
                } else {
                    System.out.println("Symmetry: x not equals y -> y not equals x");
                }
            }
        }
    }

    private static void transitivity() {
        Dog bob = new Dog("Bob", "Robert Barkright");
        Dog[] dogs2 = { new Dog("Bob", "Robert Barkright"), new Dog("Bob", "William Barkright") };
        Dog[] dogs3 = { new Dog("Zip", "William Barkright"), new Dog("Bob", "Robert Barkright") };

        for (Dog o2 : dogs2) {
            for (Dog o3 : dogs3) {
                if (bob.equals(o2) && bob.equals(o3)) {
                    System.out.print("Transitivity: x equals y and x equals z: ");
                    if (bob.equals(o3)) {
                        System.out.println("x must equals z");
                    } else {
                        System.out.println("this must not happen");
                    }
                }
            }
        }
    }

    private static void consistency() {
        Dog bob = new Dog("Bob", "Robert Barkright");
        Dog[] others = { new Dog("Bob", "Robert Barkright"), new Dog("Bob", "William Barkright") };
        for (Object other : others) {
            if (bob.equals(other)) {
                if (bob.equals(other)) {
                    System.out.println("Consistency: if x equals y once, x always equals y");
                } else {
                    System.out.println("This must not happen");
                }
            } else {
                if (bob.equals(other)) {
                    System.out.println("This must not happen");
                } else {
                    System.out.println("Consistency: if x not equals y once, x never equals y");
                }
            }
        }
    }

    private static void nullBehavior() {
        Dog bob = new Dog("Bob", "Robert Barkright");
        if (bob.equals(null)) {
            System.out.println("This must not happen");
        } else {
            System.out.println("x equals null must always return false");
        }
    }
}
