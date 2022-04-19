package com.veronika.graf.kons;

import java.util.ArrayList;
import java.util.List;

public class kal {
    public static void main(String[] args) {
        String num = "2 / ((2 + 0) * 1)>6";
        System.out.println(evaluate(num));
    }

    public static double evaluate(String expression) {
        List<String> strList = new ArrayList<>();

        for (String listElement : expression.trim().split(" ")) {
            strList.add(listElement);
            strList.add(" ");
        }
        strList.remove(strList.size() - 1);

        if (strList.indexOf("(") != -1) {
            for (int i = strList.indexOf("(") + 1; i < strList.size() - 1; i++) {

                String recursion = "";

                if (strList.get(i).equals("(")) {

                    for (int j = i; j < strList.lastIndexOf(")"); j++) {
                        recursion += strList.get(j);
                    }

                    String test = expression.substring(expression.indexOf("("), expression.lastIndexOf(")") + 1);
                    String testRecursion = String.valueOf(evaluate(recursion));

                    expression = expression.replace(test, testRecursion);

                    strList.removeAll(strList);

                    for (String newElement : expression.trim().split(" ")) {
                        strList.add(newElement);
                        strList.add(" ");
                    }

                }
                String recursion2 = "";
                if (strList.get(i).equals(")")) {

                    for (int j = strList.indexOf("(") + 1; j < strList.indexOf(")"); j++) {
                        recursion2 += strList.get(j);
                    }
                    String test2 = expression.substring(expression.indexOf("("), expression.lastIndexOf(")") + 1);
                    String testRecursion2 = String.valueOf(evaluate(recursion2));

                    expression = expression.replace(test2, testRecursion2);

                    for (String newElement : expression.trim().split(" ")) {
                        strList.add(newElement);
                        strList.add(" ");
                    }
                }
            }

            List<String> stringList2 = new ArrayList<>();

            for (String element : expression.trim().split(" ")) {
                stringList2.add(element);
            }
            while (stringList2.size() != 0) {

                Double result = 0d;

                if (stringList2.indexOf("/") != -1) {
                    int index = stringList2.indexOf("/");

                    result = Double.valueOf(stringList2.get(index - 1));

                    stringList2.add(index - 1, String.valueOf("*"));
                    stringList2.remove(index + 2);
                    stringList2.remove(index + 1);
                    stringList2.remove(index);

                } else if (stringList2.indexOf("*") != -1) {
                    int index = stringList2.indexOf("-");
                    int lastIndex = stringList2.lastIndexOf("-");
                    if (index == 0) {

                        result = Double.valueOf(stringList2.get(index + 1));
                        stringList2.add(0, String.valueOf(result));
                        stringList2.remove(2);
                        stringList2.remove(1);

                    } else if ((lastIndex - 2 > 0) && (stringList2.get(lastIndex - 2).equals("-"))) {
                        result = Double.valueOf(stringList2.get(lastIndex + 1)) + Double.valueOf(stringList2.get(lastIndex - 1));

                        stringList2.add(lastIndex - 1, String.valueOf(result));
                        stringList2.remove(lastIndex + 2);
                        stringList2.remove(lastIndex + 1);
                        stringList2.remove(lastIndex);
                    } else {

                        result = Double.valueOf(stringList2.get(index - 1)) - Double.valueOf(stringList2.get(index + 1));

                        stringList2.add(index - 1, String.valueOf(result));
                        stringList2.remove(index + 2);
                        stringList2.remove(index + 1);
                        stringList2.remove(index);
                    }
                }
                
            }
        }
    }
}

