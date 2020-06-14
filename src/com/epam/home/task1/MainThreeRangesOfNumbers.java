package com.epam.home.task1;

import java.util.Scanner;

/*2. Даны два числа, задающие три диапазона чисел.
 Определить, какому диапазону принадлежит введенное пользователем число.
*/
public class MainThreeRangesOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое челое число и нажмите Enter");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе челое чило и нажмите Enter");
        int number2 = scanner.nextInt();

        definesARange(number1, number2);

    }

    private static void definesARange(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("Число " + number2 + " принадлежит диапазону от - бесконечности до " + number2);
            System.out.println("Число " + number1 + " принадлежит диапазону от " + number2 + " до " + number1);
        } else if (number1 < number2) {
            System.out.println("Число " + number1 + " принадлежит диапазону от - бесконечности до " + number1);
            System.out.println("Число " + number2 + " принадлежит диапазону от " + number1 + " до " + number2);
        } else if (number1 == number2) {
            System.out.println("Вы ввели одинаковые числа. Диапозон введенных чисел от - бесконечности до " + number1);

        }


    }

}
