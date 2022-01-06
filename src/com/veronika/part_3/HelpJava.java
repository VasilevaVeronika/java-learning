package com.veronika.part_3;

public class HelpJava {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;

        System.out.println("Справка :");
        System.out.println(" 1) if");
        System.out.println(" 2) switch");
        System.out.println(" 3) какая-то фигня");
        System.out.println(" 4) <3");
        System.out.println("Выберите: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкции");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Инструкция:\n");
                System.out.println("ихихихихихихихихиххихи");
                System.out.println("А я же говорила что тут какая-то фигня.");
                break;
            case '4':
                System.out.println("Инструкция <3:\n");
                System.out.println("Гольцов Роман Евгеньевич");
                System.out.println("Вас беспокоят из агенства счастливые отношения.");
                System.out.println("Вот ваше письмо:\n");

                for (byte i = 0; i < 10; i++) {
                    System.out.println(".");
                }

                System.out.println("Подождите минутку, письмо затерялось.");

                for (byte i = 0; i < 5; i++) {
                    System.out.println(".");
                }

                System.out.println("I love you <3");
                break;
            default:
                System.out.print("Запрос не найден.");
        }
    }
}
