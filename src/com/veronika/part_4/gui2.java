package com.veronika.part_4;

import javax.swing.*;
import java.awt.*;

public class gui2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat Frame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");

        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem("Открыть");
        JMenuItem m22 = new JMenuItem("Сохранить как");

        m1.add(m11);
        m2.add(m22);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Введите текст");
        JTextField tf = new JTextField(10);

        JButton send = new JButton("Отправить");
        JButton reset = new JButton("Сброс");

        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
