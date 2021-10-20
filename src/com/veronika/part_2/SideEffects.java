package com.veronika.part_2;

public class SideEffects {
    public static void main(String[] args){
        int i;

        i = 0;
        if (false & (++i < 100));
        System.out.println("Это строка не будет отоброжаться");
        System.out.println("Инструкция if выполняется: " + i);

        if (false && (++i < 100));
        System.out.println("Это строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);
    }
}
