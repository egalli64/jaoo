package m06.s02;

import java.util.logging.Logger;

public class Dog {
    private static final Logger log = Logger.getGlobal();

    // weak data hiding
    String name;

    public Dog() {
        log.info("Creating a new dog");
        name = "Unknown";
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            log.warning(String.format("User tried to set name to [%s]", name));
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                log.warning(String.format("User tried to set name to [%s]", name));
                return;
            }
        }

        log.info(String.format("Dog nome set to [%s]", name));
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
