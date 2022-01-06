package com.veronika.part_3;

public class SqrRoot {
    public static void main(String[] args) {
        
        double num, sroot = 0, rerr;
        
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);
        }
        rerr = num - (sroot * sroot);
        System.out.println("Ошибка округления: " + rerr);
        System.out.println();
    }
}
