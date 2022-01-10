package com.veronika.part_3;

public class ForTest {
    public static void main(String[] args)
            throws java.io.IOException {

        System.out.println("Для остановки нажмите клавишу S");

        int i;

        for (i = 0; (char) System.in.read() != 'S'; i++)
        System.out.println("Проход #" + i);
    }
}
