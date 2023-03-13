package com.veronika;

public class inheritance {
    double width;
    double height;

    void showDim() {
        System.out.println("Ширина и высота -  " + width + " и " + height);
    }
}

class Triangel extends inheritance {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangel t1 = new Triangel();
        Triangel t2 = new Triangel();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "закрашенный";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "контурный";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println(" Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());
    }
}