package com.veronika.part_5;

public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Пограмме пререданно " + args.length + " аргумента командной строки");
        System.out.println("Список аргументов: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]:" + args[i]);
    }
}
