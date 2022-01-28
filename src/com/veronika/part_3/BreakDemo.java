package com.veronika.part_3;

public class BreakDemo {
    public static void main(String[] args) {

        int num;

        num = 100;

        for (int i = 0; i < num; i++) {

            if (i * i >= num) break;

            System.out.print(i + " ");
        }
        System.out.println("Цикл завершен.");
    }
}
