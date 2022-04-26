package com.veronika.part_4;

public class Vehicle {
    int passenqers; //колличество пассажиров
    int fuelcap;    //емкость топ.бака
    int mpq;        //потребления топлива в милях на галлон
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //присваивание значений полям

        minivan.passenqers = 7;
        minivan.fuelcap = 16;
        minivan.mpq = 21;

        sportscar.passenqers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpq = 12;

        //расчёт дальности поездки с полным баком

        range1 = minivan.fuelcap * minivan.mpq;
        range2 = sportscar.fuelcap * sportscar.mpq;

        System.out.println("Мини-фургон может перевезти " + minivan.passenqers + " пассажиров на расстояние " + range1 + " миль");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passenqers + " пассажиров на расстояние " + range2 + " миль");
    }
}
