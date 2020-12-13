package m09.s02;

import java.util.logging.Logger;

public class Encloser {
    private static final Logger log = Logger.getGlobal();
    private int value = 12;

    /**
     * Dubious: let us access internal class details
     * 
     * @return an instance of a inner private class!
     */
    public InnerPrivate f() {
        return new InnerPrivate();
    }

    /**
     * Safer: internal details are managed here, the result is returned
     */
    public int g() {
        InnerPrivate inner = new InnerPrivate();
        return inner.getDoubledValue();
    }

    public class InnerPublic {
        public InnerPublic() {
            log.info("An object of an inner public class created, full access to class property: " + value);
        }

        public int getDoubledValue() {
            return value * 2;
        }
    }

    private class InnerPrivate implements Getter {
        public InnerPrivate() {
            log.info("An object of an inner private class created, full access to class property: " + value);
        }

        public int getDoubledValue() {
            return value * 2;
        }

        @Override
        public int getValue() {
            return value;
        }
    }
}
