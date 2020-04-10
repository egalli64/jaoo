package m3.s11;

public class Main {
    public static void main(String[] args) {
        Barker[] group = new Barker[3];
        
        group[0] = new Fox();
        group[1] = new Dog();
        group[2] = new Robot();

        for(Barker aBarker: group) {
            System.out.println(aBarker.bark());
        }
        
        BarkAndWag baw = new Dog();
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog();
        System.out.println(dog.bark(3));
        
        interact(dog);
    }
    
    static void interact(Dog barker) {
        barker.bark();
    }
}
