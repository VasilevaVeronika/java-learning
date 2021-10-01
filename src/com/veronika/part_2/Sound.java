package com.veronika.part_2;

// Упражнение 2.1

public class Sound {

    public static void main(String[] args) {
        double dist, distanceInMeters, dist2, distanceInMeters2;

        dist = 1100 * 7.2;

        distanceInMeters = 330 * 7.2;

        dist2 = 446 / 6;

        distanceInMeters2 = 136 / 2;

        System.out.println("Расстояние до места вспышки молнии составляет " + dist + " футов");

        System.out.println("Расстояние до места вспышки молнии составляет " + distanceInMeters + " метров");

        System.out.println("Расстояние до месторасположения горы " + dist2 + " футов");

        System.out.println("Расстояние до местоположения горы " + distanceInMeters2 + " метров");

    }

}
