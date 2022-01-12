package com.veronika.part_3;

public class MethodUseExample {

    public static void main(String[] args) {
        // Привет, сейчас я продемонстрирую, как работают методы!
        // метод print упрощает чтение и понимание кода за счет вынесения команды
        // System.out.println за основной метод

        // Сейчас мы посчитаем длину гипотинузы по формуле a^2 + b^2 = c^2
        double a = 1.;
        double b = 2.;
        print("hyp1 = " + hyp(a, b));
        print("hyp2 = " + hyp(a + 1, b + 2));

        // Без использования метода нам бы пришлось постоянно подставлять формулу,
        // каждый раз, когда мы хотил что-то посчитать
        double c1 = Math.sqrt(Math.abs(a) + Math.abs(b));
        double c2 = Math.sqrt(Math.abs(a + 1) + Math.abs(b + 2));
        print("c1 = " + c1 + " || c2 = " + c2);
    }

    private static void print(String input) {
        System.out.println(input);
    }

    private static double hyp(double a, double b) {
        double c;

        double sqrA = Math.abs(a);
        double sqrB = Math.abs(b);

        c = Math.sqrt(sqrA + sqrB);

        return c;
    }

}
