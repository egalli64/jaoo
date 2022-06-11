package com.example.jse.m10.s14;

import java.util.logging.Logger;

public class Encloser {
    private static final Logger log = Logger.getGlobal();
    private final int value = 12;

    /**
     * Dubious: let us access internal class details
     * 
     * @return an instance of an inner private class!
     */
    public InnerPrivate f() {
        return new InnerPrivate();
    }

    /**
     * Safer: internal details are managed here, the result is just a copy
     */
    public int g() {
        InnerPrivate inner = new InnerPrivate();
        return inner.getDoubledValue();
    }

    public int k() {
        class LocalClass {
            final int a = 7;
            final int b = 3;
            final int c = 2;
        }

        LocalClass answer = new LocalClass();
        return answer.a * answer.b * answer.c;
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
