package com.example.jse.m03.s03;

public class ParameterPassing {
    /**
     * No side effect
     * 
     * @param parameter being a primitive, it is just a local copy
     */
    public void primitive(int parameter) {
        parameter += 1;
        System.out.println("parameter is " + parameter);
    }

    /**
     * No side effect
     * 
     * @param parameter an immutable
     */
    public void immutableReference(String parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
//        Objects.requireNonNull(parameter, "Parameter should not be null");

        System.out.println("parameter id was " + System.identityHashCode(parameter));
        parameter += " there";
        System.out.println("Now parameter id is " + System.identityHashCode(parameter));
        System.out.println("parameter value is " + parameter);
    }

    /**
     * Side effect
     * 
     * @param parameter a reference, the referred object could be changed
     */
    public void reference(StringBuilder parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: we could throw a NullPointerException if parameter is null
        // Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter.append(" there");
        System.out.println("parameter value is " + parameter);
    }

    /**
     * Array is a reference
     * 
     * @param data an array, its values could be changed
     */
    public void reference(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("Nothing to do here");
            return;
        }

        data[0] += 1;
        System.out.println("data[0] is " + data[0]);
    }

    /**
     * Get a primitive, modify the local copy and return it
     * 
     * @param value a primitive, local copy
     * @return the increased value
     */
    public int increase(int value) {
        return value + 1;
    }
}
