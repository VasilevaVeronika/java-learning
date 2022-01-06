package com.veronika.part_3;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i равно 0");
                    break;
                case 1:
                    System.out.println("i равно 1");
                    break;
                case 2:
                    System.out.println("i равно 2");
                    break;
                case 3:
                    System.out.println("i равно 3");
                    break;
                case 4:
                    System.out.println("i равно 4");
                    break;
                default:
                    System.out.println("i равно или больше 5");
            }
    }
}
