package m06.s02;

public class NoDataHiding {
    public static void main(String[] args) {
        // violating data hiding principle
        Dog dog = new Dog();
        dog.name = "*!_";
        System.out.println("Dog name set to " + dog.getName());

        // using data hiding principle
        Dog dog2 = new Dog();

        dog2.setName("|||");
        System.out.println(dog2.getName());
        dog2.setName(null);
        System.out.println(dog2.getName());
        dog2.setName("Tom");
        System.out.println(dog2.getName());
    }
}
