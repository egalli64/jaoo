package com.example.jse.m01.s07.bugs;

public class IntToChar {
    public static void main(String[] args) {
        int neg = -20_000;
        int pos = 45536;
        System.out.println("A couple of integers: " + neg + ", " + pos);

        // the value in neg does not make sense as char
        // still I ask Java to trust me and cast it to char
        char c1 = (char) neg;
        System.out.println(neg + " converted to char is " + c1);

        // pos could correctly be casted to char - getting the same result as neg!
        System.out.print(pos + " converted to char is ");
        System.out.println((char) pos);

        // casting the c1 char back to int leads to a surprise
        System.out.println("This was a negative value: " + (int) c1);
    }
}
