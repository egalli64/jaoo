package com.example.jse.m07.s04.other;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mistake {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE - 1;
        log.info("value is " + value);

        try {
            System.out.println(increment(value));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Cannot increase " + value, e);
        }

        // ...

        try {
            value = increment(value);
        } catch (Exception e) {
            log.log(Level.SEVERE, "Cannot increase " + value, e);
        }

        // ...

        System.out.println("value is " + value);

//        long result = incrementNoExc(value);
//        if (result == Long.MIN_VALUE) {
//            System.out.println("Error!");
//        } else {
//            value = (int) result;
//        }

        value = (int) incrementNoExc(value);
        
        System.out.println("value is " + value);
    }

    /**
     * 
     * @param x
     * @return
     */
    static int increment(int x) throws Exception {
        if (x == Integer.MAX_VALUE) {
            throw new Exception();
        }
        return x + 1;
    }

    /**
     * 
     * @param x
     * @return blah blah blah or 0 in case of error
     */
    static long incrementNoExc(int x) {
        if (x == Integer.MAX_VALUE) {
            return Long.MIN_VALUE;
        }

        return x + 1L;
    }
}
