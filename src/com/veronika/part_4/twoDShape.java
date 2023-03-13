package com.veronika.part_4;

public class twoDShape {
    private double width;
    private double height;

    //методы доступа к закрытым переменным width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWight(double w) {
        width = w;
    }

    void setHeight(double h) {
        width = h;
    }

    void showDim() {
        System.out.println("Ширина и высота -  " + width + " и " + height);
    }
}

//Подкласс для треугольников,производный от класса twoDShape
class Triangel extends twoDShape {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;//исполь-е методов доступа,предо-ых суперклассом
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Shapes2 {
    public static void main(String[] args) {
        Triangel t1 = new Triangel();
        Triangel t2 = new Triangel();

        t1.setWight(4.0);
        t1.setHeight(4.0);
        t1.style = "контурный";

        t2.setWight(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";

        System.out.println("Информация о t1:");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь:" + t1.area());

        System.out.println();

        System.out.println("Информация о t2:");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь:" + t2.area());
    }
}