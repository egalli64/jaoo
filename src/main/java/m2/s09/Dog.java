package m2.s09;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();

    private String name;

    public Dog() {
        LOG.info("Creating a new dog");
        name = "Unknown";
    }

    // poor choice for parameter name, see this
    public void setName(String aName) {
        if (aName == null || aName.isEmpty()) {
            LOG.warning(String.format("User tried to set name to [%s]", aName));
            return;
        }
        for (int i = 0; i < aName.length(); i++) {
            if (!Character.isLetter(aName.charAt(i))) {
                LOG.warning(String.format("User tried to set name to [%s]", aName));
                return;
            }
        }

        LOG.info(String.format("Dog nome set to [%s]", aName));
        name = aName;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // violating black box principle
        Dog dog = new Dog();
        dog.name = "*!_";
        System.out.println("Dog name set to " + dog.getName());

        Dog dog2 = new Dog();

        dog2.setName("|||");
        System.out.println(dog2.getName());
        dog2.setName(null);
        System.out.println(dog2.getName());
        dog2.setName("Tom");
        System.out.println(dog2.getName());
    }
}
