package com.veronika.part_2;

public class RelLogOps {

    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
<<<<<<< Updated upstream
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("Это не будет выполнено");
        if(i >= j) System.out.println("Это не будет выполнено");
        if(i > j) System.out.println("Это не будет выполнено");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("Это не будет выполнено");
        if(!(b1 & b2)) System.out.println("!(b1 & b2): true");
        if(b1 | b2) System.out.println("b1 | b2: true");
        if(b1 ^ b2) System.out.println("b1 ^ b2");
=======
        System.out.println("i < j ");
        System.out.print("i <= j ");
        System.out.print(" i != j ");

        b1 = true;
        b2 = false;
        System.out.println("!(b1 & b2): true");
        System.out.println("b1 | b2: true");
        System.out.println("b1 ^ b2: true");

>>>>>>> Stashed changes
    }
}