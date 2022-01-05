package com.veronika.part_3;

public class Guess_3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, anwers = 'K';

        System.out.println("Была загадана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == anwers) System.out.println("** Вы угадали! **");
        else {
            System.out.println("...Извините, нужная буква находится ");
            if (ch < anwers) System.out.println("Ближе к концу алфавита");
            if (ch > anwers) System.out.println("Ближе к началу алфавита");
        }
    }
}
