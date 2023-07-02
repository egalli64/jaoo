/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s14;

import java.util.logging.Logger;

/**
 * Inner class example
 */
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

    /**
     * A method defining a class in its scope
     * 
     * @return a useless value
     */
    public int k() {
        class LocalClass {
            final int a = 7;
            final int b = 3;
            final int c = 2;
        }

        LocalClass answer = new LocalClass();
        return answer.a * answer.b * answer.c;
    }

    /**
     * An inner public class
     */
    public class InnerPublic {
        /**
         * No-arg constructor
         */
        public InnerPublic() {
            log.info("An object of an inner public class created, full access to class property: " + value);
        }

        /**
         * A method
         * 
         * @return a useless value
         */
        public int getDoubledValue() {
            return value * 2;
        }
    }

    /**
     * A private inner class
     */
    private class InnerPrivate implements Getter {
        /**
         * No-arg constructor
         */
        public InnerPrivate() {
            log.info("An object of an inner private class created, full access to class property: " + value);
        }

        /**
         * A method
         * 
         * @return a useless value
         */
        public int getDoubledValue() {
            return value * 2;
        }

        @Override
        public int getValue() {
            return value;
        }
    }
}
