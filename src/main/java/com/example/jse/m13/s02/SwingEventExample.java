package com.example.jse.m13.s02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SwingEventExample extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JButton button;
    private int counter;

    public SwingEventExample() {
        setSize(300, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello");

        button = new JButton("Click Me!");
        button.addActionListener(ev -> button.setText(Integer.toString(++counter)));

        JPanel panel = new JPanel();
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingEventExample();
    }
}