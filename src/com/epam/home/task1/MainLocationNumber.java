package com.epam.home.task1;

import java.util.Scanner;
//Задано число. Определить, близко ли к нему другое введенное число (в пределах 10%)

public class MainLocationNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое  число и нажмите Enter");
        float number1 = scanner.nextFloat();

        System.out.println("Введите второе  чило и нажмите Enter");
        float number2 = scanner.nextFloat();

        locationNumber(number1, number2);

    }

    public static void locationNumber(float number1, float number2) {
        float onePercent = number1 / 100;
        float precentNumber2 = number2 / onePercent;

        if (90 <= precentNumber2 && precentNumber2 <= 110) {
            System.out.println("Введенное вами число "+number2+ " находится в пределах 10% от вашего числа " +number1);
        } else {
            System.out.println("Введенное вами число "+number2+ " не в ходить в диапазон 10% от вашего числа "+number1);
        }


    }
}
