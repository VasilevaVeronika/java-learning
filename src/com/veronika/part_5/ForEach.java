package com.veronika.part_5;

public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {//цикл типа для + и отображения значений
            System.out.println("Значение: " + x);
            sum += x;
        }
        System.out.println("Сумма:"+sum+"\n");

        for (int y : nums) {
            System.out.println("Значение: " + y);
            sum += y;
            if (y == 5) break;
        }
        System.out.println("Сумма2:"+ sum);
    }
}