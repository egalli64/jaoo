package m06.s04.other;

import m06.s04.Pet;

public class PetSub extends Pet {
    public void f() {
        // super's protected members are accessible
        System.out.println(weight);

        // super's private members are _not_ accessible
//        System.out.println(name);

        // super's package members are _not_ accessible - static or not
//        System.out.println(Pet.count);
    }
}
