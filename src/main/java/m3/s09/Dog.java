package m3.s09;

public class Dog {
    String name;
    
    public Dog() {
        name = "Unknown";
    }
    
    public void setName(String aName) {
        if(aName == null || aName.isEmpty()) {
            System.out.println("!!!");
            return;
        }
        for(int i = 0; i < aName.length(); i++) {
            if(!Character.isLetter(aName.charAt(i))) {
                System.out.println("!!!");
                return;
            }
        }
        name = aName;
    }
    
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // violating black box principle
        Dog dog = new Dog();
        dog.name = "*!_";
        System.out.println(dog.getName());
        
        
        // using black box principle (not enforced by the class, here)
        Dog dog2 = new Dog();
        
        dog2.setName("|||");
        System.out.println(dog2.getName());
        dog2.setName("Tom");
        System.out.println(dog2.getName());
    }
}
