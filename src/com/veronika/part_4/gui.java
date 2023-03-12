package com.veronika.part_4;

import com.sun.tools.javac.Main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.util.Objects;

public class gui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Кнопка пукалка");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("Тыкай чтобы появилось волшебство");

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        frame.setVisible(true);

    }

    public static synchronized void playSound (final String url) {
        new Thread(new Runnable() {

            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            Objects.requireNonNull(Main.class.getResourceAsStream("/path/to/sounds/" + url)));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}
