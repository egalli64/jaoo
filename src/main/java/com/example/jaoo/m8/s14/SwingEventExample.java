/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * Using inner class for working on events
 */
public class SwingEventExample extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton button;
    private int counter;

    /**
     * No-arg constructor
     */
    public SwingEventExample() {
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");

        button = new JButton("Click Me!");
        button.addActionListener(new ClickListener());

        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    /**
     * The action listener used to act on button click
     */
    private class ClickListener implements ActionListener {
        /**
         * When the user click on the button
         */
        public void actionPerformed(ActionEvent e) {
            counter += 1;
            button.setText("Click counter is " + counter);
        }
    }

    /**
     * Start the swing application
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        new SwingEventExample();
    }
}