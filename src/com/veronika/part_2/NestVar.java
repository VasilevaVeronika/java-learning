package com.veronika.part_2;

public class NestVar {
    
    public static void main(String[] args) {

        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("Значение count: " + count);

            for (count = 0; count < 2; count++) {
                System.out.println("В этой программе есть ошибка");

            }
        }
    }
}