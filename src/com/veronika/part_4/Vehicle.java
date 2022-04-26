package com.veronika.part_4;

public class Vehicle {
    int passenqers; //колличество пассажиров
    int fuelcap;    //емкость топ.бака
    int mpq;        //потребления топлива в милях на галлон
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();

        int range;

        //присваивание значений полям

        minivan.passenqers = 7;
        minivan.fuelcap = 16;
        minivan.mpq = 21;

        //расчёт дальности поездки с полным баком

        range = minivan.fuelcap * minivan.mpq;
        System.out.println("Мини-фургон может перевезти " + minivan.passenqers + " пассажиров на расстояние " + range + " миль");

    }
}
