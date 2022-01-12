package com.veronika.part_3;

public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x равно 1");
            else if (x == 2)
                System.out.println("x равно 2");
            else if (x == 3)
                System.out.println("x равно 3");
            else if (x == 4)
                System.out.println("x равно 4");
            else
                System.out.println("Значение x находится вне диапазогна  1-4");
        }
    }
}
