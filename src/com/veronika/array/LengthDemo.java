package com.veronika.array;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1, 2, 3};
        int table[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Размер list: " + list.length);
        System.out.println("Размер nums: " + nums.length);
        System.out.println("Размер table:" + table.length);
        System.out.println("Размер table[0]" + table[0].length);
        System.out.println("Размер table[1]" + table[1].length);
        System.out.println("Размер table[2]" + table[2].length);
        System.out.println();
        //переменная length для инициализации списка

        for (int i = 0; i < list.length; i++)//управление циклом for через переменную longth
            list[i] = i * i;
        System.out.println("Содержимое списка: ");
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i] + " ");
        System.out.println();
    }
}
