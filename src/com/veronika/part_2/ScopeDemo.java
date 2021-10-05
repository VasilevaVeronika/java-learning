package com.veronika.part_2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x;
        
        x = 10;
        if (x == 10) {

            int y = 20;

            System.out.println("x и y: " + x + " " + y);

            x = y * 2;
        }
        System.out.println("x - это " + x);
    }
}
