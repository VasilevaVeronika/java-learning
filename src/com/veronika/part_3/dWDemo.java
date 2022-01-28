package com.veronika.part_3;

public class dWDemo {
    public static void main(String[] args)
            throws java.io.IOException{

        char ch;

        do {
            System.out.print("Нажмите нужную клавишу, а затем ENTER: ");

            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
