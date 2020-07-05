package com.epam.home.Task3;
//1. Сформировать строку, которая содержит 100 случайных значений от 0 до 1000,
// разделённых пробелами (2 способа - String и StringBuilder).
//2. В сформированной строке заменить все двузначные числа на -1. - RegEx - регулярные выражения

public class LineNumber {
    public static void main(String[] args) {

        int max = 100;
        String str = "";
        StringBuilder builder = new StringBuilder(str);

        while (max >= 0) {
            int random = (int) (Math.random() * 1000);
            builder.append(random + " ");
            max--;
        }

        System.out.println(builder);

        String sas = builder.toString();
        String sas1 = sas.replaceAll("\\s\\d{2}\\s", " -1 ");

        System.out.println(sas1);
    }
}
