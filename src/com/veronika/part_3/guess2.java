package com.veronika.part_3;

public class guess2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("** Вы угадали! **");
        else System.out.println("...Извините, вы не угадали.");
    }
}
