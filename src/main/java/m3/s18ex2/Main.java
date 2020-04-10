package m3.s18ex2;

public class Main {
    public static void main(String[] args) {
        //  Pet - abstract int housing()
        //  |  \
        // Dog Cat
        
        // ctor(int)
        
        // cane x 1 giorno -> 10
        // gatto           -> 6
        
        // Pet[] = new Dog, Cat, ...
        
        // bob = new Dog(3);
        // tom = new Cat(1);
        // bob.housing() -> 30
        
        // for each -> calcolare housing complessivo = 36
        
        Pet[] guests = { new Dog(3), new Cat(5), new Dog(1) };
        
        int total = 0;
        for(Pet guest: guests) {
            total += guest.housing();
        }
        
        System.out.println(total);
    }
}
