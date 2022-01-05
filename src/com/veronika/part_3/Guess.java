package com.veronika.part_3;

public class Guess {
    public static void main(String[] args)
        throws java.io.IOException{
        char ch, answer = 'K';

        System.out.println("Задуманна буква из диапазоне A-Z.");
        System.out.println("Попытайтесь угадать её: ");

        ch = (char) System.in.read();
        if(ch == answer) System.out.println("** Правильно! **");
    }
}
