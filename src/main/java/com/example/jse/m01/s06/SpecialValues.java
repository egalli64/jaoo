/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m01.s06;

/**
 * Special values for primitive floating point types, and methods to check them
 */
public class SpecialValues {
    /**
     * Working with variables with NaN and infinity values
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Double and Float NaN: Not a Number
        double dNan = Math.sqrt(-1);
        float fNan = (float) Math.sqrt(-1);
        if (Double.isNaN(dNan) && Float.isNaN(fNan)) {
            System.out.println("Two NaNs");
        }

        // Double and Float POSITIVE_INFINITY
        double dPosInf = 1.0 / 0.0;
        float fPosInf = 1.0f / 0.0f;
        if (dPosInf == Double.POSITIVE_INFINITY && fPosInf == Float.POSITIVE_INFINITY) {
            System.out.println("Two positive infinities");
        }
        if (!Double.isInfinite(dPosInf) || !Float.isInfinite(fPosInf)) {
            System.out.println("Unexpected");
        }

        // Double and Float NEGATIVE_INFINITY
        double dNegInf = -1.0 / 0.0;
        float fNegInf = -1.0f / 0.0f;
        if (dNegInf == Double.NEGATIVE_INFINITY && fNegInf == Float.NEGATIVE_INFINITY) {
            System.out.println("Two negative infinities");
        }
        if (Double.isFinite(dNegInf) || Float.isFinite(fNegInf)) {
            System.out.println("Unexpected");
        }
    }
}
