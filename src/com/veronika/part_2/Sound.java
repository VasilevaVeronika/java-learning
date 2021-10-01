package com.veronika.part_2;

// Упражнение 2.1

public class Sound {

    public static void main(String[] args) {

        double distanceToLightInFeet, distanceToLightInMeters;
        double distanceToSoundFeet, distanceSoundToInMeters;

        distanceToLightInFeet = 1100 * 7.2;
        distanceToLightInMeters = 330 * 7.2;

        distanceToSoundFeet = 1100 * 5.97 / 2;
        distanceSoundToInMeters = 335 * 5.97 / 2;

        System.out.println("Расстояние до места вспышки молнии составляет " + distanceToLightInFeet + " футов");
        System.out.println("Расстояние до места вспышки молнии составляет " + distanceToLightInMeters + " метров");

        System.out.println("Расстояние до месторасположения горы " + distanceToSoundFeet + " футов");
        System.out.println("Расстояние до месторасположения горы " + distanceSoundToInMeters + " метров");

    }

}
