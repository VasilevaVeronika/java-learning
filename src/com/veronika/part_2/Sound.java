package com.veronika.part_2;

// Упражнение 2.1

public class Sound {

    public static void main(String[] args) {
        double dist, distanceInMeters;

        double soundInFeet, soundInMeters;

        dist = 1100 * 7.2;

        distanceInMeters = 330 * 7.2;

        soundInFeet = 10.210 * 181.97 / 2;

        soundInMeters = 335 * 5.97;

        System.out.println("Расстояние до места вспышки молнии составляет " + dist + " футов");

        System.out.println("Расстояние до места вспышки молнии составляет " + distanceInMeters + " метров");

        System.out.println("Расстояние до месторасположения горы " + soundInFeet + " футов");

        System.out.println("Расстояние до месторасположения горы " + soundInMeters + " метров");

    }

}
