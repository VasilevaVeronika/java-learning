package com.veronika.kata;

public enum Season {
    SUMMER("Лето"), WINTER("Зима"), AUTUMN("Осень"), SPRING("Весна"); // статические канстанты


    private final String translation;

    Season(String translation) {  //Конструктор становится автоматически статичным
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
