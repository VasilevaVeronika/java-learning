package com.veronika.part_3;

public class HelpJava3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;

        for (; ; ) {
            do {
                String str = new String("Справка:\n_1) if_2) witch_3) for_4) while_5) do-while_6) break_7) continue\n");

                for(String retval : str.split("_")){
                    System.out.println(retval);
                }
                System.out.println("Выберите номер:\n");
                System.out.println("(Чтобы выйти нажмите - q)");

                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');}
                while (choice < '1' | choice > '7') ;

                if (choice == 'q') break;

                System.out.println("\n");

                switch (choice) {
                    case '1':
                        String str = new String("Инструкция if:\n_if(условие) инструкция;_else инструкция;");

                        for(String retval : str.split("_")){
                            System.out.println(retval);
                        }
                        break;
                    case '2':
                        String str1 = new String("Инструкция switch:\n_switch(выражение) {_case константа:_последовательность инструкции break;_//..._}");

                        for(String retval : str1.split("_")){
                            System.out.println(retval);
                        }
                        break;
                    case '3':
                        String str2 = new String("Цикл for:\n_for(инициализация; условие; итерация)_инструкция;");

                        for(String retval : str2.split("_")){
                            System.out.println(retval);
                        }
                        break;
                    case '4':
                        String str4 = new String("Цикл while:\n_while(условие) инструкция;");

                        for(String retval : str4.split("_")){
                            System.out.println(retval);
                        }
                        break;
                    case '5':
                        String str5 = new String("Цикл do-while:\n_do {_инструкция_} while(условие);");

                        for(String retval : str5.split("_")){
                            System.out.println(retval);
                        }
                        break;
                    case '6':
                        System.out.println("Инструкция break:\n");
                        System.out.println("break; или break метка;");
                        break;
                    case '7':
                        System.out.println("Инструкция coutinue:\n");
                        System.out.println("coutinue; или coutinue метка;");
                        break;
                }
                System.out.println("");
            }
        }
    }
