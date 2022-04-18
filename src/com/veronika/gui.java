package com.veronika;

import javax.swing.*;

public class gui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My Frist GUI");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}
