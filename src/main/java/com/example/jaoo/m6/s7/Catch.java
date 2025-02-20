/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s7;

import java.io.IOException;
import java.sql.SQLException;

public class Catch {
    public static void main(String[] args) {
        try {
            switch (args.length) {
            case 0 -> throw new SQLException();
            case 1 -> throw new IOException();
            default -> throw new Exception();
            }
        } catch (SQLException ex) {
            System.out.println("RDBMS problem: " + ex);
        } catch (IOException ex) {
            System.out.println("IO problem: " + ex);
        } catch (Exception ex) {
            System.out.println("Some problem: " + ex);
        }
    }
}
