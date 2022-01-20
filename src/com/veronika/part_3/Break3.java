package com.veronika.part_3;

public class Break3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        for (; ; ) {
            ch = (char) System.in.read();

            if (ch == 'q') break;
        }
        System.out.println("Вы нажали q !");
    }
}

