package com.example.jse.m10.s14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SwingEventExample extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton button;
    private int counter;

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

    private class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter += 1;
            button.setText("Click counter is " + counter);
        }
    }

    public static void main(String[] args) {
        new SwingEventExample();
    }
}