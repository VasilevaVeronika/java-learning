package com.veronika.kata;


import static com.veronika.kata.Season.*;

public class Test {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season.getTranslation());

        switch (season) {
            case AUTUMN:
                System.out.println("automn!");
                break;
            case SPRING:
                System.out.println("spring!");
                break;
            case SUMMER:
                System.out.println("summer!");
        }
    }
    // System.out.println(season.getClass()); выдает тот класс объектом которого он яв-ся
    //System.out.println(season instanceof Enum); проверка объекта
    // System.out.println(season.getTranslation()); Перевод а русский
    //System.out.println(season.toString()); Изначальный вид
}